package oop;

public class Sub extends Parent {
	public Sub() {
		super(2);
		System.out.println("Default sub");
	}
	
	
	
	public Sub(int x) {
		System.out.println("int sub");
	}
	
	// public non-static function will be overridden
	public void work() {
		System.out.println("Sub work");
	}
	
	public void foo() {
		System.out.println("sub foo");
	}
	

	public static void main(String ars[]) {
		Parent p1 = new Parent();
		System.out.println("************");
		Parent p2 = new Parent(1);
		System.out.println("************");
		Sub s1 = new Sub();
		System.out.println("************");
		Sub s2 = new Sub(1);
		System.out.println("************");
		p1.work();
		System.out.println("************");
		s1.work();
		System.out.println("************");
		
		// upcasting
		Parent p3 = new Sub();
		p3.work();
		
		Sub s3 = (Sub)p1;
		System.out.println("Done");
	}
}
