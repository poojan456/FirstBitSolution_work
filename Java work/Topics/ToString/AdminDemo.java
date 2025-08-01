
class Demo{
	int id;
	String name;
	int salary;
	int allowance;
	
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
	void setSalary(int salary) {
		this.salary = salary;
	}
	int getAllowance() {
		return allowance;
	}
	void setAllowance(int allowance) {
		this.allowance = allowance;
	}
//	void display() {
//		System.out.println("The id is"+this.id);
//		System.out.println("Name is "+this.name);
//		System.out.println("salary is"+this.salary);
//		System.out.println("allowance is"+this.allowance);
//	}
	Demo(){//default constructor
		this.id=0;
		this.name="null";
		this.salary=98;
		this.allowance=50;	
	}
	public Demo(int id, String name, int salary, int allowance) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.allowance = allowance;
	}
	public String toString() {
		return this.id+" "+this.name+" "+this.salary+" "+this.allowance;
		
	}
	
	
	
}
public class AdminDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo a1=new Demo(1,"vinni",30000,2000);
		Demo a2=new Demo(2,"visha",50000,1000);
		System.out.println(a1+" "+a2);
		
		System.out.println(a1.toString());
		
		
//		a1.setId(67);
//		a1.setName("rohan");
//		a1.setSalary(6700);
//		a1.setAllowance(56);
//		a1.display();
		
		
		
		

	}

}
