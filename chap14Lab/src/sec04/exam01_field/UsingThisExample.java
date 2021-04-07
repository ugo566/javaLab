package sec04.exam01_field;

public class UsingThisExample {
	public static void main(String... args) {
		UsingThis usingThis = new UsingThis(); //밖의 객체 생성
		UsingThis.Inner inner = usingThis.new Inner(); //인스턴스 맴버 클래스의 인스터스 생성
		inner.method();
	}
}

