package ListCleanUp;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCleanup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList(); // Ÿ�� �̼��� Object�� ����ȴ�.
		LinkedList<Student> members = new LinkedList<Student>(); // Ÿ�Լ��� Student��ü�� ��밡��
		LinkedList<Integer> num = new LinkedList<Integer>(); // Ÿ�Լ��� int��ü�� ��밡��
		LinkedList<Integer> num2 = new LinkedList<>(); // new���� �Ķ���� ��������
		LinkedList<Integer> list2 = new LinkedList<Integer>(Arrays.asList(0,1,2)); //������ ���߰�
		
		//LinkedList �� �߰�
		list.addFirst(1); // ���� �տ� 1������ �߰�
		list.addLast(2); // ���� �ڿ� 1������ �߰�
		list.add(3); // �ں��� 3������ �߱�
		list.add(1,3); // 1������ �ڿ� 3������ �߰�
		//System.out.println(list);
		
		//LinkedList �� ����
		list2.removeFirst(); // ���� ���� �����ͻ���
		list2.removeLast(); //  ���� ���� �����ͻ���
		list2.remove(); // ������ index(0)����
		list2.remove(1); // 1�����͸� ����
		//System.out.println(list2);
		
		//LinkedList ũ�� ���ϱ�
		System.out.println(list2.size());
		
		//LinkedList �� ���
		System.out.println(list.get(0)); //0��° index���
		
		for(Integer i : list2) { // ���� for���� ��� ��ü���
			System.out.println(i);
		}
		
		Iterator<Integer> iter = list2.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.hasNext());
		}
		
		//LinkedList�� �˻�
		System.out.println(list2.contains(1)); // list2�� 1�����Ͱ� �ִ��� Ȯ��
		System.out.println(list2.indexOf(1)); // 1�����Ͱ� �ִ� index��ġ Ȯ��, ������ -1
		

	}

}
