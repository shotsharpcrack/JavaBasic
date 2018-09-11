package oop;

public class StringPool {
	public static void main(String args[]) {
		String s1 = "xyz";
		String s2 = "xyz";
		String s3 = new String("xyz");
		String s4 = new String("xyz");
		
		String s5 = s3.intern();
		
		System.out.println(s1 == s2);	// true
		System.out.println(s2 == s3);	// false
		System.out.println(s3 == s4);	// false
		System.out.println(s1 == s5);	// true
		
		String s6 = new String("kkk");
		// intern will try to return the String from string pool with same value
		// if cannot be found, create the string in pool, and return it.
		String s7 = s6.intern();
		String s8 = "kkk";
		System.out.println(s7 == s8);	// true
		System.out.println(s6 == s8);	// false
	}
}
