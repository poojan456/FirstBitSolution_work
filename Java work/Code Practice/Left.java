public class Left{
    public static void main(String[]args){
        int a[]={10,20,30,40,50};
        
       int temp=a[0];
       int temp2=a[1];

       
        for(int i=0;i<a.length-2;i++){
            a[i] = a[i + 2];

        }
        a[a.length-1]=temp2;
        a[a.length-2]=temp;

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
       
       
         
        

    }
}