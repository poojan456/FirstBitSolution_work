package Assi3;

public class palindrome {
	public static void main() {
		int n=121;
		int temp;
	    int rev=0;
	    temp=n; 
	    while(n>0){
	        int rem=n%10;
	        rev=rev*10+rem;
	        n=n/10;
	    }
	    if(rev==temp){
	        System.out.println("Palindrome");
	    }
	    else{
	        System.out.println("not palindrome");
	    }
		
	}
	
}


