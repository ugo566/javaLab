package sec01.exam01;

public class SumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[100];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}

		int sum = 0;
		float avg = 0;
		
		for(int i = 0; i < array.length; i++) {
			sum = sum + array[i];
			avg = sum / array.length;
		}
		System.out.println("1~100 ÇÕ°è: " + sum);
		System.out.println("Æò±Õ : " + avg);
	}
	

}
