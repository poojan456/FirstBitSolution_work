// //8.Find common elements in three sorted arrays.

// // Input: {1, 5, 10, 20, 40}, {6, 7, 10, 20, 80}, {3, 4, 10, 20, 30, 40}

// // Output: {10, 20}

// public class CommonElement{
//     public static void main(String[]args){
//         int[]a1={1,5,10,20,40};
//         int[]a2={6,7,10,20,80};
//         int []a3={3,4,10,20,30,40};
//         int temp[]=new int[a1.length];
//         int x=0;
//         for(int i=0;i<a1.length;i++){
//             for(int j=0;j<a2.length;j++){
//                 if(a1[i]==a2[j]){
//                      temp[x]=a1[i];
//                     x++;
                   


//                 }
//             }


//         }
//         int []temp2=new int[6];
//         int p=0;
//         for(int k=0;k<2;k++){
//            for(int l=0;l<a3.length;l++){
//             if(temp[k]==a3[l]){
//                 temp2[p++]=a3[l];

//             }
//            }

//            System.out.println(temp2[k]);
//         }
        
//     }
// }




public class CommonElement {
    public static void main(String[] args) {

        int[] a1 = {1, 5, 10, 20, 40};
        int[] a2 = {6, 7, 10, 20, 80,40};
        int[] a3 = {3, 4, 10, 20, 30, 40};

        int[] temp=new int[a1.length];
        int x=0;

        for(int i=0;i<a1.length;i++){
            for(int j=0;j<a2.length;j++){
       
                for(int k=0;k<a3.length;k++){
                    if(a1[i]==a2[j]&&a2[j]==a3[k]){
                        temp[x]=a1[i];
                        x++;
                        break;


                    }
                }
            }
        }
        for(int i=0;i<x;i++){
            System.out.println(temp[i]);
        }
    }
}


