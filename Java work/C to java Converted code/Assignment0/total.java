package Assi0;
import java.util.Scanner;

public class total {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0;
		Scanner sc=new Scanner(System.in);
	    System.out.println("five marks of subject are :");
	    int p=0;
	    for(int i=1;i<=5;i++) {
	    	int a=sc.nextInt();
	    	total=a+p;
	    	
	    }
	    
	    

	    System.out.println("the total marks of student is "+total);
	    float perc=(total/5);
	    System.out.println("the percetage of marks is "+perc);

	}

}
