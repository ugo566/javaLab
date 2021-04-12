package SetCleanUp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetCleanup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<Integer>(); // HashSet생성
		HashSet<Integer> set1 = new HashSet<Integer>(); // HashSet생성
		HashSet<Integer> set2 = new HashSet<>(); // 파라미터 생략가능
		HashSet<Integer> set3 = new HashSet<Integer>(set1); // set1의 모든 값을 가진 HashSet생성
		HashSet<Integer> set4 = new HashSet<Integer>(10); // 초기용량(capacity)지정
		HashSet<Integer> set5 = new HashSet<Integer>(10, 0.7f); // 초기용량(copacity,load factor)지정
		HashSet<Integer> set6 = new HashSet<Integer>(Arrays.asList(1,2,3)); // 초기값 지정
		
		// HashSet 값 추가
		set.add(1); // 값 추가
		set.add(2);
		set.add(3);
		
		// HashSet 값 삭제
		set6.remove(1); // 값 1 제거
		set6.clear(); // 모든 값 제거
		
		// HashSet 크기 구하기
		System.out.println(set6.size());
		
		// HashSet 값 출력
		Iterator iter = set.iterator();
		
		while(iter.hasNext()) { //값이 있으면 true, 없으면 flase
			System.out.println(iter.next());
		}
		
		// HashSet 값 검색
		System.out.println(set6.contains(1)); //set6에 값 1이 있는지 확인
		
		
		

	}

}
