package oop;

public class Example3 {

	private static class Base {
		public void foo() {
			System.out.println("Base foo");
		}
		
		public static void bar() {
			System.out.println("Base bar");
		}
	}
	
	private static class Sub extends Base {
		public void foo() {
			System.out.println("Sub foo");
		}
		
		public static void bar() {
			System.out.println("Sub bar");
		}
	}
	
	
	// static function will not get overridden
	// private function will not get overridden
	public static void main(String args[]) {
		Base b = new Sub();
		b.foo();	// overridden, non-static public function
		b.bar();	// Base.bar();
		Base.bar();
	}
}
