package verify.exam00;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public class SetTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		TreeSet s = new TreeSet();
		// TreeSet s = new TreeSet();
		Random r = new Random();
		// �ۼ���ġ
		// set�� �̿��Ͽ� �ζ����α׷������

		while (s.size() != 6) {
				n = r.nextInt(45) +1;
				s.add(n);
			}
		System.out.println(s);

		}
		
		//���� : set -> list�� �����Ͽ� Collection.sort()�̿��Ͽ� �����Ѵ�.
//		List list = new ArrayList();
//		Collections.sort(list);
//		
//		System.out.println(s);
//		System.out.println(list);
//
//	}
=======
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Set s = new HashSet();
		// TreeSet s = new TreeSet();
		Random r = new Random();
		// �ۼ���ġ
		// set�� �̿��Ͽ� �ζ����α׷������

		while (true) {
			n = r.nextInt(45) + 1;
			s.add(n);
			if (s.size() == 6) {
				System.out.println(s);
				break;
			}

		}

	}
>>>>>>> refs/remotes/origin/master
}