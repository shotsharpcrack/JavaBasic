package oop;

public class Example2 {
	private static class Base {
		private Base() {
			System.out.println("Base");
		}
		
		public Base(String str) {
			System.out.println("Base : " + str);
		}
	}
	
	private static class Sub extends Base {
		public Sub(String str) {
			System.out.println("Sub : " + str);
		}
	}
	
	public static void main(String[] args) {
		new Sub("ABC");
	}
}
