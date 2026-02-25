public class Frequency{
    public static void main(String[]args){
        int []a={1,2,2,3,4,1,5,5,2};
        int visited[]=new int[a.length];
        int x=0;
        for(int i=0;i<a.length;i++){
            if (visited[i] == 1)
                continue;

            int count=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                    visited[j]=1;
                   


                }
            }
             System.out.println(a[i]+" "+count);
        }

    }
}