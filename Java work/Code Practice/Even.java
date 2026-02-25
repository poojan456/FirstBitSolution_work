

public class Even{
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6 };
        //for odd
        for (int i = 0; i < a.length; i += 2) {
            //or if (i%2==0)
            System.out.println(a[i]);
        }

        System.out.println("wait and see");
        //for even 
        for(int i=0;i<a.length;i++){
            if(i%2!=0){
                System.out.println(a[i]);
            }
        }
    }

}
