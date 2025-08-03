package funct;

public class Accept {

	public static void main(String[] args) {
		  int age=56;
		    
		    int n=accept(age);
		    if(n==1){ 
		        System.out.println("Child");
		    }
		    else if(n==2){
		        System.out.println("Teenager");
		    }

		    else if(n==3){
		        System.out.println("Adult");

		    }
		    else if(n==4){
		         System.out.println("senior");

		    }
		    else {
		         System.out.println("invalid ");
		    }

		}
		public static int accept(int age){
		     
		    if(age<12){
		       return 1;
		    }
		    else if(age>=12 &&age<=19){
		        return 2 ;
		    }
		    else if(age>=20 && age<59){
		        return 3;
		    }
		    else if(age>=60){
		        return 4;
		       
		    }
		    else{
		       return 0;
		    }

	}

}
