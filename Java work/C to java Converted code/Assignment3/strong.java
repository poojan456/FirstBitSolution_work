package Assi3;

public class strong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=135;
	    int temp;
	    
	    int sum=0;
	    temp=n;
	    int rem;
	    while(n>0){
	        rem=n%10;
	        int fact=1;
	        for(int i=1;i<=rem;i++){
	         
	            fact=fact*i;    
	        }
	        sum=sum+fact;
	        n=n/10;
	    }
	    if(sum==temp){
	        System.out.println("strong number\n");
	    }
	    else{
	        System.out.println("not strong number\n");
	    }

	}

}
