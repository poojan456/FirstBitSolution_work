import java.util.*;
import java.util.HashSet;

public class UsingHashset {

    public static void main(String[] args) {
        int n[] = { 7, 2, 2, 5, 1, 0, 1 };
        HashSet h1 = new HashSet();
        for (int i = 0; i < n.length; i++) {
            h1.add(n[i]);
        }
        System.out.println("Unique elements: " + h1);
    }
}
