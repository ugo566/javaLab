package HashMapEx;

import java.util.HashMap;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("AAA@naver.com", "@@aa");
		map.put("BBB@naver.com", "@@bb ");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("id�� �Է����ּ���(�̸����������� �ۼ�)");
		while(true) {
			String id = sc.nextLine().trim();
			if(!map.containsKey(id)) {
				System.out.println("�������� �ʴ� id�Դϴ�");
				System.out.println("id�� �ٽ� �Է����ּ���");
				continue;
			}
			
			System.out.println("��й�ȣ�� �Է����ּ���");
			String password = sc.nextLine().trim();
			if(!map.get(id).equals(password)) {
				System.out.println("��й�ȣ�� ��ġ�����ʽ��ϴ�");
				System.out.println("���̵�� �ٹй�ȣ�� �ٽ� �Է����ּ���");
				continue;
			} else {
				System.out.println("�α��� ����!!");
				break;
			}
		}

	}

}
