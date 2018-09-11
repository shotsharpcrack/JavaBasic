package collections.beans;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class MyComparator implements Comparator, Comparable {

	@Override
	public int compareTo(Object o) {
		return 0;
	}

	@Override
	public int compare(Object o1, Object o2) {
		return 0;
	}

	
	public static void main(String args[]) {
		MyComparator mc1 = new MyComparator();
		MyComparator mc2 = new MyComparator();
		MyComparator mc3 = new MyComparator();
		Set<MyComparator> ts = new TreeSet();
		ts.add(mc1);
		ts.add(mc2);
		ts.add(mc3);
		System.out.println(ts);
	}
}
