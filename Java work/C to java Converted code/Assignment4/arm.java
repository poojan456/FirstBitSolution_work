package assi4;

public class arm {

	public static void main(String[] args) {
	
		for(int s=1;s<=1000;s++){
	        int n=s;
	   
	    int temp=n;
	    int count=0;
	    while(temp>0){
	        temp=temp/10;
	        count++;
	      
	    }
	    temp=n;
	    int sum=0;
	    while(temp>0){
	        int r=temp%10;
	        int p=1;
	        for(int i=1;i<=count;i++){
	            p=p*r;
	        }
	        sum=sum+p;
	        temp=temp/10;
	    }
	    if(n==sum){
	        System.out.println(s);
	    }
	   

	    }

	}

}
