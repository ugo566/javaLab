package ListCleanUp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class ArrayListCleanup {

	private static final String Integer = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList(); // Ÿ�� �̼��� Object�� ����ȴ�.
		ArrayList<Student> members = new ArrayList<Student>(); // Ÿ�Լ��� Student��ü�� ��밡��
		ArrayList<Integer> num = new ArrayList<Integer>(); // Ÿ�Լ��� int��ü�� ��밡��
		ArrayList<Integer> num2 = new ArrayList<>(); // new���� Ÿ�� �Ķ���� ��������
		ArrayList<Integer> num3 = new ArrayList<Integer>(10); // �ʱ� �뷮(capacity)����
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3)); // ������ ���߰�

		// ArrayList�� �߰�
		list.add(3); // ���߰�
		list.add(null); // null���� add����
		list.add(1, 3); // index(1) �ڿ� (3)�߰�

		Student student = new Student("ȫ�浿", 24);
		members.add(student);

		// ArrayList�� ����
		list2.remove(1);	//index(1)����
		list2.clear(); // ��� �� ����
		
		// ArrayList ũ�� ���ϱ�
		System.out.println(list2.size()); // list�� ũ��
		
		// ArrayList �����
		System.out.println(list2.get(0)); // 0��° index���
		
		for(Integer i : list2) { // ���� for��
			System.out.println(i);
		}
		
		Iterator iter = list2.iterator(); // Iterator����
		while(iter.hasNext()) { //�������� �ִ��� üũ
			System.out.println(iter.hasNext()); // �� ���
		}
		
		// ArrayList �� �˻�
		System.out.println(list2.contains(1)); //list2�� 1�� �ִ��� �˻� true
		System.out.println(list2.indexOf(1)); // 1�� �ִ� index��ȯ, ������ -1
		

	}

}

class Student {
	String name;
	int age;

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
