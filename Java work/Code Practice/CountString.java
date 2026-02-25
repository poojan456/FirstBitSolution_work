// 10.Count the Frequency of Each Character in a String.

// Input: "hello world"

// Output: h → 1 time, e → 1 time, l → 3 times, o → 2 times, w → 1 time, r → 1 time, d → 1 time


public class CountString{
    public static void main(String[]args){
     
        String s = "I love Java";
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch==' '){
            continue;//SKIP
        }
        int count=0;
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)==ch){
                count++;
            }
        }
        System.out.println(ch+"->"+count);

       }


        

        


    }
}

