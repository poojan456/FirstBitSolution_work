// 9.Find pairs of elements whose sum is equal to a given number.

// Input: {1, 4, 5, 7, 10, 12}, Sum: 15

// Output: {(5, 10), (3, 12)}

// public class PairElement{
//     public static void main(String[]args){
//         int s[]={1, 4, 5, 7, 10, 12};
//         int sum=15;

//         for(int i=0;i<s.length;i++){
//             for(int j=i+1;j<s.length;j++){
//                 if(s[i]+s[j]==sum){

//                     System.out.println("{"+"("+s[i]+","+s[j]+")"+"}");
//                 }
//             }
//         }

//     }
// }


public class PairElement {
    public static void main(String[] args) {

        int s[] = {1, 3, 5, 7, 10, 12};
        int sum = 15;

        for (int i = 0; i < s.length; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (s[i] + s[j] == sum) {
                    System.out.println("(" + s[i] + ", " + s[j] + ")");
                }
            }
        }
    }
}
