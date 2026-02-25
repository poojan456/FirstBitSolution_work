public class String_arr{
    public static void main(String[]args){
        String[] str={"one","three","five","seveb"};
        String[] str1={"two","four","six"};
        int n=str1.length+str.length;
        String s[]=new String[n];
        int x=0;
        for(int i=0;i<str.length;i++){
           s[x]=str[i];
           x++;
          
        }
         for(int i=0;i<str1.length;i++){
           s[x++]=str1[i];
            
          
        }
         for(int i=0;i<s.length;i++){
           System.out.println(s[i]);
          
        }


    }
}