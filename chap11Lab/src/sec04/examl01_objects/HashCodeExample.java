package sec04.examl01_objects;

import java.util.Objects;

public class HashCodeExample {
	// �޼ҵ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// ���� �ɹ� Ŭ����
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
