
 abstract class Employee12{
	int id;
	String name;
	double salary;
	
    int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getName(){
		return name;
	}
	void setName(String name){
		this.name = name;
	}
	double getSalary(){
		return salary;
	}
	void setSalary(double salary){
		this.salary = salary;
	}
	Employee12(){
		//Default constructor
    	this.id=100;
    	this.name="not given";
    	this.salary=100;	
	}
    Employee12(int iD,String nam,double sal) {
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
 //object here refere
class AdminDemo extends Employee12{
	double allowance;
	
	
	double getAllowance() {
		return allowance;
	}
	void setAllowance(double allowances) {
		allowance = allowances;
	}
	AdminDemo(){
		//default
		super();
		this.allowance=100;
			
	}
	AdminDemo(int id, String name , double salary,double allowa){
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
class SalesManagerDemo extends Employee12{
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
	SalesManagerDemo(){
		//default
		this.incentive=20;
		this.target=50;
	}
	SalesManagerDemo(int id, String name , double salary,double incentive,int target){
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
 
class HrDemo extends Employee12{
	double commission;
	
	double getCommission() {
		return commission;
	}
	void setCommission(double commission) {
		this.commission = commission;
	}
	HrDemo(){
		//default
		this.commission=50;
		
	}
	HrDemo(int id, String name , double salary,double commi){
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

 class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee12 E1;//reference
		Employee12 E2;
		
//		 E1=new Employee12();
//		 E2=new Employee12();

		AdminDemo a1=new AdminDemo(1,"Pooja",55000,5000);
		System.out.println("calculated salary of admin" + a1.calSaly());
		SalesManagerDemo s1=new SalesManagerDemo(2,"shreya",7000,200,67);
		System.out.println("calculated salary of sales manager" + s1.calSal());
		HrDemo hr1 = new HrDemo(3, "Ankit", 6000, 100);
		System.out.println("calculated salary of hr"+ hr1.calSaly());	
	}

}
