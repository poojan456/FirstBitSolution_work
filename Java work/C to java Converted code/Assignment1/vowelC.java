package Assi1;
import java.util.Scanner;

public class vowelC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char p=sc.next().charAt(0);
	    System.out.println("Enter character");
	    
	    if(p=='a'||p=='e'||p=='i'||p=='o'||p=='u'||p=='A'||p=='E'||p=='I'||p=='O'||p=='U'){
	        System.out.print("its vowel");
	    }
	    else{
	        System.out.println("consonant");
	    }
	

	}

}
