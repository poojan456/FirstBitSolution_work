public class linearsearch {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 7, 9, 4, 3 };
        int item = 9;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                System.out.println("the number is" + i);
            }
        }
    }

}
