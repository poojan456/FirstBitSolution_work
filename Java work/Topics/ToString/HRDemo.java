
class Example{
	int id;
	String name;
	double salary;
	int commission;
	
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}
	int getCommission() {
		return commission;
	}
	void setCommission(int commission) {
		this.commission = commission;
	}
//	void display() {
//		System.out.println("the id is "+this.id);
//		System.out.println("the name is "+this.name);
//		System.out.println("salary is "+this.salary);
//		System.out.println("commission is "+this.commission );
//	}
	Example(){// default constructor
		this.id=0;
		this.name="rohi";
		this.salary=78.90;
		this.commission=450;
	}
	public Example(int id, String name, double salary, int commission) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.commission = commission;
	}
	public String toString() {
		return this.id+" "+this.name+" "+this.salary+" "+this.commission;
	}
	
	
	
}
public class HRDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example h=new Example(101,"sanika",78000,5000);
		System.out.println(h.toString());
//		h.setId(222);
//		h.setName("neon");
//		h.setSalary(5678.9);
//		h.setCommission(500);
//		h.display();
	}

}
