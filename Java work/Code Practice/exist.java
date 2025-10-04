package Lsearching;

// check whether character exist in string or not
public class exist {
    static boolean search(String name, char target) {
        if (name.length() == 0) {
            return false;

        }
        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)) {
                return true;
            }

        }
        return false;

    }
    // samjl nhi pan krte
    
    

    public static void main(String[] args) {
        String name = "Pooja Nagapurkar";
        char target = 'e';
        System.out.println(search(name, target));

    }

}
