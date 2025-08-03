package funct;

public class marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=74;
		String x=Student(marks);
		System.out.println(x);
		
		

	}
	public static String Student(int marks) {
		if(marks>75)
			return "Distinction";
		else if(marks>65)
	        return "First Class";
	    else if(marks>55)
	        return "Second Class";
	    else if(marks>=40)
	        return "Pass Class";
	    else
	        return "Fail";
		
	}

}
