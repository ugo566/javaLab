import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	static List<String> list1 = new ArrayList<>();
	static List<String> list2 = new LinkedList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		list1.add("dog");
		list1.add("cat");
		list1.add("lion");

		list2.add("dog");
		list2.add("cat");
		list2.add("lion");
		toString("1. 숫자입력");
		
		list1.add(2, "tiger");
		list2.add(2, "tiger");
		toString("2 , 중간삽입");
		
		list1.remove(2);
		list2.remove(2);
		toString("2 , 중간삭제");

	}
	
	public static void toString(String title) {
		System.out.printf("\n == %s ==\n", title);
		System.out.printf("ArrayaList : " + list1);
		System.out.printf("LinkesList : " + list2);
	}


}
