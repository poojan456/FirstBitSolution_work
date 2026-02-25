public class RemoveOccurance{
    public static void main(String[]args){
        int a[]={1,2,2,3,4,2,5};
        int remove=2;
        int temp[]=new int[a.length];
        int x=0;
       
        for(int i=0;i<a.length;i++){
            
            if(a[i]!=remove){
               

                temp[x]=a[i];
                x++;

            }
             
        }
        for(int i=0;i<temp.length-3;i++){
            System.out.println(temp[i]);

        }

    }
}