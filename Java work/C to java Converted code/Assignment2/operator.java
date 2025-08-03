package Assi2;

public class operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=35;
		int b=7;
		int res;
	    char p='/';
	   
	  
	    
	    if(p=='+'){
	        res=a+b;  
	    }
	    else if(p=='-'){
	        res=a-b;
	    }
	    else if(p=='*'){
	        res=a*b;
	    }
	    else if(p=='/'){
	        res=a/b;
	    }
	    else{
	        res=a%b;
	    }
	    System.out.println("The result is "+res);

	}

}
