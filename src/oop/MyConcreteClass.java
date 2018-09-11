package oop;

// "extends" for class extending
// "implements" for interface implementation
public class MyConcreteClass extends MyAbstractClass implements MyInterface, MyInterface2{

	public MyConcreteClass() {
		System.out.println("In MyConcreteClass");
	}
	
	// While test() is actually been implemented?
	@Override
	public void test() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAbstractClass mac = new MyConcreteClass();
		MyInterface mi = new MyConcreteClass();
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

}
