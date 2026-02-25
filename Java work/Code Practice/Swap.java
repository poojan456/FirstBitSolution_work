public class Swap {
    public static void main(String[] args) {
          int a[]={11,1,9,18,2,3};
          for(int i=0;i<a.length-1;i++){
            int temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;

            System.out.println(a[i]);
            

        }

    }
    
}
