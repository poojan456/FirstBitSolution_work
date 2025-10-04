package Lsearching;

public class max {
    public static void main(String[] args) {
        int arr[][]={{2,3,4,5},{45, 67,9},{23,1,4}};
        System.out.println(max(arr));

        
    }
    static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];

                }
                

            }
        }
        return max;
    }
    
}
