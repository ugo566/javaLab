package sec05.exam04_getporperty;

import java.util.Properties;
import java.util.Set;

public class GetpropertyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("use.name");
		String userHome = System.getProperty("use.home");
		
		System.out.println("운영체제 이름: " + osName);
		System.out.println("사용자 이름: " + userName);
		System.out.println("사용자 홈디렉토리: " + userHome);
		
		System.out.println("---------------");
		
		System.out.println("[key] value");
		System.out.println("---------------");
		
		//map 자료구조 : {key : value} 예) [String타입 : String타입} <-- Properties
		Properties props = System.getProperties();
		//set자료구조 : 순서가 없고, 자료가 중복할 수 없고, null을 하나 허용한다.
		Set Keys = props.keySet();
		for(Object objKey : Keys) {
			String Key = (String) objKey;
			String value = System.getProperty(Key);
			System.out.println("["+Key+"]"+value);
			
		}
		
		
	}

}
