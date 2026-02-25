public class HashCount {
    public static void main(String[]args){
        String s="move#all#hash#to#front";
        int c=0;
        String temp="";
      
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                c++;

            }
            
            
            
        }
        for(int i=0;i<c;i++){
            temp=temp+"#";

        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#'){
                temp=temp+s.charAt(i);
            }
        }
        System.out.println(temp);


    }
        
    
}
