package sec10.exam02_static_block;

public class Television {
	static String company = "삼성";
	static String model = "LCD";
	static String info;
	
	//정적블럭
	static {
		info = company + "-" + model;
	}
	

}
