package sec04.examl01_objects;

import java.util.Objects;

public class HashCodeExample {
	// 메소드
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// 정적 맴버 클래스
	static class Student {
		int sno;
		String name;

		Student(int sno, String name) {
			this.sno = sno;
			this.name = name;
		}

		@Override
		public int hashCode() {
			return Objects.hash(sno, name);
		}

	}

}
