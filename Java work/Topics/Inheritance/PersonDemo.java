
class Person {
    String name;
    int age;
    String gender;

    // Getters and Setters
    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }
    void setAge(int age) {
        this.age = age;
    }

    String getGender() {
        return gender;
    }
    void setGender(String gender) {
        this.gender = gender;
    }

    // Default constructor
    Person() {
        this.name = "not given";
        this.age = 0;
        this.gender = "not mentioned";
    }

    // Parameterized constructor
    Person(String p_name, int p_age, String p_gender) {
        this.name = p_name;
        this.age = p_age;
        this.gender = p_gender;
    }

    void display() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);
    }
}

// Subclass: Teacher
class Teacher extends Person{
    String subject;
    String teacherName;
    int teacherID;

    String getSubject(){
        return subject;
    }
    void setSubject(String subject){
        this.subject=subject;
    }

    String getTeacherName(){
        return teacherName;
    }
    void setTeacherName(String teacherName){
        this.teacherName=teacherName;
    }

    int getTeacherID(){
        return teacherID;
    }
    void setTeacherID(int teacherID){
        this.teacherID=teacherID;
    }

    Teacher(){
        super();
        this.subject="not given";
        this.teacherName="not given";
        this.teacherID=0;
    }

    Teacher(String name, int age, String gender, String subject, String teacherName, int teacherID){
        super(name, age, gender);
        this.subject=subject;
        this.teacherName=teacherName;
        this.teacherID=teacherID;
    }

    void display(){
        super.display();
        System.out.println(this.subject);
        System.out.println(this.teacherName);
        System.out.println(this.teacherID);
    }
}

// Subclass: Student
class Students extends Person{
    int rollNumber;
    int marks;

    int getRollNumber() {
        return rollNumber;
    }
    void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    int getMarks(){
        return marks;
    }
    void setMarks(int marks){
        this.marks=marks;
    }

    Students(){
        super();
        this.rollNumber=0;
        this.marks=0;
    }

    Students(String name, int age, String gender, int rollNumber, int marks){
        super(name, age, gender);
        this.rollNumber=rollNumber;
        this.marks=marks;
    }

    void display(){
        super.display();
        System.out.println(this.rollNumber);
        System.out.println(this.marks);
    }
}

// Subclass: Doctor
class Doctor extends Person{
    String specialization;
    int fees;

    String getSpecialization(){
        return specialization;
    }
    void setSpecialization(String specialization){
        this.specialization=specialization;
    }

    int getFees(){
        return fees;
    }
    void setFees(int fees){
        this.fees=fees;
    }

    Doctor(){
        super();
        this.specialization="not given";
        this.fees=0;
    }

    Doctor(String name, int age, String gender, String specialization, int fees){
        super(name, age, gender);
        this.specialization=specialization;
        this.fees=fees;
    }

    void display(){
        super.display();
        System.out.println(this.specialization);
        System.out.println(this.fees);
    }
}


public class PersonDemo {
    public static void main(String[] args){
        Person p1=new Person();
        p1.display();

        Teacher t1=new Teacher("Pooja", 25, "Female", "Maths", "Pooja N.", 101);
        t1.display();

        Students s1=new Students("Ravi", 20, "Male", 55, 88);
        s1.display();

        Doctor d1=new Doctor("Dr. Sahil", 35, "Male", "Cardiology", 2000);
        d1.display();
    }
}

