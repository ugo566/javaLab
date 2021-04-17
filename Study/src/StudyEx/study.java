package StudyEx;

import java.util.Scanner;

public class study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A값을 입력하세요 > ");
		int A = sc.nextInt();
		System.out.println("B값을 입력하세요 > ");
		int B = sc.nextInt();
		
		if(A > B) {
			System.out.println("A가 B보다 큽니다");
			System.out.println(">");
		} else if(A < B) {
			System.out.println("A가 B보다 작습니다");
			System.out.println("<");
		} else if(A == B) {
			System.out.println("A와B가 같습니다");
			System.out.println("=");
		} else {
			
		}

	}

}
