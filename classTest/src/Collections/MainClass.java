package Collections;

import java.util.ArrayList;
import java.util.HashMap;

public class MainClass {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		System.out.println("list.size :"+list.size());
		
		// add data
		list.add("Hello");
		list.add("Java");
		list.add("World");
		System.out.println("list.size :"+list.size());
		System.out.println("list :"+list);
		
		list.add(2, "Programming"); // add
		System.out.println("list :"+list);
		
		list.set(1,"C"); // change
		System.out.println("list :"+list);

		// data extraction
		String str = list.get(2);
		System.out.println("list.get(2) :"+str);
		
		// data deletion
		str = list.remove(2);
		System.out.println("list.remove(2) :" + str);
		System.out.println("list :" + list);
			
		// delete all data
		list.clear();
		System.out.println("list :"+list);

		boolean b = list.isEmpty();
		System.out.println("list.isEmpty() :" + b);
		
		// // // // // // // // // // // //
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		System.out.println("map.size() :" + map.size());
		
		// add data
		map.put(5, "Hello");
		map.put(6, "Java");
		map.put(7, "World");
		System.out.println("map :" + map);
		System.out.println("map.size() :" + map.size());
		
		// change data
		map.put(6, "C");
		System.out.println("map :" + map);

		// extract data
		str = map.get(5);
		System.out.println("map.get(5) :" + str);
		
		// remove data
		map.remove(6);
		System.out.println("map :" + map);

		b = map.containsKey(7);
		System.out.println("map.containsKey(7) :" + b);
		
		b = map.containsValue("World");
		System.out.println("map.containsValue(\"World\") :" + b);
		
		map.clear();
		System.out.println("map :" + map);
		
		System.out.println(map.isEmpty());

		
	}
}
