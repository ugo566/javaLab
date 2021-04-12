package MapCleanUp;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapCleanup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map1 = new HashMap<String, String>(); // HashMap����
		HashMap<String, String> map2 = new HashMap<>(); // new���� Ÿ�� �Ķ���� ��������
		HashMap<String, String> map3 = new HashMap<>(map1); // map1�� ��� ���� ���� HashMap����
		HashMap<String, String> map4 = new HashMap<>(10); // �ʱ� �뷮(capacity)����
		HashMap<String, String> map5 = new HashMap<>(10,0.7f); // �ʱ� capacity, load factor����
		HashMap<String, String> map6 = new HashMap<String, String>(){{ // �ʱⰪ ����
			put("a","b");
		}}; 
		
		// HashMap �� �߰�
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "���"); // �� �߰�
		map.put(2, "�ٳ���");
		map.put(3, "����");
		//System.out.println(map);
		
		//HashMap �� ����
		HashMap<Integer, String> map0 = new HashMap<>(){{
			put(4, "�ݶ�");
			put(5, "���̴�");
			put(6, "����");
			
		}};
		
		map.remove(1); // Key�� 1����
		map.clear(); // ��� �� ����
		
		// HashMap �� ���
		System.out.println(map0); // ��ü �迭 ���
		
		for(Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("[Key]:" + entry.getValue() + "[Value]:" + entry.getValue());
		}
		//[Key]:1 [Value]:���
		//[Key]:2 [Value]:�ٳ���
		//[Key]:3 [Value]:����
		
		

	}

}
