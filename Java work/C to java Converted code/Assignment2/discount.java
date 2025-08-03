package Assi2;

public class discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price=600;
	    char response='Y';
//	    printf("if u r student then enter Y or no the enter N");
//	    scanf(" %c",&response);
//	    printf("enter the price");
	    //scanf("%d",&price);
	    if(response=='Y'){
	        if(price>=500){
	            System.out.println("you got 20 discount");
	        }
	        else{
	            System.out.println("you got 10 discount");
	        }
	    }
	    else{
	        if(price>=600){
	            System.out.println("You got 15 discount");
	        }
	        else{
	            System.out.println("No discount");
	        }
	    }
	    

	}

}
