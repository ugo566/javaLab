package sec05.exam04_getporperty;

import java.util.Properties;
import java.util.Set;

public class GetpropertyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("use.name");
		String userHome = System.getProperty("use.home");
		
		System.out.println("�ü�� �̸�: " + osName);
		System.out.println("����� �̸�: " + userName);
		System.out.println("����� Ȩ���丮: " + userHome);
		
		System.out.println("---------------");
		
		System.out.println("[key] value");
		System.out.println("---------------");
		
		//map �ڷᱸ�� : {key : value} ��) [StringŸ�� : StringŸ��} <-- Properties
		Properties props = System.getProperties();
		//set�ڷᱸ�� : ������ ����, �ڷᰡ �ߺ��� �� ����, null�� �ϳ� ����Ѵ�.
		Set Keys = props.keySet();
		for(Object objKey : Keys) {
			String Key = (String) objKey;
			String value = System.getProperty(Key);
			System.out.println("["+Key+"]"+value);
			
		}
		
		
	}

}
