package Learncollection;

import java.util.TreeMap;


public class MapExample4 {
	public static void main(String[] args) {
		
		TreeMap<Integer, String> map= new TreeMap<Integer, String>();
		map.put(101, "A");
		map.put(102, "B");
		map.put(103, "C");
		map.put(113, "D");
		map.put(130, "E");
		map.put(150, "F");
		
		System.out.println(map);
		System.out.println("=============================");
		
		System.out.println(map.keySet());
		System.out.println(map.higherKey(102));
		System.out.println(map.higherEntry(113));// returns key and value both
		
		System.out.println("==================================");
		System.out.println(map.lowerKey(113));
		System.out.println(map.lowerEntry(113));
		
	System.out.println("================================");
	System.out.println(map.ceilingKey(103));
	System.out.println(map.ceilingEntry(151));
	
	System.out.println("==================================");
	System.out.println(map.floorKey(100));
	System.out.println(map.floorEntry(103));
	
	System.out.println("=====================================");
	System.out.println(map.headMap(130,true));
	System.out.println(map.tailMap(103));
	
	System.out.println("======================================");
	System.out.println(map.subMap(102,true,113,false));
	System.out.println("=====================================");
	
	System.out.println(map.firstKey());
	System.out.println(map.firstEntry());
	
	System.out.println(map.lastKey());
	System.out.println(map.lastEntry());
	
	System.out.println("======================================");
	System.out.println(map.pollFirstEntry());
	System.out.println(map);
	System.out.println(map.pollLastEntry());// remove
	System.out.println(map);

	}

}
