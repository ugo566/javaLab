package SetCleanUp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetCleanup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<Integer>(); // HashSet����
		HashSet<Integer> set1 = new HashSet<Integer>(); // HashSet����
		HashSet<Integer> set2 = new HashSet<>(); // �Ķ���� ��������
		HashSet<Integer> set3 = new HashSet<Integer>(set1); // set1�� ��� ���� ���� HashSet����
		HashSet<Integer> set4 = new HashSet<Integer>(10); // �ʱ�뷮(capacity)����
		HashSet<Integer> set5 = new HashSet<Integer>(10, 0.7f); // �ʱ�뷮(copacity,load factor)����
		HashSet<Integer> set6 = new HashSet<Integer>(Arrays.asList(1,2,3)); // �ʱⰪ ����
		
		// HashSet �� �߰�
		set.add(1); // �� �߰�
		set.add(2);
		set.add(3);
		
		// HashSet �� ����
		set6.remove(1); // �� 1 ����
		set6.clear(); // ��� �� ����
		
		// HashSet ũ�� ���ϱ�
		System.out.println(set6.size());
		
		// HashSet �� ���
		Iterator iter = set.iterator();
		
		while(iter.hasNext()) { //���� ������ true, ������ flase
			System.out.println(iter.next());
		}
		
		// HashSet �� �˻�
		System.out.println(set6.contains(1)); //set6�� �� 1�� �ִ��� Ȯ��
		
		
		

	}

}
