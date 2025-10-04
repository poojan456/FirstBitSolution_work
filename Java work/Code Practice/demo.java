import java.io.DataInputStream;
import java.io.IOException;

class Demo {
    public static void main(String args[]) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        int year = Integer.parseInt(dis.readLine());
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("LEAP YEAR");
        } else {
            System.out.println("NOT LEAP YEAR");
        }
    }
}