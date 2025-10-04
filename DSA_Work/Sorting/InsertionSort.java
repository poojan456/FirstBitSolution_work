package p0;

public class InsertionSort {

	public static void main(String[] args) {
	
		int[]a= {24,5,11,8,17};
		int n=a.length;
		for(int i=1;i<n;i++) {
			int d=a[i];
			int j=i-1;
			for(;j>=0 && a[j]>d;j--) {
				a[j+1]=a[j];
			}
			a[j+1]=d;
					
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}

	}

}
