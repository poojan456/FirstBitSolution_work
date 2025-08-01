
 abstract class EmployeeTest{
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
	EmployeeTest() {
		//Default constructor
    	this.id=100;
    	this.name="not given";
    	this.salary=100;
	}
    EmployeeTest(int iD,String nam,double sal) {
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
abstract class AdminTest extends EmployeeTest{
	double allowance;
	
	
	double getAllowance() {
		return allowance;
	}
	void setAllowance(double allowances) {
		allowance = allowances;
	}
	AdminTest(){
		//default
		super();
		this.allowance=100;
			
	}
	AdminTest(int id, String name , double salary,double allowa){
		//parameterised
		super(id,name,salary);
		this.allowance=allowa;
		
		
	}
	void display() {
		super.display();
		System.out.println(this.allowance);
		
	}
//	double calSaly() {
//		return salary+allowance;
//	}
	abstract double calSaly();
	
}
abstract class SalesManager2 extends EmployeeTest{
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
	SalesManager2(){
		//default
		this.incentive=20;
		this.target=50;
	}
	SalesManager2(int id, String name , double salary,double incentive,int target){
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
 
abstract class HR2 extends EmployeeTest{
	double commission;
	
	double getCommission() {
		return commission;
	}
	void setCommission(double commission) {
		this.commission = commission;
	}
	HR2(){
		//default
		this.commission=50;
		
	}
	HR2(int id, String name , double salary,double commi){
		//parameterised
		super(id,name,salary);
		this.commission=commi;
		
		
		
	}
	void display() {
		super.display();
		System.out.println(this.commission);
		
		
	}
//	 double calSaly() {
//		return salary+commission;
//	}
	abstract double calSaly();
	
	
}



 class AbstractFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeTest E1;
		
//		 E1=new Employee1();
//		 E2=new Employee1();

		 E1=new AdminTest(1,"Pooja",55000,5000);
		 E1.display();
		System.out.println("calculated salary of admin" + E1.calSaly());
		
		 E1=new SalesManager2(2,"shreya",7000,200,67);
		
		E1.display();
		System.out.println("calculated salary of sales manager" + E1.calSal());
		 E1 = new HR2(3, "Ankit", 6000, 100);
		 E1.display();
		System.out.println("calculated salary of hr"+ E1.calSaly());
		
     
		
		
	}

}