package StudyEx;

import java.util.Scanner;

public class study01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시험성적을 입력하세요");
		int score = sc.nextInt();
		
		if(90 <= score && score <=100) {
			System.out.println("A");
		} else if(80 <= score && score <= 89 ) {
			System.out.println("B");
		} else if(70 <= score && score <= 79) {
			System.out.println("C");
		} else if(60 <= score) {
			System.out.println("D");
		} else  {
			System.out.println("F");
		}

	}

}
