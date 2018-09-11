package collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import collections.beans.Pistol;
import collections.beans.Rifle;

public class TestMap {

	public static void main(String[] args) {
		// key value pair
		// no dup key, value are ok
		Map<String, String> inm = new HashMap<String, String>();
		inm.put("Basddfaf", "Mike");
		inm.put("Abrsfh", "Mike_AAA");
		inm.put("Cmr245246", "Alan");
		inm.put(null, "A");
		
//		System.out.println(inm);
		
		testHashSet();
//		testHashtable();
//		testTreeMap();
//		testEquals();
	}
	
	public static void testHashSet() {
		Set<Rifle> s = new HashSet();
		Rifle r1 = new Rifle("AK", 400, true);
		Rifle r2 = new Rifle("AK", 400, true);
		Rifle r3 = new Rifle("mp5", 50, true);
		s.add(r1);
		s.add(r2);
		s.add(r3);
		
		List<Rifle> rl = Arrays.asList(r1, r2, r3);
		
		Map<Rifle, Integer> hm = new HashMap();
		for(Rifle r : rl) {
			if(hm.containsKey(r)) {
				hm.put(r, hm.get(r) + 1);
			} else {
				hm.put(r, 1);
			}
		}
		System.out.println(hm);
		
		System.out.println(s);
	}
	
	public static void testHashtable() {
		Map<String, String> ht = new Hashtable();
		ht.put("A", "aa");
		ht.put(null, "AB");
		System.out.println(ht);
	}
	
	public static void testEquals2() {
		Pistol p1 = new Pistol();
		Pistol p2 = new Pistol();
		System.out.println(p1.equals(p1));
	}
	
	public static void testEquals() {
		Rifle r1 = new Rifle("AK", 400, true);
		Rifle r2 = new Rifle("AK", 400, true);
		Rifle r3 = new Rifle("mp5", 50, true);
		System.out.println("****** hashCode() *********");
		System.out.println(r1.hashCode());
		System.out.println(r2.hashCode());
		System.out.println(r3.hashCode());
		
		System.out.println("****** equals() *********");
		System.out.println(r1.equals(r2));
		System.out.println(r2.equals(r3));
		
		System.out.println("********* == *************");
		System.out.println(r1 == r2);
		System.out.println(r2 == r3);
	}
	
	public static void testTreeMap() {
		Rifle r1 = new Rifle("AK", 4002, true);
		Rifle r2 = new Rifle("AK47", 400, true);
		Rifle r3 = new Rifle("mp5", 50, true);
		Map<Rifle, String> tm = new TreeMap();
		
		System.out.println("****** hashCode() *********");
		System.out.println(r1.hashCode());
		System.out.println(r2.hashCode());
		System.out.println(r3.hashCode());
		
		System.out.println("****** equals() *********");
		System.out.println(r1.equals(r2));
		System.out.println(r2.equals(r3));
		
		tm.put(r1, "A");
		tm.put(r2, "A");
		tm.put(r3, "A");
		
		System.out.println(tm.size());
		System.out.println(tm);
		
		
		// anonymous implementation
		Comparator<Pistol> pistolComparator = new Comparator<Pistol>() {
			@Override
			public int compare(Pistol p1, Pistol p2) {
				return p1.getRange() - p2.getRange();
			}
		};
		Pistol p1 = new Pistol();
		Pistol p2 = new Pistol();
		Map<Pistol, String> tm2 = new TreeMap(pistolComparator);
		tm2.put(p1, "A");
		tm2.put(p2, "B");
		System.out.println(tm2);
	}
}
