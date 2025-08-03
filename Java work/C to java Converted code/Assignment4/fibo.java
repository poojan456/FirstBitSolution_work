package assi4;

public class fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
	   
	    int a=0, b=1;
	    for(int i=2;i<n;i++){
	        int c=a+b;
	        System.out.println(c);
	        a=b;
	        b=c;
	    } 

	}

}
