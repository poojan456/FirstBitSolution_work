import java.util.Scanner;
public class B2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int search=sc.nextInt();
        boolean found=false;
        System.out.println("Enter five numbers:");
        for(int i=1;i<=5;i++){
            int n=sc.nextInt();
            if(n==search){
                System.out.println("found");
                found=true;
                break;
                                  
            }
           
        }
        if(!found){
            System.out.println("not found");
        }

    }
    
}
