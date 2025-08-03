package extracode;
//z+yz+xyz+wxyz
public class Series10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		char a='Z';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(a);
				a--;
			}
			if(i!=n)
			System.out.print("+");
		}
		
			
		}

}


