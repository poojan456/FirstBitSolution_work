
class Dist{
	double feet;
	double inch;
	
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
//	void display() {
//		System.out.println(this.feet);
//		System.out.println(this.inch);
//	}
	Dist(){
		this.feet=0;
		this.inch=0;
		
	}
	public Dist(double feet, double inch) {
		super();
		this.feet = feet;
		this.inch = inch;
	}
	public String toString() {
		return this.feet+" "+this.inch;
	}
	
}
public class DistanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dist d=new Dist(55,35);
		//System.out.println(d);
		System.out.println(d.toString());
//		d.setFeet(5.5);
//		d.setInch(3.3);
//		d.display();
//		

	}

}