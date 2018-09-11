package oop;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class MyImmutable {

	private String addr;
	private int age;
	private List<String> strList;
	private Set<String> strSet;
	private Map<String, String> strstrMap;
	
	public MyImmutable(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	
	public String getAddr() {
		return addr;
	}
	
	public List<String> getStrList() {
		return Collections.unmodifiableList(strList);
	}
	
	public static void main(String[] args) {
		MyImmutable mi = new MyImmutable(5);
	}

}
