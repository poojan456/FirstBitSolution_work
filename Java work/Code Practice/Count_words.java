public class Count_words{
    public static void main(String[]args){
        String s="My name   is    pooja    ";
        s=s.trim();

        int count=1;
        
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ' &&s.charAt(i+1)!=' '){
                count++;

            }
        }
        System.out.println(count);

    }
}