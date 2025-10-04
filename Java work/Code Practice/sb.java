package Other;
//in string builder we can modify the operation
public class sb {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("pooja");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        // set char at
        sb.setCharAt(0, 'T');
        System.out.println(sb);
        // insert function
        sb.insert(0, 'R');
        System.out.println(sb);
        // delete function
        sb.delete(0, 1);
        System.out.println(sb);
        // append function
        sb.append("ra");
        System.out.println(sb);

    }

}
