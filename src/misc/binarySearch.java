package misc;

public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr ={1,1,1,1,1,3,3,3,3,3,4,4,4,7,7,7,7,10,10,10,10};
		
		//System.out.println(findnumberofpeople(arr,1));
		int[] res = mergeArrays(arr,arr);
		
	}
	
	
	static int[] mergeArrays(int[] a, int[] b) {
	    int[] c = new int[a.length+b.length];
	    int aCount = 0;
	    int bCount = 0;
	    int cCount = 0;
	    
	    while(aCount<a.length && bCount<b.length)
	    {
	    	if(a[aCount] < b[bCount])
	    	{
	    		c[cCount++] = a[aCount++];
	    	}
	    	else
	        {
	            c[cCount++] = b[bCount++];
	        }
	    }
	    return c;
	}



public static int findnumberofpeople(int[] arr,int n)
{
    //{1,1,1,1,1,3,3,3,3,3,4,4,4,7,7,7,7,10,10,10,10}
    int len = arr.length;
    int start = 0;
    int last = len;
    int mid ;
    //int foundIndex;
    while(true)
    {
        mid = (start + last)/2;
        if(arr[mid] == n)
        {
            break;
        }
        else if(arr[mid] > n)
        {
            last = mid-1;
        } 
        else
        {
            start = mid+1;        
        }
    }
    System.out.println(mid);
    int counter1 = mid;
    int counter2 = mid;//+1;
    System.out.println(counter1);
    System.out.println(counter2);
    try{
    while(arr[++counter2] == n);
    }catch(Exception ex)
    {
    	
    }
    try{
    while(arr[--counter1] == n); 
    }catch(Exception ex)
    {
    	
    }
    System.out.println(counter1);
    System.out.println(counter2);
    
    
    return counter2-counter1 -1;
    
    
    
}
}
