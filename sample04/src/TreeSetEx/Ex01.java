package TreeSetEx;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Ex01 {

	public static void main(String[] args) {
		Set set = new TreeSet();
//		set.add(new TestComp());
		
		for(int i=0; set.size()<6; i++) {
			int num = (int)(Math.random()*45)+1;
			
		}
		System.out.println(set);

	}

}

//class Test{
//	
//}
//
//class TestComp implements Comparable {
//
//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		return -1;
//}




