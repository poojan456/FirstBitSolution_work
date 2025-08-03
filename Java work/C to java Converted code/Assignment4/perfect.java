package assi4;

public class perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int q=1;q<=1000;q++){
	        int i=1;
	        int sum=0;
	        while(i<=q/2){
	            if(q%i==0){
	                sum=sum+i;
	                

	            }
	            i++;
	        }
	        if(sum==q){
	            System.out.println(q);
	        }
	    }

	}

}
