package funct;

public class Arm {

	public static void main(String[] args) {
		

		

			
				// TODO Auto-generated method stub
				 int n=153;
				 Armstrong(n);
				//algo, code , memory diagram
	}
				    
			

public static void Armstrong(int n) {
			int temp=n;
		    
		    int count=0;
		    while(temp>0){
		        temp=temp/10;
		        count++;
		       // sum=sum+n*count;
		       // n=n/10;
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
		        System.out.println("Armstrong");
		    }
		    else{
		        System.out.println("not armstrong");
		    }
	}

}
