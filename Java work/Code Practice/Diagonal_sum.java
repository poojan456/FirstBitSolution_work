public class Diagonal_sum{
    public static void main(String[]args){
        int[][]a={
            {1,2,3},
            {4,5,6},
            {2,2,3}
        };
        int primarySum=0;
        int secSum=0;
        int n=a.length;

        for(int i=0;i<a.length;i++){
            primarySum=primarySum+a[i][i];
            secSum=secSum+a[i][n-1-i];

        }
          System.out.println(primarySum);
        System.out.println(secSum);
      

    }
}