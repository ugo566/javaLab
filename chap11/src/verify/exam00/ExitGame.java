package verify.exam00;

import java.util.Scanner;

public class ExitGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		for(int i=0; i<5; i++) {
			System.out.println("입력 : ");
			
			int num = scanner.nextInt();
			sum += num;
			System.out.println("정수:" + num + "합:" + sum);
			
			if(sum >= 100) {
				break;
			}
		}
		System.out.println("프로그램종료");

	}

}
