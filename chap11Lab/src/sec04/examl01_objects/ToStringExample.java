package sec04.examl01_objects;

import java.util.Objects;

public class ToStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "홍길동";
		String str2 = null;
		
		System.out.println(str1.toString());
		//System.out.println(str2.toString());
		
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str1, "이름이없습니다"));
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str2,"이름이업습니다"));
	}

}
