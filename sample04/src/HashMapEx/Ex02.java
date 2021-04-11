package HashMapEx;

import java.util.HashMap;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("AAA@naver.com", "@@aa");
		map.put("BBB@naver.com", "@@bb ");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("id를 입력해주세여(이메일형식으로 작성)");
		while(true) {
			String id = sc.nextLine().trim();
			if(!map.containsKey(id)) {
				System.out.println("존재하지 않는 id입니다");
				System.out.println("id를 다시 입력해주세요");
				continue;
			}
			
			System.out.println("비밀번호를 입력해주세요");
			String password = sc.nextLine().trim();
			if(!map.get(id).equals(password)) {
				System.out.println("비밀번호가 일치하지않습니다");
				System.out.println("아이디와 바밀번호를 다시 입력해주세요");
				continue;
			} else {
				System.out.println("로그인 성공!!");
				break;
			}
		}

	}

}
