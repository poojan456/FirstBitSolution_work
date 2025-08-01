class TimeEx{
	int hr;
	int min;
	int sec;
	TimeEx(){
		this.hr=0;
		this.min=0;
		this.sec=0;
		
	}
	int getHr() {
		return hr;
	}
	void setHr(int hr) {
		this.hr = hr;
	}
	int getMin() {
		return min;
	}
	void setMin(int min) {
		this.min = min;
	}
	int getSec() {
		return sec;
	}
	void setSec(int sec) {
		this.sec = sec;
	}
	void display() {
		System.out.println(this.hr);
		System.out.println(this.min);
		System.out.println(this.sec);
	}
	
	
}
public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeEx t;
		t=new TimeEx();
		t.setHr(1);
		t.setMin(55);
		t.setSec(34);
		t.display();
		

	}

}
