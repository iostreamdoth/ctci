package chap1;

public class problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		issubstring("waterbottle", "erbottlewat");
	}
	public static void issubstring(String str,String strtoValidate)
	{
		int iscircle = (strtoValidate + strtoValidate).indexOf(str);
		if(iscircle>=0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}
