public class linearsearchstring {
    public static void main(String[] args) {
        String a[] = { "pooja", "onkar", "srikant", "rohan", "rohit" };
        String item = "poja";
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(item)) {
                System.out.println("the name is present at index values" + i);
            }
        }

    }

}
