public class Replace {
    public static void main(String[] args) {
         String a="apple";
         String b="ampale";
        String m="";
         for(int i=0;i<a.length();i++){
            if(a.charAt(i)==b.charAt(i)){
                 m=m+'G';
            }
            else{
                m=m+'B';
            }

         }
         System.out.println(m);
    }

   

    
}
