package Assi1;
import java.util.Scanner;

public class vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter your age");
		int age=sc.nextInt();
	    
	    
	    if(age>=18){
	        System.out.print("You can vote");
	    }
	    else{
	        System.out.print("u cannot vote");
	    }

	}

}
