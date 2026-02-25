public class RevString{
    public static void main(String[]args){
        String s="i love siddhu";
        s=s.trim();
        String[]a=s.split(" ");
        // String a[]=new String[s.length()];
        // for(int i=0;i<s.length();i++){
        //      if(s.charAt()==' '){
        //         a[i]=s.charAt(i);

        //     }
        //     System.out.println(a[i]);

        // }

        for(int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }

    
    }
}