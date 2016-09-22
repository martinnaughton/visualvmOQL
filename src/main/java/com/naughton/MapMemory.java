package com.naughton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMemory {
	static short mapSize = 10000;

	public static void main(String[] args) {
		List<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();
		Map<Integer, String> stringMap = new HashMap<Integer, String>();
		System.out.println("map size:"+stringMap.size());
		for (int index = 0; index < mapSize; index+=2) {
			stringMap.put(index, new String("Cat:" + index));
			stringMap.put(index+1, new String("Dog:" + index+1));
			stringMap.put(index+2, new String("Whale:" + index+2));
		}
		System.out.println("map size:"+stringMap.size());
		storeAMapInArrayList(list);
		while (true) {
		}
	}

	private static void storeAMapInArrayList(List<HashMap<String, String>> list) {
		HashMap<String, String> stringMap = new HashMap<String, String>();
		stringMap.put("DogKey", "DogValue");
		
		HashMap<String, String> stringMap2 = new HashMap<String, String>();
		stringMap2.put("DogKey2", "DogValue");
		
		HashMap<String, String> stringMap3 = new HashMap<String, String>();
		stringMap3.put("DogKey3", "DogValue");
		
		HashMap<String, String> stringMap4 = new HashMap<String, String>();
		stringMap4.put("DogKey4", "DogValue");
		
		list.add(stringMap);
		list.add(stringMap2);
		list.add(stringMap3);
		list.add(stringMap4);
	}

}
