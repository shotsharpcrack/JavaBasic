package oop;

public class Example4 {
	private static class Base {
		int x = 3;
		
		public Base() {
			foo(x);
		}
		
		private void foo(int x) {
			System.out.println(x + " in base");
		}
	}
	
	private static class Sub extends Base {
		int x = 5;
		
		public Sub() {
			foo(x);
		}
		
		public void foo(int x) {
			System.out.println(x + " in sub");
		}
	}
	
	public static void main(String args[]) {
		new Sub();
	}
}
