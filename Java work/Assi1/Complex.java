class ComplexEx{
	int real;
	int img;
	ComplexEx(){
		this.real=0;
		this.img=0;
		
	}
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
	void display() {
		System.out.print(this.real+"i"+"+");
		System.out.print(this.img);
	}
	public ComplexEx(int real, int img) {
		super();
		this.real = real;
		this.img = img;
	}
	
	
}
public class Complex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexEx c=new ComplexEx();
		c.setReal(11);
		c.setImg(15);
		c.display();
		

	}

}
