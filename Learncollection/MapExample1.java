package Learncollection;

import java.util.HashMap;
import java.util.Set;

public class MapExample1 {
	public static void main(String[] args) {
		
		// In maps we get everything in key,value pair 
		// <K,V>
		// Maps: HashMap, LinkedHashMap, TreeMap
		// values can be duplicates
		// key cannot be duplicate
		HashMap<Integer, String> student=new HashMap<Integer, String>();
		
		student.put(101, "Shriya");
		student.put(102, "Amit");
		student.put(103, "Muskan");
		student.put(null, null);
		student.put(102, "Isha");// will be override
		
		System.out.println(student);
		
		System.out.println(student.get(90));
		System.out.println(student.getOrDefault(1011, "Hello"));
		System.out.println(student.getOrDefault(101, "Hello"));
		
		System.out.println("======================================");
		System.out.println(student.remove(102));
		System.out.println(student);
		
		System.out.println("====================================");
		// Its return type is set
		System.out.println(student.keySet());
		System.out.println(student.values());
		
		System.out.println("========================================");
		
		Set<Integer> keys= student.keySet();
		for(Integer k:keys)
		{
			System.out.println(k+" "+student.get(k));
		}
		System.out.println("===============================================");
		
		System.out.println(student.containsKey(103));
		System.out.println(student.containsValue("Pooja"));
	}

}
