
public class CountEvenOdd {
    public static void main(String[] args) {
        int a[]={11,1,9,18,2,3};
        int Evencount=0;
        int oddCount=0;
        for(int i=0;i<a.length;i++){
           
            if(a[i]%2==0){
                Evencount++;
                  
            }

            


            
            else{
                oddCount++;
                
              
            }
        }
         System.out.println(Evencount);
           System.out.println(oddCount);
    }
    
}
