import java.util.Scanner;
public class userinput {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first value");
       int a=sc.nextInt();
        System.out.println("enter second value");
       int b=sc.nextInt();
        int sum=a+b;
        System.out.println("sum of two number:"+sum);
    }
    
}
