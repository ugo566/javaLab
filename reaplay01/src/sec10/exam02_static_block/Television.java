package sec10.exam02_static_block;

public class Television {
	static String company = "�Ｚ";
	static String model = "LCD";
	static String info;
	
	//������
	static {
		info = company + "-" + model;
	}
	

}
