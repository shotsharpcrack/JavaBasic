package oop;

public class FinalInitialize {

	// final field has to be initialized
	
	// non-static field, object level
	// 1, define the value with the reference
	public final String x = "adbc";
	// 2, provide the final value in constructor
	public final String y;
	
	// static field, class level
	// 1. provide value when define
	public static final String m = "abc";
	
	// 2. provide value in static block
	public static final String n;
	
	
	public FinalInitialize () {
		y = "abc";
	}
	
	public FinalInitialize (int x) {
		y = "abcdd";
	}
	
	// static block is a class level block, which will be executed before the class is loaded
	static {
		n = "abc";
		System.out.println("Class is loaded");
	}
	
	
	public static void main(String[] args) {

	}

}
