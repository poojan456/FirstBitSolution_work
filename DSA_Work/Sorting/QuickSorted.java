//package p0;
//
//public class QuickSorted {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int a[]= {36,52,1,3,49,10};
//		int n=a.length;
//		int pivot=a[n-1];
//		int i=-1;
//		for(int j=0;j<n-1;j++) {
//			if( pivot>a[j]) {
//				i++;
//				int temp=a[i];
//				a[i]=a[j];
//				a[j]=temp;
//				
//			}	
//		}
//		int temp=a[i+1];
//		a[i+1]=a[n-1];
//		a[n-1]=temp;
//		System.out.println();
//		for(int k=0;k<n;k++) {
//			System.out.print(a[k]+" ");
//		}
//	}
//
//}


package p0;

public class QuickSorted {

    // Partition function
    static int partition(int a[], int low, int high) {
        int pivot = a[high]; // last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (a[j] < pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

       
        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;

        return i + 1; // return pivot index
    }

    // QuickSort function (recursive)
    static void quickSort(int a[], int low, int high) {
        if (low < high) {
            int pi = partition(a, low, high);

            // Sort elements before and after partition
            quickSort(a, low, pi - 1);
            quickSort(a, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int a[] = {36, 52, 1, 3, 49, 10};
        int n = a.length;

        quickSort(a, 0, n - 1);

        System.out.println("Sorted Array:");
        for (int k = 0; k < n; k++) {
            System.out.print(a[k] + " ");
        }
    }
}





