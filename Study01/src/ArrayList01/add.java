package ArrayList01;

import java.util.ArrayList;
import java.util.List;

public class add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arr = new ArrayList<>();
		
		arr.add("하나");
		arr.add("둘");
		arr.add("셋");
		arr.add("넷");
		arr.add("다섯");
		
		arr.add(3, "이 점 오");
		arr.set(2, "둘 점 오");
		for(String a : arr) System.out.println(a);
		
		arr.remove(2);
			
		
		String[] str1 = new String[] {"하나","둘","셋","넷","다섯"};
		String[] str2 = new String[6];
		str2[0]= str1[0];
		str2[0]= str1[0];
		str2[0]= str1[0];
		

	}

}
