public class Delete{
    public static void main(String[]args){
        int[]a={1,2,13,4,56,4};
        int pos=3;
        for(int i=pos-1;i<a.length-1;i++){
            a[i]=a[i+1];
        }
         for (int i = 0; i < a.length-1; i++) {
            System.out.print(a[i] + " ");
        }


    }
}