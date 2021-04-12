package MapCleanUp;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapCleanup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> map1 = new TreeMap<Integer,String>();//TreeMap생성
		TreeMap<Integer,String> map2 = new TreeMap<>();//new에서 타입 파라미터 생략가능
		TreeMap<Integer,String> map3 = new TreeMap<>(map1);//map1의 모든 값을 가진 TreeMap생성
		TreeMap<Integer,String> map6 = new TreeMap<Integer,String>(){{//초기값 설정
		    put(1,"a");
		}};
		
		// TreeMap 값 삭제
		TreeMap<Integer, String> map = new TreeMap<Integer,String>(){{//초기값 설정
		    put(1, "사과");//값 추가
		    put(2, "복숭아");
		    put(3, "수박");
		}};
		map.remove(1); //key값 1 제거
		map.clear(); //모든 값 제거
		
		//TreeMap 단일 값 출력
		TreeMap<Integer,String> map11 = new TreeMap<Integer,String>(){{//초기값 설정
		    put(1, "사과");//값 추가
		    put(2, "복숭아");
		    put(3, "수박");
		}};
				
		System.out.println(map11); //전체 출력 : {1=사과, 2=복숭아, 3=수박}
		System.out.println(map11.get(1));//key값 1의 value얻기 : 사과
		System.out.println(map11.firstEntry());//최소 Entry 출력 : 1=사과
		System.out.println(map11.firstKey());//최소 Key 출력 : 1
		System.out.println(map11.lastEntry());//최대 Entry 출력: 3=수박
		System.out.println(map11.lastKey());//최대 Key 출력 : 3
		
		//TreeMap 전체 값 출력
		TreeMap<Integer,String> map0 = new TreeMap<Integer,String>(){{//초기값 설정
		    put(1, "사과");//값 추가
		    put(2, "복숭아");
		    put(3, "수박");
		}};

		//entrySet() 활용
		for (Entry<Integer, String> entry : map.entrySet()) {
		    System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
		}
		//[Key]:1 [Value]:사과
		//[Key]:2 [Value]:복숭아
		//[Key]:3 [Value]:수박

		//KeySet() 활용
		for(Integer i : map.keySet()){ //저장된 key값 확인
		    System.out.println("[Key]:" + i + " [Value]:" + map.get(i));
		}
		//[Key]:1 [Value]:사과
		//[Key]:2 [Value]:복숭아
		//[Key]:3 [Value]:수박
		
		/*
		//Iterator 사용
		TreeMap<Integer,String> map = new TreeMap<Integer,String>(){{//초기값 설정
		    put(1, "사과");//값 추가
		    put(2, "복숭아");
		    put(3, "수박");
		}};
				
		//entrySet().iterator()
		Iterator<Entry<Integer, String>> entries = map.entrySet().iterator();
		while(entries.hasNext()){
		    Map.Entry<Integer, String> entry = entries.next();
		    System.out.println("[Key]:" + entry.getKey() + " [Value]:" +  entry.getValue());
		}
		//[Key]:1 [Value]:사과
		//[Key]:2 [Value]:복숭아
		//[Key]:3 [Value]:수박
				
		//keySet().iterator()
		
		//Iterator 사용
		Iterator<Integer> keys = map.keySet().iterator();
		while(keys.hasNext()){
		    int key = keys.next();
		    System.out.println("[Key]:" + key + " [Value]:" +  map.get(key));
		}
		//[Key]:1 [Value]:사과
		//[Key]:2 [Value]:복숭아
		//[Key]:3 [Value]:수박
		 */
		 

	}

}
