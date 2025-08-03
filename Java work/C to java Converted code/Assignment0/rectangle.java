package Assi0;
import java.util.Scanner;

public class rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter length: ");
	    int l=sc.nextInt();
	    System.out.println("Enter width: ");
	    int width=sc.nextInt();
	    int area=l*width;
	    int perimeter = 2 * (l + width);
	    System.out.println("area of rectangle is"+ area);
	    System.out.println("Perimeter of rectangle is"+ perimeter);

	}

}
