package StudyEx;

import java.util.Scanner;

public class study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A���� �Է��ϼ��� > ");
		int A = sc.nextInt();
		System.out.println("B���� �Է��ϼ��� > ");
		int B = sc.nextInt();
		
		if(A > B) {
			System.out.println("A�� B���� Ů�ϴ�");
			System.out.println(">");
		} else if(A < B) {
			System.out.println("A�� B���� �۽��ϴ�");
			System.out.println("<");
		} else if(A == B) {
			System.out.println("A��B�� �����ϴ�");
			System.out.println("=");
		} else {
			
		}

	}

}
