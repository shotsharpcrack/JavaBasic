package threads;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	private BlockingQueue<Integer> bq;
	
	public Producer(BlockingQueue<Integer> bq) {
		this.bq = bq;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			try {
				Thread.sleep(1000);
				bq.put(i);
				System.out.println("Producing new number: " + i + ", " + Thread.currentThread().getName());
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
