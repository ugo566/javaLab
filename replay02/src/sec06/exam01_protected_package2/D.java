package sec06.exam01_protected_package2;

import sec06.exam01_protected_package1.A;

public class D extends A { //다른패기키임에도 불구하고 상속을 받으면 됨(protected
	public D() {
		this.field = "value"; //protected자식클래스에서 접근을 허용한다.
		this.method();
	}
}
