public class Swap1 {
    public static void main(String[]aStrings){
        int a[]={10,20,30,40,50,60,70,80,90,100};

        for(int i=0;i<a.length;i++){
            if(i%2!=0){
                int temp=a[i];
                a[i]=a[i-1];
                a[i-1]=temp;

            }
            
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        
        



    }
    
    
}
