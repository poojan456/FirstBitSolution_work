package Other;
import java.util.*;

public class sbb {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("TONY");
        System.out.println(sb.charAt(0));
        sb.setCharAt(0, 'p');
        System.out.println(sb);
        sb.insert(0, 's');
        System.out.println(sb);
        // sb.delete(2,3);
        sb.append('e');
        System.out.println(sb);
        System.out.println(sb.length());

    }

}
