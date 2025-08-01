
 class Employee1{
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
	Employee1() {
		//Default constructor
    	this.id=100;
    	this.name="not given";
    	this.salary=100;
	}
    Employee1(int iD,String nam,double sal) {
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
class Admin1 extends Employee1{
	double allowance;
	
	
	double getAllowance() {
		return allowance;
	}
	void setAllowance(double allowances) {
		allowance = allowances;
	}
	Admin1(){
		//default
		super();
		this.allowance=100;
			
	}
	Admin1(int id, String name , double salary,double allowa){
		//parameterised
		super(id,name,salary);
		this.allowance=allowa;
		
		
	}
	void display() {
		super.display();
		System.out.println(this.allowance);
		
	}
	double calSaly() {
		return salary+allowance;
	}
	
	
}
class SalesManager extends Employee1{
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
	SalesManager(){
		//default
		this.incentive=20;
		this.target=50;
	}
	SalesManager(int id, String name , double salary,double incentive,int target){
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
	double calSal() {
		return salary+incentive;
	}
	
	
}
 
class HR1 extends Employee1{
	double commission;
	
	double getCommission() {
		return commission;
	}
	void setCommission(double commission) {
		this.commission = commission;
	}
	HR1(){
		//default
		this.commission=50;
		
	}
	HR1(int id, String name , double salary,double commi){
		//parameterised
		super(id,name,salary);
		this.commission=commi;
		
		
		
	}
	void display() {
		super.display();
		System.out.println(this.commission);
		
		
	}
	double calSaly() {
		return salary+commission;
	}
	
	
}



 class EmployeeDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 E1=new Employee1();
		Employee1 E2=new Employee1();

		Admin1 a1=new Admin1(1,"Pooja",55000,5000);
		System.out.println("calculated salary of admin"+a1.calSaly());
		SalesManager s1=new SalesManager(2,"shreya",7000,200,67);
		System.out.println("calculated salary of sales manager"+s1.calSal());
		
		HR1 hr1 = new HR1(3, "Ankit", 6000, 100);
		System.out.println("calculated salary of hr"+ hr1.calSaly());
     
		
		
	}

}
