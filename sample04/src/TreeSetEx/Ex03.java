package TreeSetEx;

import java.util.TreeSet;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet set = new TreeSet();
		int[] score = {80, 95, 50, 35, 45, 65, 10, 100};
		
		for(int i=0; i<score.length; i++) {
			set.add(new Integer(score[i]));
		}
		System.out.println("50���� ������ : " +set.headSet(50));
		System.out.println("50���� ū�� ; " + set.tailSet(50));
		System.out.println("40�� 80������ ū �� : " + set.subSet(40, 80));

	}

}
