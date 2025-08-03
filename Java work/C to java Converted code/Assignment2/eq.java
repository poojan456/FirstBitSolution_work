package Assi2;

public class eq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=10;
		int c=20;
		if(a==b&&b==c&&c==a){
	        System.out.println("its equilateral triangle");

	    }
	    else if(a==b ||a==c || b==c){
	        System.out.println("its isoscalen triangle");
	    }
	    else{
	        System.out.println("its scalen triangle");
	    }

	}

}
