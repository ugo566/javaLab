package verify.exam00;


import java.util.GregorianCalendar;
import java.util.Scanner;

public class YearCheck {

	public static void main(String[] args) {
		
		System.out.print("������ �Է� �ϼ���?");
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		/* if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
		System.out.println(year + "�� ����");
		} else {
		System.out.println(year + "�� ���");
		}*/
		// �ۼ���ġ
		GregorianCalendar GC  = new GregorianCalendar();
		if(GC.isLeapYear(year)) {
			System.out.println(year + "���� ����");
		} else {
			System.out.println(year + "���� ���");
		}
		

	}

}
