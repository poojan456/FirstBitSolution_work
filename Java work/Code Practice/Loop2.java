public class Loop2 {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=5;
        int i=0;
        System.out.println(a);
        System.out.println(b);
        int sum=0;
           // 0 1 1 2 3 5
        while(i<5){
            int c=a+b;
            sum=sum+c;
           // System.out.println(c);
           System.out.println(sum);
            a=b;
            b=c;
            i++;


            
        }
    }
    
}
