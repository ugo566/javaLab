package sec11.exam01_arrays;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr1 = {'J','A','V','A'};
		
		//���1
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));
		
		//���2
		char[] arr3 = Arrays.copyOfRange(arr1, 0, 4);
		System.out.println(Arrays.toString(arr3));
		
		
		
	}

}
