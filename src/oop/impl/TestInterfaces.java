package oop.impl;

import oop.MyInterface;
import oop.OuterClass;
import oop.Person;

public class TestInterfaces {
	public static void main(String args[]) {
		MyInterface mi1 = new MyInterfaceImpl1();
		MyInterface mi2 = new MyInterfaceImpl2();
		MyInterface mi3 = new MyInterfaceImpl3();
		
//		MyInterfaceImpl1 mii1 = (MyInterfaceImpl1) mi1;
//		mii1.work();
		
		callTest(mi1);
		callTest(mi2);
		callTest(mi3);
	}
	
	public static void callTest(MyInterface mi) {
		mi.test();
//		mi.foo();
//		mi.bar();
//		mi.work();
		
		OuterClass oc = new OuterClass();
		Person p = new Person();
		
	}
}
