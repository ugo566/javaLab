package sec13.exam02_random;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ù�ȣ
		int[] selectNumber = new int[6];
		Random random = new Random(5);
		System.out.print("���ù�ȣ : ");
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45) +1;
			System.out.println(selectNumber[i] + " ");
		}
		
		//��÷��ȣ
		int[] winningNumber = new int[6];
		random = new Random(5);
		System.out.print("��û��ȣ : ");
		for(int i=0;  i<6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.println(winningNumber[i] + " ");
		}
		
		

	}

}
