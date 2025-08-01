class test{
	int rollNo;
	String name;
	int mark;
	test(){// default constructor
		this.rollNo=90;
		this.name="unknown";
		this.mark=0;	
	}
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
		return mark;
	}
	void setMarks(int marks) {
		this.mark = marks;
	}
	void display(){
		System.out.println("roll number is"+this.rollNo);
		System.out.println("Name is :"+this.name);
		System.out.println("Marks is "+this.mark);
	}
	public test(int rollNo, String name, int mark) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.mark = mark;
	}
	
	
	
}
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test s1;// reference creation
		 s1=new test();
		
		 
		 //s1.display();
		 System.out.println("After c");
		 s1.setRollNo(111);
		 s1.setName("Poja");
		 s1.setMarks(18);
		 s1.display();
		 
		

	}

}



