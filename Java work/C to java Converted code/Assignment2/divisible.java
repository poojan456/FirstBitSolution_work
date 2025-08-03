package Assi2;
import java.util.Scanner;
public class divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    System.out.println("Enter the number");
	   
	    if(n%3==0 && n%5==0){
	        System.out.println("Divisible by both");
	    }
	    else if(n%3==0){
	        System.out.println("divisible by 3 but not 5");

	    }
	    else if(n%5==0){
	       System.out.println("divisible by 5 but not 3");
	    }
	    else{
	        System.out.println("divisible by none");
	    }

	}

}
