class Employee{
	int e_id;
	String e_name;
	double salary;
	 Employee() {// Default constructor
		 //default values written here
		 this.e_id=0;
		 this.e_name="not given";
		 this.salary=15000;	
	}
	 // setter and getter
	int getE_id() {
		return e_id;
	}
	void setE_id(int e_id) {
		this.e_id = e_id;
	}
	String getE_name() {
		return e_name;
	}
	void setE_name(String e_name) {
		this.e_name = e_name;
	}
	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}
	void display() {
		System.out.println("ID of emplyee"+this.e_id);
		System.out.println("name of emplyee"+this.e_name);
		System.out.println("salary of emplyee"+this.salary);
	}
}// employee class ends here
class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1,e2;// reference creation
		e1=new Employee();
		e1.display();
		e1.setE_id(101);
		e1.setE_name("Pooja");
	System.out.println("After setting value");
	e1.display();
	e2=new Employee();
	
	e2.setE_id(102);
	e2.setE_name("Poo");
	e2.display();
	double sal=e1.getSalary();
	double sal2=e2.getSalary();
	if(sal>sal2) {
		System.out.println("first one has greater salart");
	}
	else {
		System.out.println("second one ");
	}

	
		
		

	}

}
