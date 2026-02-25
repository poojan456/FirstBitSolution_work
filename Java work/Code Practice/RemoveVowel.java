// 12.Remove All Vowels from a String.
// Input: "beautiful"
// Output: "btfl"
public class RemoveVowel{
    public static void main(String[]args){
        String s="beatiful";
        for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);

            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'
                    && ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
                System.out.print(ch);
            }
        }
        


    }
}