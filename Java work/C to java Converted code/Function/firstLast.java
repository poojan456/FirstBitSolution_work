package funct;
import java.util.Scanner;

public class firstLast {
public static int digit(int n){
	    
	    int i;
	    int sum;
	    int r1=n%10;
	    while(n>10){
	        //int rem=n%10;
	        n=n/10;
	    }
	    sum=r1+n;
	    return sum;
	    
	 
	}

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number:");
	    int n=sc.nextInt();
	    
	    
	    int t=digit(n);
	    System.out.println(t);
	}
	

	

}
