class Student{
	int fid;
	String name;
	int dist;
	int getFid() {
		return fid;
	}
	void setFid(int fid) {
		this.fid = fid;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getDist() {
		return dist;
	}
	void setDist(int dist) {
		this.dist = dist;
	}
    Student(){
		// TODO Auto-generated constructor stub
    	this.fid=100;
    	this.name="not given";
    	this.dist=0;
	}
    Student(int i,String nam,int distance){
		// TODO Auto-generated constructor stub
    	this.fid=i;
    	this.name=nam;
    	this.dist=distance;
	}
    void display() {
    	System.out.println(this.fid);
    	System.out.println(this.name);
    	System.out.println(this.dist);
    }
    
   
    
    
}
//class stud end
class PlacedStudent extends Student{
	String CName;
	String Desig;
	String getCName() {
		return CName;
	}
	void setCName(String cName){
		CName = cName;
	}
	String getDesig(){
		return Desig;
	}
	void setDesig(String desig){
		Desig = desig;
	}
	PlacedStudent(){
		super();
		this.CName="Not given";
		this.Desig="Not given";
		
	}
	PlacedStudent(int i, String name , int dist, String Names,String Designation){
		super(i,name,dist);
		this.CName=Names;
		this.Desig=Designation;
		
	}
	void display() {
		super.display();
		System.out.println(this.CName);
		System.out.println(this.Desig);
	}
	
	
}

class StudentTest{

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		PlacedStudent ps1=new PlacedStudent(1,"Pooja",500,"Hexaware","software developer");
		ps1.display();
		
		PlacedStudent ps2=new PlacedStudent(1,"Ruddhi",600,"Capgimini","Network Engineer");
		ps2.display();

	}

}
