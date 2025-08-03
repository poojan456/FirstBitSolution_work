package extracode;
// A+BC+DEF+GHIJ...
public class Series8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		 char a='A';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(a);
				a++;
			}
			System.out.print("+");
		}

	}

}

