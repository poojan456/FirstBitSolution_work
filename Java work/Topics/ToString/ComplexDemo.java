
class ComplexEx{
	int real;
	int img;
	
	int getReal() {
		return real;
	}
	void setReal(int real) {
		this.real = real;
	}
	int getImg() {
		return img;
	}
	void setImg(int img) {
		this.img = img;
	}
//	void display() {
//		System.out.print(this.real+"i"+"+");
//		System.out.print(this.img);
//	}
	ComplexEx(){
		this.real=0;
		this.img=0;
		
	}
	public ComplexEx(int real, int img) {
		super();
		this.real = real;
		this.img = img;
	
	}
	public String toString() {
		return this.real+"+i"+this.img;
		
	}
		
	
	
}
public class ComplexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexEx c=new ComplexEx(12, 5);
		System.out.println(c);
		System.out.println(c.toString());
		
//		c.setReal(11);
//		c.setImg(15);
//		c.display();
		

	}

}
