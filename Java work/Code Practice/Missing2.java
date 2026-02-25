public class Missing2 {
    public static void main(String[] args) {
        int[]a={1,3,2,5};
        int n=a.length+1;
        int sum=n*(n+1)/2;
        int s=0;
        for(int i=0;i<a.length;i++){
            
            s=s+a[i];

        }
        int diff=sum-s;
        System.out.println("missing number is"+diff);
    }
    
}
