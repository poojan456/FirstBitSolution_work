// 17.Check if a String Contains Only Digits.

// Input: "12345"

// Output: Yes, only digits

public class StringContainOnlydigit {
    public static void main(String[] args) {
        String s="12345";
        boolean onlyDigit=true;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch<'0' || ch>'9'){
                onlyDigit=false;
                break;
            }
        }
        if(onlyDigit){
            System.out.println("yes only digits");
        }
        else{
            System.out.println("no not only digits");
        }

        
    }
    
}
