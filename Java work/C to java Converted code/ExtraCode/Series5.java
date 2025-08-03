package extracode;

public class Series5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		//char a='A';
		for(int i=1;i<=n;i++) {
			for(char j='A';j<'A'+i;j++) {
				System.out.print(j);
			}
			if(i!=n) {
				System.out.print("+");
			}
		}
		

	}

}
