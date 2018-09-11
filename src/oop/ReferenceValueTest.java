package oop;

public class ReferenceValueTest {
	public static void main(String args[]) {
		Person p = new Person("G", 2);
		p.setName("Robert");
		p.setAge(12);
		
		changePersonName(p);
		System.out.println(p.getName());
		
		// primitive types are passed by value
		int i = 0;
		i = changeI(i);
		short s = 2;
		boolean b = false;
		changeInt(i);
		System.out.println(i);
		
		String str = "kkk";
		changeString(str);
		System.out.println(str);
		
		Person p1 = new Person();
		Person p2 = p1;
	}
	
	public static int changeI(int x) {
		x = 5;
		return x;
	}
	
	protected static void changePersonName(Person p) {
		p = new Person();
		p.setName("Greg");
	}
	
	private static void changeInt(int x) {
		x = 5;
	}
	
	static void changeString(String str) {
		str = "abc";
	}
}
