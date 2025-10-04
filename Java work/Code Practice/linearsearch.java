public class linearsearch {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 6, 1, 4, 2 };
        int item = 4;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                System.out.println("item is present at" + i + " index position");

            }
        }

    }
}
