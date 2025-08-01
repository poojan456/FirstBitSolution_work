
class SalesManager{
	int id;
	String name;
	double salary;
	int incentive;
	int target;
	
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
//	void display() {
//		System.out.println("the id is"+this.id);
//		System.out.println("the name is "+this.name);
//		System.out.println("Salary is"+this.salary);
//		System.out.println(this.incentive);
//		System.out.println(this.target);
//	}
	SalesManager(){
		this.id=5;
		this.name="joo";
		this.salary=56777;
		this.incentive=455;
		this.target=900;
		
		
	}
	public SalesManager(int id, String name, double salary, int incentive, int target) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.incentive = incentive;
		this.target = target;
	}
	public String toString() {
		return this.id+" "+this.name+" "+this.salary+" "+this.incentive+" "+this.target;
	}
	
}
public class SalesM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalesManager s=new SalesManager(101,"pooja",50000,3000,600);
		System.out.println(s.toString());
//		s.setId(333);
//		s.setName("Suji");
//		s.setSalary(45670.4);
//		s.setIncentive(245);
//		s.setTarget(1000);
//		s.display();
//		
	}

}
