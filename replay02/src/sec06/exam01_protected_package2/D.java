package sec06.exam01_protected_package2;

import sec06.exam01_protected_package1.A;

public class D extends A { //�ٸ��б�Ű�ӿ��� �ұ��ϰ� ����� ������ ��(protected
	public D() {
		this.field = "value"; //protected�ڽ�Ŭ�������� ������ ����Ѵ�.
		this.method();
	}
}
