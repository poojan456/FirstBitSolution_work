
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
       
}
//class employee end
class Admin extends Employee{
	double allowance;
	
	
	double getAllowance() {
		return allowance;
	}
	void setAllowance(double allowances) {
		allowance = allowances;
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
	
	
}
class SalesManag extends Employee{
	double incentive;
	int target;

	double getIncentive() {
		return incentive;
	}
	void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	int getTarget() {
		return target;
	}
	void setTarget(int target) {
		this.target = target;
	}
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
	void display() {
		super.display();
		System.out.println(this.incentive);
		System.out.println(this.target);
		
	}
	
	
}
 
class HR extends Employee{
	double commission;
	
	double getCommission() {
		return commission;
	}
	void setCommission(double commission) {
		this.commission = commission;
	}
	HR(){
		//default
		this.commission=50;
		
	}
	HR(int id, String name , double salary,double commi){
		//parameterised
		super(id,name,salary);
		this.commission=commission;
		
		
		
	}
	void display() {
		super.display();
		System.out.println(this.commission);
		
		
	}
	
	
}



class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee E1=new Employee();
		Employee E2=new Employee();
		
		
		Admin a1=new Admin(1,"Pooja",55000,5000);
		a1.display();
		SalesManag s1=new SalesManag(2,"shreya",7000,200,67);
		s1.display();
		HR hr1 = new HR(3, "Ankit", 6000, 100);
        hr1.display();
		
		
	}

}
