package sec03.exam04_clone;

public class Member implements Cloneable {
	public String id;
	public String name;
	public String passworld;
	public int age;
	public boolean adult;
	
	public Member(String id, String name, String passworld, int age, boolean adult) {
		super();
		this.id = id;
		this.name = name;
		this.passworld = passworld;
		this.age = age;
		this.adult = adult;
	}
	
	public Member getMember() {
	Member cloned =  null;
	try {
		cloned = (Member) clone();
	} catch (CloneNotSupportedException e) {
		e.printStackTrace();
	}
	return cloned;
	}
	
	
	
}
