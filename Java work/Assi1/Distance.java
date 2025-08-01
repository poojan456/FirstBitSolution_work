class Dist{
	double feet;
	double inch;
	Dist(){
		this.feet=0;
		this.inch=0;
		
	}
	double getFeet() {
		return feet;
	}
	void setFeet(double feet) {
		this.feet = feet;
	}
	double getInch() {
		return inch;
	}
	void setInch(double inch) {
		this.inch = inch;
	}
	void display() {
		System.out.println(this.feet);
		System.out.println(this.inch);
	}
}
public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dist d=new Dist();
		d.setFeet(5.5);
		d.setInch(3.3);
		d.display();
		

	}

}
