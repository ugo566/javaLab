package sec04.exam01_field;

public class UsingThisExample {
	public static void main(String... args) {
		UsingThis usingThis = new UsingThis(); //���� ��ü ����
		UsingThis.Inner inner = usingThis.new Inner(); //�ν��Ͻ� �ɹ� Ŭ������ �ν��ͽ� ����
		inner.method();
	}
}

