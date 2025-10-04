package array;
import java.util.ArrayList;
import java.util.*;

public class list {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // add element
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        // get element
        System.out.println(list.get(0));
        // add element in between
        list.add(1, 1);
        System.out.println(list);
        // set element replacing before element with new one at same position
        list.set(0, 5);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        // size of list
        System.out.println(list.size());

        // using ietration
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // sorting

    }

}
