public class MergeArr {
    public static void main(String[] args) {
        int a[]={1,2,5,8};
        int b[]={3,4,5,6,9};
        int n=a.length+b.length;
        int j=0;

        for(int i=a.length;i<n;i++){
            a[i]=b[j];
            j++;


        }
        for(int val:a){
            System.out.println(val);
        }
    }
    
}
