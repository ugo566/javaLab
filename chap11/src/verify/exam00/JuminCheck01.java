package verify.exam00;

import java.io.InputStream;
import java.util.Scanner;

public class JuminCheck01 {

	// 주민번호 타당성 검사하는 메소드
	public boolean juminCheck(String jumin) {
		// 작성위치
		// 1. 주문번호 각 자리에 해당 숫자를 곱한다.
		int[] mul = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };
		int total = 0;
		int total2;

		for (int i = 0; i < 12; i++) {
			total += Integer.parseInt(jumin.substring(i, i + 1)) * mul[i];
			// System.out.println(jumin.substring(i, i+1));
		}
		// 2. 1번읜 연산결과를 11로 나우어서 나머지를 구한다
		total %= 11;

		// 3.1에서 나머지 값을 뺸후 체크용 번호와 비교해서 같은으면
		total2 = 11 - total;
		if (total2 >= 10) {
			total2 %= 10; // total2 = total2 % 10;
		}

		// 4. total2와 주민등록 번호 마지막 번호와 같은지 비교
		if (total2 != Integer.parseInt(jumin.substring(12, 13))) {
			return false;
		} else {
			return true;
		}

		// 올바른 주민번호 그렇지 않으면 틀린 주민 번호

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JuminCheck01 jc = new JuminCheck01();

		// 콘솔에서 데이터 입력할수있는 Scanner생성.
		Scanner sc = new Scanner(System.in);

		System.out.println("주민번호 앞자리를 입력 하세요?");

		String jumin1 = sc.next(); // 111111
		System.out.println("주민번호 뒷자리를 입력 하세요?");

		String jumin2 = sc.next(); // 1111011
		if (jumin1.length() != 6) {
			System.out.println("주민번호 앞자리는 6자리 입력");
		} else if (jumin2.length() != 7) {
			System.out.println("주민번호 뒷자리는 7자리 입력");
		} else if (!jc.juminCheck(jumin1 + jumin2)) { // 1111111111011
			System.out.println("잘못된 주민번호 입니다.");
		} else {
			System.out.println("올바른 주민번호 입니다");
		}
	}

}
