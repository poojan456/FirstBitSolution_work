package assi4;

public class strong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int t=1;t<=50;t++){
	        int num = t;
	    // printf("Enter number");
	    // scanf("%d",&n);
	    int sum=0;
	  
	    int rem;
	    while(num>0){
	        rem=num%10;
	        int fact=1;
	        for(int i=1;i<=rem;i++){
	         
	            fact=fact*i;    
	        }
	        sum=sum+fact;
	        num=num/10;
	    }
	    if(sum==t){
	        System.out.println(t);
	    }
	    }
	}

}


