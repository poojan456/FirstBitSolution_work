package Assi1;
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 int original;
		    int rev=0;
		    System.out.println("enter the number\n");
		    int n=sc.nextInt();
		    original=n;
		    int temp=n;
		    while(n!=0){
		        int rem=n%10;
		        rev=rev*10+rem;
		        n=n/10;
		    }
		    if(original==rev){
		        System.out.println("palindrome");
		    }
		    else{
		        System.out.println("not palindrome");
		    }  

	}

}
