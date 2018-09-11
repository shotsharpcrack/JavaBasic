// package indicate where the file located in the project hierarchy
package oop;

// 1. only 1 public class is allowed in each java file
// 2. but private / default classes are allowed more
// 3. the public class should have same name as the file name
// 4. in java, class name should defined with Capital Letter Start
public class HelloWorld {
	
	// 1. static fields are class level
	//    can be visit directly without creating new object
	public static int x = 45;
	
	// 2. non-static fields are object level,
	//    to visit non-static field, need to create an object
	// 3. variables name start with lower
	public int y = 45;
	
	// 1. static functions are class level
	// 2. void : return type, nothing 
	public static void main(String args[]) {
		System.out.println(x);
		
		HelloWorld hw = new HelloWorld();
		
		System.out.println(hw.y);
		
		System.out.println("Hello World");
		
		hw.test("AA");
		
		// Static functions / field, should be called from class directly
		// can be called from object, but not suggested
		foo();
		hw.foo();
		HelloWorld.foo();
		
		hw.test("aa");

	}
	
	// non-static function is object level
	public void test(String x) {
		System.out.println("test");
		foo();
	}
	
	public static void foo() {
		System.out.println("foo");
	}
}



