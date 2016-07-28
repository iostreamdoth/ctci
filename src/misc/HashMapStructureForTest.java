package misc;
import java.util.HashMap;
  


public class HashMapStructureForTest {
	transient int[] elementData;
	
	public HashMapStructureForTest() {
		// TODO Auto-generated constructor stub

		for(int i=0;i<100;i+=5)
		{
			elementData[i] =  i;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> map = new  HashMap<String,String>();
		map.put("A","a");
		map.put("Z","z");
		map.put("z","Z");
		map.put("B","b");
		map.put("C","c");
		map.put("D","D");
		map.put("e","D");
		map.put("f","D");
		map.put("G","D");
		map.put("h","D");
		map.put("I","D");
		map.put("j","D");
		map.put("K","D");
		map.put("L","D");
		map.put("M","D");
		map.put("n","D");
		map.put("N","D");
		map.put("E","D");
		map.put("D","D");
		map.put("O","D");
		map.put("p","D");
		map.put("q","D");
		map.put("P","D");
		
		System.out.println(map.get("A"));
		
		HashMapStructureForTest o = new HashMapStructureForTest();
		
		
		
		for(Integer i =0;i<100;i++)
		{
			System.out.println(i.hashCode());
		}
		
		
	}

}
