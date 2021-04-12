package ListCleanUp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class ArrayListCleanup {

	private static final String Integer = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList(); // 타입 미설정 Object로 선언된다.
		ArrayList<Student> members = new ArrayList<Student>(); // 타입설정 Student객체만 사용가능
		ArrayList<Integer> num = new ArrayList<Integer>(); // 타입설정 int객체만 사용가능
		ArrayList<Integer> num2 = new ArrayList<>(); // new에서 타입 파라미터 생략가능
		ArrayList<Integer> num3 = new ArrayList<Integer>(10); // 초기 용량(capacity)지정
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3)); // 생성시 값추가

		// ArrayList값 추가
		list.add(3); // 값추가
		list.add(null); // null값도 add가능
		list.add(1, 3); // index(1) 뒤에 (3)추가

		Student student = new Student("홍길동", 24);
		members.add(student);

		// ArrayList값 삭제
		list2.remove(1);	//index(1)제거
		list2.clear(); // 모든 값 제거
		
		// ArrayList 크기 구하기
		System.out.println(list2.size()); // list의 크기
		
		// ArrayList 값출력
		System.out.println(list2.get(0)); // 0번째 index출력
		
		for(Integer i : list2) { // 향상된 for문
			System.out.println(i);
		}
		
		Iterator iter = list2.iterator(); // Iterator선언
		while(iter.hasNext()) { //다음값이 있는지 체크
			System.out.println(iter.hasNext()); // 값 출력
		}
		
		// ArrayList 값 검색
		System.out.println(list2.contains(1)); //list2에 1이 있는지 검색 true
		System.out.println(list2.indexOf(1)); // 1이 있는 index반환, 없으면 -1
		

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
