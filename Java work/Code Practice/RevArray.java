
public class RevArray {

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6 };
        //int j = a.length;
        //int temp[]=new int[j];
       

        for (int i = 0, j=a.length-1; i <j; i++,j--)

        {
           int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            //x++;
    
        }

        for(int val:a){
            System.out.println(val);

        }
       

    }

}
