package com.naughton;

import java.util.HashMap;
import java.util.Map;

public class MapMemory {
	static short mapSize = 10000;

	public static void main(String[] args) {
		Map<Integer, String> stringMap = new HashMap<Integer, String>();
		System.out.println("map size:"+stringMap.size());
		for (int index = 0; index < mapSize; index+=2) {
			stringMap.put(index, new String("Cat:" + index));
			stringMap.put(index+1, new String("Dog:" + index+1));
			stringMap.put(index+2, new String("Whale:" + index+2));
		}
		System.out.println("map size:"+stringMap.size());
		while (true) {
		}
	}

}
