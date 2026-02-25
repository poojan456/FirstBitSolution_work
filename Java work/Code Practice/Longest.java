// 16.Find the Longest Word in a String.
// Input: "Find the longest word in a string"
// Output: "longest"
public class Longest {
    public static void main(String[]args){
        String s="Find the longest word in a string";
       String[] words=s.split(" ");
        String longest=words[0];
        for(int i=0;i<words.length;i++){
            if(words[i].length()>longest.length()){
                longest=words[i];
            }
            

        }
        System.out.println(longest);
       


    }
    
}
