package HashMapEx;

import java.util.HashMap;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");

		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.println("id�� password�� �Է����ּ���");
			System.out.println("id : ");
			String id = s.nextLine().trim();//trim�� ������ �����ش�.

			System.out.println("password : ");
			String password = s.nextLine().trim();
			System.out.println();

			if (!map.containsKey(id)) { //contains id �ּҰ��� �ִ���
				System.out.println("�Է��Ͻ� id�� ���������ʽ��ϴ�. �ٽ��Է����ּ���");
				continue;
			}

			if (!map.get(id).equals(password)) {//get�� 1234�� ��ȯ equal�� passwored�� ��
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ� �ٽ��Է����ּ���");
			} else {
				System.out.println("id�� password�� ��ġ�մϴ�");
				break;
			}
		}

	}

}