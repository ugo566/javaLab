package exam02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex02 {
	public static void main(String[] args) {

		Object[] obj = { "1", new Integer(1), 2, 2, 2, 3, 3, 3, 4, 4, 4 };

		Set set = new HashSet();
		for (int i = 0; i < obj.length; i++) {
			set.add(obj[i]);
		}
		System.out.println(set);
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
