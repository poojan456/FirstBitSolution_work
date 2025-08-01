interface Vehicle{
	void brake();
	abstract void start();
	public abstract void stop(); 
}
class Car implements Vehicle{
	public void brake() {
		System.out.println("to brake it");
		
	}
	public void start() {
		System.out.println("start it");
	}
	public void stop() {
		System.out.println("to stop it");
	}	
}
public class VehicleDemo {
	public static void main(String[]args) {
		Vehicle v1;
		
		Car c1=new Car();
		c1.brake();
		c1.start();
		c1.stop();
		
		
	
	}

}
