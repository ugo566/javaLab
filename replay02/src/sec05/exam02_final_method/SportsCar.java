package sec05.exam02_final_method;

public class SportsCar extends Car {

	@Override //stop은 final이여서 재정의가 안된다
	public void speedUp() {
		speed += 10;
	}
	
	//stop은 final이여서 재정의가 안된다
	//override cannot be resolved to a type
	/*
	@override
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
	*/
	

}
