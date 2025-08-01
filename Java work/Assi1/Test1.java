class Employees{
	int e_id;
	String e_name;
	double salary;
	 Employees(int i, String nam, double sall) {// Parameterised constructor
		 //default values written here
		 this.e_id=i;
		 this.e_name=nam;
		 this.salary=sall;	
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
class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees e1;// reference creation
		e1=new Employees(101,"pooja",6789000);
		e1.display();
	
	}

}