package ArrayList01;

import java.util.ArrayList;
import java.util.List;

public class add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arr = new ArrayList<>();
		
		arr.add("�ϳ�");
		arr.add("��");
		arr.add("��");
		arr.add("��");
		arr.add("�ټ�");
		
		arr.add(3, "�� �� ��");
		arr.set(2, "�� �� ��");
		for(String a : arr) System.out.println(a);
		
		arr.remove(2);
			
		
		String[] str1 = new String[] {"�ϳ�","��","��","��","�ټ�"};
		String[] str2 = new String[6];
		str2[0]= str1[0];
		str2[0]= str1[0];
		str2[0]= str1[0];
		

	}

}
