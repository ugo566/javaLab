package exam01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		System.out.println(list1);
		System.out.println(list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		System.out.println(list1.containsAll(list2));
		System.out.println(list1);
		System.out.println(list2);
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		System.out.println(list1);
		System.out.println(list2);
		
		list2.set(3, "AA");
		System.out.println(list2);
		
		list1.add(0, "1");
		System.out.println(list1);
		System.out.println(list1.indexOf(1));
		list1.remove(new Integer(0));
		System.out.println(list1);
		
		Stack st = new Stack();
		Queue q = new LinkedList();
		
	}


}
