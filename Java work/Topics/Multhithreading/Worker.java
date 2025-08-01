package p1;
import java.lang.*;
public class Worker extends Thread {
	public void run() {
		String str="1234567890987654321";
		for(int i=0;i<str.length();i++) {
			System.out.print(" "+str.charAt(i));
		}
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	
}
class AnotherThread implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String str="!@#$%^&*()%$#@!^&*()";
		for(int i=0;i<str.length();i++) {
			System.out.print(" "+str.charAt(i));
		}
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	
}
class Multithread{
	public static void main(String[]args) {
		Worker w1=new Worker();
		w1.start();
		AnotherThread aw=new AnotherThread();
		Thread t1=new Thread(aw);
		t1.start();
		
		String str="abcdefghijklmnopqrstuvwxyz";
		for(int i=0;i<str.length();i++) {
			System.out.print(" "+str.charAt(i));
		}
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
		
			
		
	}
	
}
