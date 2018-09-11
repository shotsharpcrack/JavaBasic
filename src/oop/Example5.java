package oop;

public class Example5 {
	private static class Base {
		String name = null;
		
		public Base() {
			setName();
			System.out.println(name);
		}
		
		public void setName() {
			name = "Base";
		}
	}
	
	private static class Sub extends Base {
		String name = "kkk";
		public void setName() {
			name = "Sub";
		}
	}
	
	public static void main(String args[]) {
		Sub sub = new Sub();
		System.out.println(sub.name);
	}
}
