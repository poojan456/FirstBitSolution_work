package p5;

public class MainApp {
	public static void main(String[]args) {
		
		
			WaitingQueueSubject waitingQueue = new WaitingQueueSubject(5);
			QueueDisplay display = new QueueDisplay();		//observer1
			QueueObserver tvdisplay = new TvDisplay(); 		//observer2
			
			waitingQueue.addObserver(display);
			waitingQueue.addObserver(tvdisplay);
			
			waitingQueue.customerArrives("Raj");
			waitingQueue.customerArrives("Aakanksha");
			waitingQueue.customerArrives("Tushar");
			
			waitingQueue.customerServed();     
			
			waitingQueue.customerArrives("Vishal");
			waitingQueue.customerArrives("Sachin");
			
			waitingQueue.customerArrives("Shraddha");     
			
			waitingQueue.customerServed();
			waitingQueue.customerServed();
			waitingQueue.customerServed();
			waitingQueue.customerServed();
			waitingQueue.customerServed();      
			
			waitingQueue.customerServed();     
		}
}
