class Time {
	private int hour;	// 0~23������ ���� ��������
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) return;
		
		this.hour = hour;
	}
	
	public int getHour() {return hour;};
}



public class TimeText {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t = new Time();
		t.setHour(21);
		System.out.println(t.getHour());

	}

}
