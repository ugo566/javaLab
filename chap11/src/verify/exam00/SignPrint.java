package verify.exam00;

import java.util.Scanner;

public class SignPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����Է� : ");
		int num = sc.nextInt();
		
		String result = num > 0? "���" : (num < 0?"����" : "0");
		System.out.println(result);
		

	}

}
