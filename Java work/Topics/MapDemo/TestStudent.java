package studenttest;
import studentdata.Student;

import java.util.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;

 class RollnoComparator implements Comparator<Student> {
	@Override
    public int compare(Student s1, Student s2) {
        return s1.getRollNumber() - s2.getRollNumber();
    }
}
 class NameComparator implements Comparator<Student> {
	@Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}
 class MarksComparator implements Comparator<Student> {
	@Override
    public int compare(Student s1, Student s2) {
        return s1.getMarks() - s2.getMarks();
    }
}
 public class TestStudent {

	 
	 Scanner sc = new Scanner(System.in);
	    ArrayList<Student> students = new ArrayList<Student>();

	    public static void main(String[] args) {
	        TestStudent st = new TestStudent();
	        st.runMenu();
	    }

	    public void runMenu() {
	        int choice;
	        do {
	            System.out.println("\n--- Student Management ---");
	            System.out.println("1. Add Student");
	            System.out.println("2. Remove Student by Roll No");
	            System.out.println("3. Update Student by Roll No");
	            System.out.println("4. Display All Students");
	            System.out.println("5. Sort by Roll No");
	            System.out.println("6. Sort by Name");
	            System.out.println("7. Sort by Marks");
	            System.out.println("8. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1: addStudent();
	                break;
	                case 2: removeStudent(); 
	                break;
	                case 3: updateStudent(); 
	                break;
	                case 4: display(); break;
	                case 5: Collections.sort(students, new RollnoComparator());
	                display(); 
	                break;
	                case 6: Collections.sort(students, new NameComparator());
	                display(); 
	                break;
	                case 7: Collections.sort(students, new MarksComparator());
	                display();
	                break;
	                case 8: System.out.println("Exiting"); 
	                break;
	                default: System.out.println("Invalid choice Try again.");
	            }
	        } while (choice != 8);
	    }
	    
         // add student parat//
	    public void addStudent() {
	        System.out.print("Enter Roll No: ");
	        int roll = sc.nextInt();
	        sc.nextLine();
	        
	        System.out.print("Enter Name: ");
	        String name = sc.nextLine();
	        System.out.print("Enter Marks: ");
	        
	        int marks = sc.nextInt();
	        students.add(new Student(roll, name, marks));
	        System.out.println("Student added successfully!");
	    }
	    
          //remove student part//
	    public void removeStudent() {
	        System.out.print("Enter Roll No to remove: ");
	        int roll = sc.nextInt();
//	        boolean removed = students.removeIf(s -> s.getRollNumber() == roll);
//	        System.out.println(removed ? "Student removed!" : "Student not found!");
	    }
	    
          //update student part//
	    public void updateStudent() {
	        System.out.print("Enter Roll No to update: ");
	        int roll = sc.nextInt();
	        sc.nextLine();
	        for (Student s : students) {
	            if (s.getRollNumber() == roll) {
	                System.out.print("Enter new name: ");
	                s.setName(sc.nextLine());
	                System.out.print("Enter new marks: ");
	                s.setMarks(sc.nextInt());
	                System.out.println("Student updated!");
	                return;
	            }
	        }
	        System.out.println("Student not found!");
	    }

	    public void display() {
	        if (students.isEmpty()) {
	            System.out.println("No students to display.");
	            return;
	        }
	        for (Student s : students) {
	            System.out.println(s);
	        }
	    }
	}
