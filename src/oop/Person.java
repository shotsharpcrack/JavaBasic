package oop;

public class Person implements Cloneable{
	private String name;
	private int age;
	private Pocket pk;
	
	// constructor - used for creating object from the class
	// 1. same name as class name
	// 2. no return type, will return an object of this class
	// 3. new to call constructor
	// 4. overload constructors will have different parameters
	// 5. default constructor is provided by Java, no parameter
	// 6. can send parameters
	// 7. by default, the super() default constructor will be called, but also can be specified
	public Person() {
		
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// setter / getters, start with set / get, followed by field name (start with capital)
	// return the corresponding field value - getter
	// set the corresponding field - setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Pocket getPk() {
		return pk;
	}

	public void setPk(Pocket pk) {
		this.pk = pk;
	}

	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", pk=" + pk + "]";
	}

	@Override
	public Person clone() {
		Person p = null;
		try {
			p = (Person)super.clone();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return p;
	}
	
	@Override
	public void finalize() throws Throwable {
		System.out.println("finalizing...");
		super.finalize();
	}
	
	public static void main(String[] a) {
		// clone test
		Person p = new Person("G", 10);
		Pocket pk1 = new Pocket();
		pk1.setItem("banana");
		p.setPk(pk1);
		Person p2 = p.clone();
		System.out.println(p2);
		System.out.println(p);
		System.out.println(p.getPk() == p2.getPk());
		System.out.println("**********************");
		// shallow copy, modify pocket from p, p2 also changed
		p.getPk().setItem("apple");
		System.out.println(p);
		System.out.println(p2);
		System.out.println("**********************");
		// reassign a new pocket to p, then p2 doesn't change
		Pocket pk2 = new Pocket();
		pk2.setItem("pear");
		p.setPk(pk2);
		System.out.println(p);
		System.out.println(p2);
		
		boolean flag = true;
		while(flag) {
			new Person();
		}
		System.out.println("bad");
	}
}
