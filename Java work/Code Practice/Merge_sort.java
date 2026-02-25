import java.util.Arrays;
public class Merge_sort{
    public static void main(String[]args){
        int a1[]={1,3,5};
        int a2[]={2,4,6};
        int result[]=new int[a1.length+a2.length];
        int x=0;
        for(int i=0;i<a1.length;i++){
            result[x]=a1[i];
            x++;
        }
        for(int i=0;i<a2.length;i++){
            result[x++]=a2[i];

        }
        Arrays.sort(result);
        for(int p:result){
            System.out.println(p);
        }
           
            

     

        
       

    }
}