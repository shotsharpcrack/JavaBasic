package oop;

public class TestInnerClass {
	
	public static void main(String[] args) {
		OuterClass.InnerClass1 ic1 = new OuterClass.InnerClass1();
		
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass2 ic2 = outer.new InnerClass2();
	}
}
