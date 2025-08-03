package Assi3;
import java.util.Scanner;

public class FirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		 int n=sc.nextInt();
		    
		   
		    
		    int i;
		    int sum;
		    int r1=n%10;
		    while(n>10){
		        //int rem=n%10;
		        n=n/10;
		    }
		    sum=r1+n;
		    
		    System.out.println("the sum of number is"+sum);

	}

}
