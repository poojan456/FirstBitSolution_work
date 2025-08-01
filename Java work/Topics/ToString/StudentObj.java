
class StudentNew{
	int fid;
	String name;
	
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
	
    StudentNew(){
		// TODO Auto-generated constructor stub
    	this.fid=100;
    	this.name="not given";
    		}
    StudentNew(int i,String nam){
		// TODO Auto-generated constructor stub
    	this.fid=i;
    	this.name=nam;
    	
	}
//    void display() {
//    	System.out.println(this.fid);
//    	System.out.println(this.name);
//    	
//    }
    public String toString() {
    	//return "Hello";
    	return this.fid + " " + this.name;
    }
       
}
//class stud end
public class StudentObj{

	public static void main(String[] args){
		// TODO Auto-generated method stub
		StudentNew s1=new StudentNew(101,"Pooja");
		System.out.println(s1);
		System.out.println(s1.toString());
	}

}

