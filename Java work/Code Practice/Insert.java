//Insert an element at a specific position in an array.

// Input: {10, 20, 30, 40, 50}, Position: 3, Value: 25

// Output: {10, 20, 25, 30, 40, 50}


public class Insert{
    public static void main(String[]args){
       int[]a={10, 20, 30, 40, 50};
       int pos=3;
       int value=34;
       for(int i=a.length-1;i>=pos;i--){
        a[i]=a[i-1];
        

       } 
       a[pos-1]=value;

       for(int j=0;j<a.length;j++){
         System.out.println(a[j]);
       }


    }
}