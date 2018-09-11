package oop;

// a class defined inside another class
// inner class
public class OuterClass implements Cloneable{

	private String name;
	private static int age;
	

	// static inner class can be seen as an outer class
	// only able to access static fields from outer class
	public static class InnerClass1 {
		private String color;
		public InnerClass1() {
			color = "Blue";
		}
		public void test() {
			System.out.println(color);
//			System.out.println(name);
			System.out.println(age);
		}
	}	
	
	// non-static inner class can only be initiated after initiate the outer class
	// able to access both static & non-static fields from outer class
	public class InnerClass2 {
		private String direction;
		public InnerClass2() {
			direction = "West";
		}
		public void test() {
			System.out.println(name);
			System.out.println(age);
		}
	}

}