package Assi2;

public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=35;
	    
	    if(age<12){
	        System.out.print("Child");
	    }
	    else if(age>=12 &&age<=19){
	        System.out.println("Teenager");
	    }
	    else if(age>=20 && age<59){
	        System.out.println("Adult");
	    }
	    else if(age>=60){
	        System.out.println("senior");
	    }
	    else{
	        System.out.println("invalid ");
	    }

	}

}
