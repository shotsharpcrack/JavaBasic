package threads;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	private BlockingQueue<Integer> bq;
	
	public Consumer(BlockingQueue<Integer> bq) {
		this.bq = bq;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000);
				Integer data = bq.take();
				System.out.println("Consuming new numberrrrrrr: " + data + ", " + Thread.currentThread().getName());
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
