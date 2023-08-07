package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(101,"Anil");
		map.put(201,"Brij");
		map.put(301,"Krish");
		map.put(401,"Tanmay");
		map.put(501,"Prabha");
		
		System.out.println(map);
		System.out.println(map.get(101));
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
