package MapCleanUp;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapCleanup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map1 = new HashMap<String, String>(); // HashMap생성
		HashMap<String, String> map2 = new HashMap<>(); // new에서 타입 파라미터 생략가능
		HashMap<String, String> map3 = new HashMap<>(map1); // map1의 모든 값을 가진 HashMap생성
		HashMap<String, String> map4 = new HashMap<>(10); // 초기 용량(capacity)지정
		HashMap<String, String> map5 = new HashMap<>(10,0.7f); // 초기 capacity, load factor지정
		HashMap<String, String> map6 = new HashMap<String, String>(){{ // 초기값 지정
			put("a","b");
		}}; 
		
		// HashMap 값 추가
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "사과"); // 값 추가
		map.put(2, "바나나");
		map.put(3, "포도");
		//System.out.println(map);
		
		//HashMap 값 삭제
		HashMap<Integer, String> map0 = new HashMap<>(){{
			put(4, "콜라");
			put(5, "사이다");
			put(6, "우유");
			
		}};
		
		map.remove(1); // Key값 1제거
		map.clear(); // 모든 값 제거
		
		// HashMap 값 출력
		System.out.println(map0); // 전체 배열 출력
		
		for(Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("[Key]:" + entry.getValue() + "[Value]:" + entry.getValue());
		}
		//[Key]:1 [Value]:사과
		//[Key]:2 [Value]:바나나
		//[Key]:3 [Value]:포도
		
		

	}

}
