package sec06.exam01_protected_package1;

public class B {
	public void method() {
		A a = new A(); //같은패키지 ok
		a.field = "value";
		a.method();
	}
}
