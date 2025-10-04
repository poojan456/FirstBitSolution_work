package p5;
import java.util.ArrayList;
import java.util.List;

//observable
public class WaitingQueueSubject {
	private WaitingQueue queue;
	private List<QueueObserver>observers;
	
	public WaitingQueueSubject(int capacity) {
		queue=new WaitingQueue(capacity);
		observers=new ArrayList<>();
		
		
	}
	public void addObserver(QueueObserver observer) {
		observers.add(observer);
	}
	public void removeObserver(QueueObserver observer) {
		observers.remove(observer);
		
	}
	private void notifyObservers() {
		for(QueueObserver observer : observers) {
			observer.update(queue);

			
		}
	}
	public void customerArrives(String customer) {
		queue.enqueue(customer);
		System.out.println("customer "+customer+"arrived");
		this.notifyObservers();
		
	}
	public void customerServed() {
		String servedCustomer = queue.dequeue();
		if(servedCustomer != null) {
			System.out.println("Customer "+servedCustomer+" served and left.");
			this.notifyObservers();
		}
	}
	public int getQueueSize() {
		return queue.getSize();
	}

	
	
	

}
