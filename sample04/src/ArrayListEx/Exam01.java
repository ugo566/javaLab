package ArrayListEx;

import java.util.ArrayList;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
//		ArrayList<String> str = new ArrayList<String>();
//		//ArrayList<Student> student = new ArrayList<Student>();
//		ArrayList<Integer> integer = new ArrayList<Integer>();
		

		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(5));
		list.add(new Integer(4));
		list.add(new Integer(3));
		System.out.println(list);
//		list.size();
//		System.out.println(list.size());
//		list.add(1, 10);
//		System.out.println(list);
//		list.sort(null);
//		System.out.println(list);
		
		for(int i=0; i<list.size();i++) {
			System.out.println(i);
		}
		
		

	}

}
