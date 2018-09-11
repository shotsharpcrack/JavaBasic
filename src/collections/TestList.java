package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import collections.beans.Pistol;
import collections.beans.Rifle;

public class TestList {

	public void testArray() {
		int[] a1 = new int[2];
		int[] a2 = {1,2,3,4};
		int a3[] = new int[2];
		
	}
	
	public void testArrayList() {
		List x = new ArrayList();
		
		
		ArrayList aa = new ArrayList();

		x.add(1);
		x.add("Str");
		
		List<Integer> y = new ArrayList<Integer>();
		y.add(2);
		
		Vector v = new Vector();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		LinkedList<Integer> ll2 = new LinkedList();
		
	}
	
	public static void test1(Integer x) {
		
	}
	public static void test2(int y) {
		
	}
	
	
	public static void sort(List l) {
		Collections.sort(l);
	}
	
	public static void main(String[] args) {
		List<Rifle> rifleList = new ArrayList();
		Rifle r1 = new Rifle("Ak", 500, true);
		Rifle r2 = new Rifle("98k", 1600, false);
		Rifle r3 = new Rifle("Mp5", 200, true);
		rifleList.add(r1);
		rifleList.add(r2);
		rifleList.add(r3);
		
		// small -> large
		Collections.sort(rifleList);
		
		for(Rifle r : rifleList) {
			System.out.println(r);
		}
		
		System.out.println("***********************");
		List<Pistol> pistolList = new ArrayList();
		Pistol p1 = new Pistol("Ak", 500, true);
		Pistol p2 = new Pistol("98k", 1600, false);
		Pistol p3 = new Pistol("Mp5", 200, true);
		pistolList.add(p1);
		pistolList.add(p2);
		pistolList.add(p3);
		
		// anonymous implementation
		Comparator<Pistol> pistolComparator = new Comparator<Pistol>() {
			@Override
			public int compare(Pistol p1, Pistol p2) {
				return p1.getRange() - p2.getRange();
			}
		};
		
		Comparator objComparator = new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				return o1.toString().compareTo(o2.toString());
			}
			
		};
		
		// small -> large
		Collections.sort(pistolList, pistolComparator);
		
		
		for(Pistol p : pistolList) {
			System.out.println(p);
		}
	}

}
