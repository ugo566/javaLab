package sec11.exam01_arrays;

import java.util.Arrays;

public class SeachExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�⺻ Ÿ�԰� �˻�
		int[] scores = {99, 97, 98};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores,99);
		System.out.println("ã�� �ε��� : " + index);
		
		// ���ڿ� �˻�
//		String[] names = {"ȫ�浿", "�ڵ���", "��μ�"};
//		Arrays.sort(names);
//		index = Arrays.binarySearch(names, "ȫ�浿");
//		System.out.println("ã�� �ε��� : " + index);
		
	}

}
