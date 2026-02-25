public class Remove_special{
    public static void main(String[] args) {
        String str="$ja!234@va%ok";

        String temp="";
        for(int i=0;i<str.length();i++){

            if(str.charAt(i)!='$' && str.charAt(i)!='!' && str.charAt(i)!='@' && str.charAt(i)!='%'){
                temp=temp+str.charAt(i);
            }

        }
        System.out.println(temp);
    }
}