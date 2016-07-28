package misc;

import java.util.ArrayList;
import java.util.List;

public class MyHashTable<K,V> {
	List<K> lstKey;
	List<V> lstValue;
	MyHashTable()
	{
		lstKey = new ArrayList<K>();
		lstValue = new ArrayList<V>();
	}
	public V get(K key)
	{
		for(int i=0;i<lstKey.size();i++)
		{
			//Here you can implement any hash function for fetching the value
			if(lstKey.get(i).equals(key))
			{
				return lstValue.get(i);
			}
		}
		return null;
	}
	public void put(K key,V value)
	{
		//Here you can implement any hash function for storing the value.
		lstKey.add(key);
		lstValue.add(value);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyHashTable<Integer, String> mhyHashTable = new MyHashTable<Integer,String>();
		mhyHashTable.put(1,"1");
		mhyHashTable.put(2,"2");
		mhyHashTable.put(3,"3");
		mhyHashTable.put(4,"4");
		mhyHashTable.put(5,"5");
		mhyHashTable.put(6,"6");
		mhyHashTable.put(7,"7");
		mhyHashTable.put(8,"8");
		mhyHashTable.put(9,"9");
		mhyHashTable.put(10,"10");
		mhyHashTable.put(11,"11");
		mhyHashTable.put(12,"12");
		mhyHashTable.put(13,"13");
		
		System.out.println(mhyHashTable.get(4));
		
		
		
	}

}
