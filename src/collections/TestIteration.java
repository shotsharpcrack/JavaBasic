package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestIteration {

	public static void testIterationList() {
		List<Integer> l = new ArrayList();
		l.add(5);
		l.add(2);
		l.add(34);
		
		// 1. traditional for loop
		for(int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		System.out.println("******************");
		// 2. for each
		for(int i : l) {
			System.out.println(i);
		}
		System.out.println("******************");
		// 3. iterator
		Iterator<Integer> i = l.iterator();
		// hasNext only return true/false, but not move the iterator
		while(i.hasNext()) {
			// next will move the iterator
			int x = i.next();
			System.out.println(x);
		}
		// 4. foreach, using lambda expression
	}
	
	public static void testIterationSet() {
		Set<Integer> l = new HashSet();
		l.add(5);
		l.add(2);
		l.add(34);
		
		// 2. use for each
		for(int x : l) {
			System.out.println(x);
		}
		System.out.println("*********************");
		// 3. iterator
		Iterator<Integer> i = l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		// 4. foreach, with lambda
	}
	
	public static void testIterationMap() {
		Map<String, String> inm = new HashMap<String, String>();
		inm.put("Basddfaf", "Mike");
		inm.put("Abrsfh", "Mike_AAA");
		inm.put("Cmr245246", "Alan");
		
		for(Map.Entry<String, String> e : inm.entrySet()) {
			System.out.println(e.getKey() + "  ---   " + e.getValue());
		}
		System.out.println("+++++++++++++++++++++++++");
		for(String s : inm.keySet()) {
			System.out.println(s + "  ===  " + inm.get(s));
		}
		System.out.println("+++++++++++++++++++++++++");
		Iterator<String> i = inm.keySet().iterator();
		while(i.hasNext()) {
			String key = i.next();
			System.out.println(key + "  ___  " + inm.get(key));
		}
	}
	
	public static void testIterator() {
		List<String> llist = new ArrayList();
		llist.add("a");
		llist.add("b");
		llist.add("c");
		
		Iterator<String> i = llist.iterator();
		while(i.hasNext()) {
			String x = i.next();
//			llist.remove("c");
			i.remove();
			System.out.println(x);
		}
		System.out.println(llist);
		
		// public static
//		Collections.shuffle();
		// sort, unmodifiableList, unmodifiableMap/set.
		Arrays.asList(1, 2 , 3);
		// util class.
		
//		for(int i = 0; i < l.size(); i++) {
//			System.out.println(l.get(i));
//			l.add("D");
//		}
	}
	
	
	public static void main(String[] args) {
//		testIterationList();
//		testIterationMap();
		testIterator();
	}

}
