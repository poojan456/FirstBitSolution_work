package p1;
import java.io.*;
class Student implements Serializable{
	int roll;
	String name;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	int getRoll() {
		return roll;
	}

	void setRoll(int roll) {
		this.roll = roll;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	
		
	
}

public class Test {

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		try {
			Student s1=new Student(101,"pooja");
			FileOutputStream fos=new FileOutputStream("myfile.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(s1);
			System.out.println("data stored");
			System.out.println(s1);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
			
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Student s1=new Student();
			FileInputStream fis=new FileInputStream("myfile.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Student s1=(Student)ois.readObject();
			System.out.println(s1);
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
			
		}

	}


}
