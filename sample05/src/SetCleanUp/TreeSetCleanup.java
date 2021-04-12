package SetCleanUp;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetCleanup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set = new TreeSet<Integer>(); // TreeSet����
		TreeSet<Integer> set1 = new TreeSet<Integer>(); // TreeSet����
		TreeSet<Integer> set2 = new TreeSet<>(); //new���� �Ķ���� ��������
		TreeSet<Integer> set3 = new TreeSet<Integer>(set1); //set1�� ��� ���� ���� TreeSet���� ����
		TreeSet<Integer> set4 = new TreeSet<Integer>(Arrays.asList(1,2,3)); // �ʱⰪ ����
		
		// TreeSet �� �߰�
		set.add(7); //���߰�
		set.add(4);
		set.add(9);
		set.add(1);
		set.add(5);
		
		// TreeSet �� ����
		set4.remove(1); // �� 1����
		set4.clear(); // ��� �� ����
		
		// TreeSet ũ�� ���ϱ�
		System.out.println(set4.size());
		
		// TreeSet �� ���
		System.out.println(set4.first()); // �ּҰ� ���
		System.out.println(set4.last()); // �ִ밪 ���
		System.out.println(set4.higher(4)); // �Է°����� ū ���� ���, ������ null
		System.out.println(set4.lower(4)); // �Է������� �������� ���, ������ null
		
		

	}

}
