package verify.exam00;

import java.util.Scanner;

public class ExitGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		for(int i=0; i<5; i++) {
			System.out.println("�Է� : ");
			
			int num = scanner.nextInt();
			sum += num;
			System.out.println("����:" + num + "��:" + sum);
			
			if(sum >= 100) {
				break;
			}
		}
		System.out.println("���α׷�����");

	}

}
