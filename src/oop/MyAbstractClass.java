package oop;

public abstract class MyAbstractClass {
	private String name;
	private int age;
	
	public MyAbstractClass() {
		System.out.println("In MyAbstractClass");
	}
	
	public void printName() {
		System.out.println("name: " + name);
	}
	
	// use abstract in front of a function make it abstract
	// abstract function cannot have function body
	// abstract function can only exist in abstract class / interface
	public abstract void test();
}
