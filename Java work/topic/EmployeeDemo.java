import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;
import java.util.TreeSet;

class Employee implements  Comparable<Employee> {
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
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "\nEmployee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
//	public int hashCode() {
//		return Objects.hash(id, name, salary);
//	}
//	@Override
	public boolean equals(Object obj) {
		System.out.println("inside equal");
		Employee e2=(Employee)obj;
		if(this.id==e2.id) {
			return true;
		}
		else {
			return false;
		}
		
	}
	@Override
	public int compareTo(Employee e2) {
		// TODO Auto-generated method stub
		System.out.println("Inside compareto");
		
		return this.id-e2.id;
	}
	public int hashCode() {
   	 System.out.println("inside hashcode");
   	 return  this.id;
    }
	
	
	
	
	
	
	
}
public class EmployeeDemo {
	public static void main1(String[]args) {
		ArrayList<Employee> a1=new ArrayList<Employee> ();
		Employee e1=new Employee(105,"Pooja",7856);
		Employee e2=new Employee(109,"sahil",7823);
		Employee e3=new Employee(103,"kallu",7868);
		
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		
		System.out.println(a1);
		Employee e4 = new Employee(109, "sahil", 7823);
		
		if (a1.contains(e4)) {
			System.out.println("found");
		} else {
			System.out.println("not found");
		}
	}
	public static void main2(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Employee> a3 = new LinkedList<Employee>();
		a3.add(new Employee(111, "dada", 1899));
		a3.add(new Employee(112, "anna", 18009));
		a3.add(new Employee(113, "chotya", 189));
		
		System.out.println(a3);

	}
	public static void main3(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Employee> t1 = new <Employee>TreeSet();
		Employee e1 = new Employee(405, "Pooja", 3456);
		Employee e2 = new Employee(198, "aboli", 567668);
		Employee e3 = new Employee(160, "raj", 5678);
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		System.out.println(t1);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Employee> h1 = new HashSet<Employee>();
		Employee e1 = new Employee(405, "Pooja", 3456);
		Employee e2 = new Employee(198, "aboli", 567668);
		Employee e3 = new Employee(160, "raj", 5678);
		Employee e4=new Employee(198, "aboli", 5676868);
		h1.add(e1);
		h1.add(e2);
		h1.add(e3);
		h1.add(e4);
		System.out.println("helllo");
		System.out.println(h1);
		if(h1.contains(new Employee(405, "Pooja", 3456))) {
			System.out.println("found");
		}
		else {
			System.out.println("not found");
		}

	}

	
	

}
