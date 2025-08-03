package Assi3;

public class perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=141;
	    
	    int sum=0;
	    int i=1;
	    while(i<=n/2){
	        if(n%i==0){
	            sum=sum+i;
	            
	        }
	        i++;
	    }
	    if(n==sum){
	        System.out.println("perfect number");

	    }
	    else{
	        System.out.println("not perfect");
	    }

	}

}
