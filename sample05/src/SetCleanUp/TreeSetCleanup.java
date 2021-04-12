package SetCleanUp;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetCleanup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set = new TreeSet<Integer>(); // TreeSet생성
		TreeSet<Integer> set1 = new TreeSet<Integer>(); // TreeSet생성
		TreeSet<Integer> set2 = new TreeSet<>(); //new에서 파라미터 생략가능
		TreeSet<Integer> set3 = new TreeSet<Integer>(set1); //set1의 모든 값을 가진 TreeSet으로 생성
		TreeSet<Integer> set4 = new TreeSet<Integer>(Arrays.asList(1,2,3)); // 초기값 지정
		
		// TreeSet 값 추가
		set.add(7); //값추가
		set.add(4);
		set.add(9);
		set.add(1);
		set.add(5);
		
		// TreeSet 값 삭제
		set4.remove(1); // 값 1제거
		set4.clear(); // 모든 값 제거
		
		// TreeSet 크기 구하기
		System.out.println(set4.size());
		
		// TreeSet 값 출력
		System.out.println(set4.first()); // 최소값 출력
		System.out.println(set4.last()); // 최대값 출력
		System.out.println(set4.higher(4)); // 입력값보다 큰 값을 출력, 없으면 null
		System.out.println(set4.lower(4)); // 입려값보다 작은값을 출력, 없으면 null
		
		

	}

}
