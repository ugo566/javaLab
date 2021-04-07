package verify.exam00;

public class SumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		
		for(int i=0; i<=100; i++) {
			total += i;
		}
		
		double avg =  total/100.0;
		
		System.out.println("1~100ÇÕ°è : " + total);
		System.out.println("Æò±Õ : " + avg);

	}

}
