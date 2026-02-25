// 11.Check If a String is a Palindrome.
// Input: "madam"
// Output: "madam" is a palindrome

public class StringPalindrome{
    public static void main(String[]args){
        // String str="pooja";
        // for(int i=str.length()-1;i>=0;i--){
        //     System.out.print(str.charAt(i));
        // }
        String str="madamss";
        String rev="";
        

       
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);

            
        }
        if(str.equals(rev)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

    }
}
