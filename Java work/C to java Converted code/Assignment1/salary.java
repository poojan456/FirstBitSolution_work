package Assi1;
import java.util.Scanner;
public class salary {
	public static void main(String[]args) {
		
	
	float da=0.10f;
    float ta=0.20f;
    float hr=0.25f;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the basic ");
    float basic=sc.nextFloat();
    
    
    if(basic<=5000.0){
        da=0.1f*basic;
        ta=0.2f*basic;
        hr=0.25f*basic;
        
    }
    else{
        da=0.15f*basic;
        ta=0.25f*basic;
        hr=0.3f*basic;
    }
    double total=da+ta+hr+basic;
    System.out.println("total salary is "+total);
	}

}
