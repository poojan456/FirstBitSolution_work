import java.io.DataInputStream;
import java.io.IOException;
class leapp{
public static void main(String[]args){
DataInputStream in=new DataInputStream(System.in) thows IOException{
int year=Integer.parseInt(in.readLine());
if((year%4==0)&&(year%100!=0)||(year%400==0)){
System.out.println("Leap year");
}
else{
System.out.println("Not Leap year");
}
}
}
}


