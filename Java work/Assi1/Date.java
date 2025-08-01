class Dates{
	int day;
	int month;
	int yr;
	
	int getDay() {
		return day;
	}
	void setDay(int day) {
		this.day = day;
	}
	int getMonth() {
		return month;
	}
	void setMonth(int month) {
		this.month = month;
	}
	int getYr() {
		return yr;
	}
	void setYr(int yr) {
		this.yr = yr;
	}
	void display() {
		System.out.print(this.day+"/");
		System.out.print(this.month+"/");
		System.out.print(this.yr);
	}
	Dates (){
		this.day=0;
		this.month=0;
		this.yr=0;
		
	}
	public Dates(int day, int month, int yr) {
		super();
		this.day = day;
		this.month = month;
		this.yr = yr;
	}
	
	
	
}
public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dates d;
		d=new Dates();
		d.setDay(1);
		d.setMonth(7);
		d.setYr(2025);
		d.display();
		

	}

}
