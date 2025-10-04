package p5;

public  class QueueDisplay implements QueueObserver{
	
	public void update(WaitingQueue queue) {
		System.out.println("Current Waiting Line ("+queue.getSize()+" customer) : ");
		String[] customers = queue.getQueueElements();
		for(String c : customers) {
			System.out.println(c +" ");
		}
		System.out.println("\n======================================");
	}

	

}

