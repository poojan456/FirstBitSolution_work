package Assi2;

public class marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=67;
		String mark;
	    
	    if(marks>75){
	        mark="Distinction";
	    }
	    else if(marks>65){
	        mark="First Class";
	    }
	    else if(marks>55){
	        mark="Second Class";
	    }
	    else if(marks>=40){
	        mark="pass class";
	    }
	    else{
	        mark="fail";
	    }
	    System.out.println(mark);

	}

}
