package Assi1;
import java.util.Scanner;

public class Leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		    System.out.println("Enter year\n");
		    int year=sc.nextInt();
		    if(year%4==0 ||year%400==0 && year%100!=0){
		        System.out.println("Leap year\n");
		    }
		    else{
		        System.out.println("not leap yr\n");
		    }

	}

}
