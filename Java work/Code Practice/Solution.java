import java.util.Scanner;

public class Solution {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int nums[]=new int[5];
       
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
         int target=sc.nextInt();
         for(int i=0;i<nums.length;i++){
             for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println(i+" "+j);

                }

            }

         }


    }
}
