package Assi1;
import java.util.Scanner;

public class UpperL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any character");
		
		char ch = sc.next().charAt(0);
	    
	    
	    if(ch>='a'&& ch<='z'){
	        
	        System.out.println(" lower case "+ch);
	        
	    }
	    else if(ch>='A'&& ch<='Z'){
	       // ch=ch+32;
	        System.out.println(" upper case "+ch);
	        
	    }
	    else if(ch>='0'&&ch<='9') {
	        System.out.println("its a digit");
	    }
	    

	}

}
