
public class Test10 {
	public static void main(String[]arg) {
		int a=10;
		int b=0;
		int c;
		
		
		try {
			if(b==0) {
				throw new ArithmeticException();
			}
			else {
				c=a/b;
				System.out.println("Ans is"+" "+c);
			}
		}
		catch(Exception e) {
			System.out.println("plzz don't provide 0 in b");
		}
		
	
	}

}
