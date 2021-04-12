package MapCleanUp;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapCleanup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> map1 = new TreeMap<Integer,String>();//TreeMap����
		TreeMap<Integer,String> map2 = new TreeMap<>();//new���� Ÿ�� �Ķ���� ��������
		TreeMap<Integer,String> map3 = new TreeMap<>(map1);//map1�� ��� ���� ���� TreeMap����
		TreeMap<Integer,String> map6 = new TreeMap<Integer,String>(){{//�ʱⰪ ����
		    put(1,"a");
		}};
		
		// TreeMap �� ����
		TreeMap<Integer, String> map = new TreeMap<Integer,String>(){{//�ʱⰪ ����
		    put(1, "���");//�� �߰�
		    put(2, "������");
		    put(3, "����");
		}};
		map.remove(1); //key�� 1 ����
		map.clear(); //��� �� ����
		
		//TreeMap ���� �� ���
		TreeMap<Integer,String> map11 = new TreeMap<Integer,String>(){{//�ʱⰪ ����
		    put(1, "���");//�� �߰�
		    put(2, "������");
		    put(3, "����");
		}};
				
		System.out.println(map11); //��ü ��� : {1=���, 2=������, 3=����}
		System.out.println(map11.get(1));//key�� 1�� value��� : ���
		System.out.println(map11.firstEntry());//�ּ� Entry ��� : 1=���
		System.out.println(map11.firstKey());//�ּ� Key ��� : 1
		System.out.println(map11.lastEntry());//�ִ� Entry ���: 3=����
		System.out.println(map11.lastKey());//�ִ� Key ��� : 3
		
		//TreeMap ��ü �� ���
		TreeMap<Integer,String> map0 = new TreeMap<Integer,String>(){{//�ʱⰪ ����
		    put(1, "���");//�� �߰�
		    put(2, "������");
		    put(3, "����");
		}};

		//entrySet() Ȱ��
		for (Entry<Integer, String> entry : map.entrySet()) {
		    System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
		}
		//[Key]:1 [Value]:���
		//[Key]:2 [Value]:������
		//[Key]:3 [Value]:����

		//KeySet() Ȱ��
		for(Integer i : map.keySet()){ //����� key�� Ȯ��
		    System.out.println("[Key]:" + i + " [Value]:" + map.get(i));
		}
		//[Key]:1 [Value]:���
		//[Key]:2 [Value]:������
		//[Key]:3 [Value]:����
		
		/*
		//Iterator ���
		TreeMap<Integer,String> map = new TreeMap<Integer,String>(){{//�ʱⰪ ����
		    put(1, "���");//�� �߰�
		    put(2, "������");
		    put(3, "����");
		}};
				
		//entrySet().iterator()
		Iterator<Entry<Integer, String>> entries = map.entrySet().iterator();
		while(entries.hasNext()){
		    Map.Entry<Integer, String> entry = entries.next();
		    System.out.println("[Key]:" + entry.getKey() + " [Value]:" +  entry.getValue());
		}
		//[Key]:1 [Value]:���
		//[Key]:2 [Value]:������
		//[Key]:3 [Value]:����
				
		//keySet().iterator()
		
		//Iterator ���
		Iterator<Integer> keys = map.keySet().iterator();
		while(keys.hasNext()){
		    int key = keys.next();
		    System.out.println("[Key]:" + key + " [Value]:" +  map.get(key));
		}
		//[Key]:1 [Value]:���
		//[Key]:2 [Value]:������
		//[Key]:3 [Value]:����
		 */
		 

	}

}
