package Assi3;
import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int n=sc.nextInt();
	    
	    
	    int i=2;
	    int flag=0;
	    while(i<n){
	        if(n%i==0){
	            flag=1;
	            break;
	        }
	        i++;
	        
	    }
	    if(flag==0){
	        System.out.println("its prime");
	            
	        
	    }
	    else{
	        System.out.println("not prime number");
	    }


	}

}
