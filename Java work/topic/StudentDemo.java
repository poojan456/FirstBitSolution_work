import java.util.*;
class Student implements Comparable<Student> {
	int rollNo;
	String name;
	int marks;
	int getRollNo() {
		return rollNo;
	}
	void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getMarks() {
		return marks;
	}
	void setMarks(int marks) {
		this.marks = marks;
	}
	public Student() {
		super();
		
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "\nStudent [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(marks, name, rollNo);
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("inside equal");
		Student s2=(Student)obj;
		if(this.rollNo==s2.rollNo) {
			return true;
		}
		else {
			return false;
		}
	
	@Override
	public int compareTo(Student s2) {
		// TODO Auto-generated method stub
		System.out.println("Inside compareto");
		
		return this.rollNo-s2.rollNo;
	}
	
	
	
	
	
}
public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> a1=new ArrayList<Student> ();
		Student s1=new Student(5,"Pooja",78);
		Student s2=new Student(2,"Vnni",58);
		Student s3=new Student(3,"sadhya",50);
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		Collections.sort(a1);
		
		System.out.println(a1);
		Student s4 = new Student(3, "sadhya", 50);
		
		if (a1.contains(s4)) {
			System.out.println("found");
		} else {
			System.out.println("not found");
		}
	}
	public static void main2(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Student> l1 = new LinkedList<Student>();
		l1.add(new Student(6, "pooja", 180));
		l1.add(new Student(9, "rohan", 18));
		l1.add(new Student(1, "rohit", 18));
		
		System.out.println(l1);

	}
	public static void main8(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Student> t1 = new TreeSet<Student>();
		Student s1 = new Student(45, "Pooja", 34);
		Student s2 = new Student(18, "aboli", 56);
		Student s3 = new Student(10, "raj", 78);
		t1.add(s1);
		t1.add(s2);
		t1.add(s3);
		System.out.println(t1);
	}
	public static void main5(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student> h1 = new HashSet<Student>();
		Student s1=new Student(5,"Pooja",78);
		Student s2=new Student(2,"Vnni",58);
		Student s3=new Student(3,"sadhya",50);
		Student s4 =new Student(2, "Vnni", 58);
		h1.add(s1);
		h1.add(s2);
		h1.add(s3);
		h1.add(s4);
		System.out.println("helllo");
		System.out.println(h1);
		if(h1.contains(new Player(5, "Pooja", 78))) {
			
			System.out.println("found");
		}
		else{

			System.out.println("not found");
		}

	}

	
	
}

