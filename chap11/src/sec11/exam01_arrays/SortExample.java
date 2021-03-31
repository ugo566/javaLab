package sec11.exam01_arrays;

import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {99,97,98};
		Arrays.sort(score);
		for(int i = 0; i < score.length; i++) {
			System.out.println("score[" + i + "] = " + score[i]);
		}
		System.out.println();
		
		String[] names = {"ȫ�浿", "�ڵ���", "��μ�"};
		Arrays.sort(names);
		for(int i = 0; i < names.length; i++ ) {
			System.out.println("names{" + i + "] = " + names[i]);
		}
		System.out.println();
		
		Member m1 = new Member("ȫ�浿");
		Member m2 = new Member("�ڵ���");
		Member m3 = new Member("��μ�");
		Member[] members = {m1, m2, m3};
		Arrays.sort(members);
		
		for(int i = 0; i < members.length; i++) {
			System.out.println("members[" + i + "] = " + members[i].name);
		}
		
		}

}
