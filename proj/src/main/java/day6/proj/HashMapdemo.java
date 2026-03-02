package day6.proj;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class HashMapdemo {
	public static void main(String[] args) {
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		hm.put(1, "xyz");
		hm.put(5, "hh");
		hm.put(8, "kk");
		
		System.out.println("hm");
		for(Integer key:hm.keySet())
			System.out.println(key);
		for(String val:hm.values())
			System.out.println(val);
		
		System.out.println(hm.containsKey(5));
		System.out.println(hm.containsValue("xyz"));
		Set<Entry<Integer,String>> entrySet= hm.entrySet();
		System.out.println(entrySet);
		Iterator<Entry<Integer,String>> itr=entrySet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	TreeMap<Integer,String> ft= new TreeMap<>();
	ft.put(1,"pull");
	
	
	}

}
