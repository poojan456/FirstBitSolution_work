package condition;
public class checkPalidromeNo {
    public static void main(String[] args) {
        int no = 145;// 121
        int temp = no;
        int rev = 0;
        int rem;
        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;

        }
        if (no == rev) {
            System.out.println("the number is palidrome");
        } else {
            System.out.println("the number is not palidrome number");
        }
    }

}

/*n=121
 int n=121
 int temp=n;
 int rev=0;
 int rem;
 while(n>0){
 rem=temp%10;
 rev=rev*10+rem;
 temp=temp/10;
 if(rev==no)

 }
*/