package funct;

public class palindrome {

	public static void main(String[] args) {
		int n=121;
	    
	    int k=isPalindrome(n);
	    if(k==1)
	    System.out.println("palindrome");
	    else{
	        System.out.println("not palindrome");
	    }
	}
	public static int isPalindrome(int n){
	    int rev=0;
	    int temp=n;
	    while(n>0){
	        int rem=n%10;
	        rev=rev*10+rem;
	        n=n/10;
	    }
	    if(temp==rev){
	        return 1;
	    }
	    else{
	        return 0;
	    }
		

	}

}
