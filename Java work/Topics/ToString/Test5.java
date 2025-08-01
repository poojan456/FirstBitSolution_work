
 class Employee{
	int id;
	String name;
	double salary;
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
	Employee() {
		//Default constructor
    	this.id=100;
    	this.name="not given";
    	this.salary=100;
	}
    Employee(int iD,String nam,double sal) {
		// TODO Auto-generated constructor stub
    	this.id=iD;
    	this.name=nam;
    	this.salary=sal;
	}
    void display() {
    	System.out.println(this.id);
    	System.out.println(this.name);
    	System.out.println(this.salary);
    }
    double calsal() {
		return salary;
	}
}
class Admin extends Employee{
	double allowance;

	double getAllowance() {
		return allowance;
	}

	void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	Admin(){
		//default
		super();
		this.allowance=100;
			
	}
	Admin(int id, String name , double salary,double allowa){
		//parameterised
		super(id,name,salary);
		this.allowance=allowa;
		
		
	}
	void display() {
		super.display();
		System.out.println(this.allowance);
		
	}
	double calsal() {
		return salary+allowance;
	}
	
	
	
}
class SalesManag extends Employee{
	double incentive;
	double getIncentive() {
		return incentive;
	}
	void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	int target;
	SalesManag(){
		//default
		this.incentive=20;
		this.target=50;
	}
	SalesManag(int id, String name , double salary,double incentive,int target){
		//parameterised
		super(id,name,salary);
		this.incentive=incentive;
		this.target=target;
		
		
	}
	void display(){
		super.display();
		System.out.println(this.incentive);
		System.out.println(this.target);
		
	}
	double calsal(){
		return salary+incentive;
	}
	

}

public class Test5{
	public static void main(String[]args){
		Test5 t1=new Test5();
		t1.allEmpDetail(new SalesManag(101,"Pooja",50000,2000,50));
		t1.allEmpDetail(new Admin(102,"vinni",30000,1000));
	}// main end here
	void allEmpDetail(Employee e1) {
		System.out.println(e1.getName());
		System.out.println(e1.calsal());
		if(e1 instanceof SalesManag){
			SalesManag s1=(SalesManag) e1;
			System.out.println(s1.getIncentive());
			
		}
		if(e1 instanceof Admin){
			Admin a1=(Admin)e1;
			System.out.println(a1.getAllowance());
		}
		
//		SalesManag s1=(SalesManag)e1;// wrong cast if e1 is Admin
//	    System.out.println(s1.getIncentive());
//
//	    Admin a1=(Admin) e1;  //wrong cast if e1 is SalesManag
//	    System.out.println(a1.getAllowance());
		
			
	}

}


