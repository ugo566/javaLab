package sec02.exam01_inheritance;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DmbCellPhone객체생성
		DmbCellPhone dmlCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		//Cellphone으로 부터 상속 받은 필드
		System.out.println("모델 : " + dmlCellPhone.model);
		System.out.println("색상 : " + dmlCellPhone.color);
		
		//DmbCellPhone의 필드
		System.out.println("채널 : " + dmlCellPhone.channel);
		
		//Cellphone으로부터 상속받은 매소드 호풀
		dmlCellPhone.powerOn();
		dmlCellPhone.bell();
		dmlCellPhone.sendVoice("여보세요");
		dmlCellPhone.recieverVoice("안녕하세요");
		dmlCellPhone.sendVoice("좋은아침입니다.");
		dmlCellPhone.hangUp();
		
		//DmbCellPhone의 메소드 호출
		dmlCellPhone.turnOnDmb();
		dmlCellPhone.changeChannelDmb(12);
		dmlCellPhone.trunOffDmb();
		
	}

}
