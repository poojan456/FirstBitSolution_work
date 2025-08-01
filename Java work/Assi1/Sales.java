class SalesManag{
	int id;
	String name;
	double salary;
	int incentive;
	int target;
	SalesManag(){
		this.id=5;
		this.name="joo";
		this.salary=56777;
		this.incentive=455;
		this.target=900;
		
		
	}
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
	int getIncentive() {
		return incentive;
	}
	void setIncentive(int incentive) {
		this.incentive = incentive;
	}
	int getTarget() {
		return target;
	}
	void setTarget(int target) {
		this.target = target;
	}
	void display() {
		System.out.println("the id is"+this.id);
		System.out.println("the name is "+this.name);
		System.out.println("Salary is"+this.salary);
		System.out.println(this.incentive);
		System.out.println(this.target);
	}
	
}
public class Sales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalesManag s;
		s=new SalesManag();
		s.setId(333);
		s.setName("Suji");
		s.setSalary(45670.4);
		s.setIncentive(245);
		s.setTarget(1000);
		s.display();
		
	}

}
