package string;

public class Equal {
	public static void main(String[]args) {
		String str1="abc";
		String str2="abcd";
		String str3=new String("abc");
		//if(str1==str3) {//not equal
		if(str1.equals(str3)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not equal");
		}
		
	}
	

}
