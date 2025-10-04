package BinaryS;

public class BinarySearchingImp {
	
	public static int Searching(int[]a,int target) {
		int start=0;
		int end=a.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(a[mid]==target) {
				return mid;
				
			}
			else if(a[mid]<target) {
				start=mid+1;//right
			}
			else {
				end=mid-1;
				
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {1,2,3,4,5,6};
		int target=6;
		int result=Searching(a,target);
		if(result==-1) {
			System.out.println("not found");
		}
		else {
			System.out.println("found at index"+" "+result);
		}
		
		
		
		
		
		
			

	
	
		
		
		
	}
}