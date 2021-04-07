package verify.exam00;

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
		// 작성위치
		// set을 이용하여 로또프로그램만들기

		while (s.size() != 6) {
				n = r.nextInt(45) +1;
				s.add(n);
			}
		System.out.println(s);

		}
		
		//정렬 : set -> list로 변경하여 Collection.sort()이용하여 정렬한다.
//		List list = new ArrayList();
//		Collections.sort(list);
//		
//		System.out.println(s);
//		System.out.println(list);
//
//	}
}