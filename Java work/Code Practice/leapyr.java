package condition;
public class leapyr {
    public static void main(String[] args) {
        int yr = 2016;
        if ((yr % 400 == 0) || (yr % 4 == 0 && yr % 100 != 0)) {
            System.out.println("it is leap yr");
        } else {
            System.out.println("it is not leap yr");
        }
    }

}
