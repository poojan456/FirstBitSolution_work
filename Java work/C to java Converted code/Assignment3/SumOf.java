package Assi3;
import java.util.Scanner;

public class SumOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc=new Scanner(System.in);
		   
	    
	    
	    System.out.println("Enter the start");
	    int start=sc.nextInt();
	    
	   System.out.println("Enter the end");
	    int end=sc.nextInt();
	   
	    for(int i=start;i<=end;i++){
	        sum=sum+i; 
	    }
	    System.out.println("the sum of numbers is "+sum);

	}

}
