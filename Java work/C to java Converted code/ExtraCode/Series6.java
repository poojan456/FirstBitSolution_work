package extracode;
//1+22+333+
public class Series6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
				
			}
			if(i!=n) {
				System.out.print("+");
			}
		}

	}

}
