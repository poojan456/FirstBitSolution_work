package assi4;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int p=2;p<=100;p++){
			   
		    int i=2;
		    int flag=0;
		    while(i<p){
		        if(p%i==0){
		            flag=1; //not prime
		            break;    
		        }
		        i++;
		           
		    }
		    if(flag==0){
		        System.out.println(p);
		    }
		    
		   
		   }

	}

}
