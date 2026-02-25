public class CommonArray {
    public static void main(String[] args) {
        int a1[] = { 1, 2, 2, 3, 4 };
        int a2[] = { 3, 4, 4, 5, 6, 7 };
        int n = a1.length + a2.length;

        int common[] = new int[n];
        int x = 0;

        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                
                if (a1[i] == a2[j]) {
                    // System.out.print(a1[i] + " ");
                    // break; // avoid printing same element again
                    common[x] = a1[i];
                    x++;

                }
            }
            
        }
        System.out.println("common array");
        for(int i=0;i<x;i++){
            System.out.println(common[i]);
        }

    }

}