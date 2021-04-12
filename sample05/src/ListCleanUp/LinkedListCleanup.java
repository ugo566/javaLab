package ListCleanUp;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCleanup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList(); // 타입 미설정 Object로 선언된다.
		LinkedList<Student> members = new LinkedList<Student>(); // 타입설정 Student객체만 사용가능
		LinkedList<Integer> num = new LinkedList<Integer>(); // 타입설정 int객체만 사용가능
		LinkedList<Integer> num2 = new LinkedList<>(); // new에서 파라미터 생략가능
		LinkedList<Integer> list2 = new LinkedList<Integer>(Arrays.asList(0,1,2)); //생서시 값추가
		
		//LinkedList 값 추가
		list.addFirst(1); // 가장 앞에 1데이터 추가
		list.addLast(2); // 가장 뒤에 1데이터 추가
		list.add(3); // 뒤부터 3데이터 추기
		list.add(1,3); // 1데이터 뒤에 3데이터 추가
		//System.out.println(list);
		
		//LinkedList 값 삭제
		list2.removeFirst(); // 가장 앞의 데이터삭제
		list2.removeLast(); //  가장 뒤의 데이터삭제
		list2.remove(); // 생략시 index(0)제거
		list2.remove(1); // 1데이터를 삭제
		//System.out.println(list2);
		
		//LinkedList 크기 구하기
		System.out.println(list2.size());
		
		//LinkedList 값 출력
		System.out.println(list.get(0)); //0번째 index출력
		
		for(Integer i : list2) { // 향상된 for문을 통안 전체출력
			System.out.println(i);
		}
		
		Iterator<Integer> iter = list2.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.hasNext());
		}
		
		//LinkedList값 검색
		System.out.println(list2.contains(1)); // list2에 1데이터가 있는지 확인
		System.out.println(list2.indexOf(1)); // 1데이터가 있는 index위치 확인, 없으면 -1
		

	}

}
