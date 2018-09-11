package threads;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TestProducerConsumer {

	public static void main(String[] args) {
		BlockingQueue<Integer> bq = new LinkedBlockingQueue<Integer>(5);
		Thread producer = new Thread(new Producer(bq));
		Thread consumer = new Thread(new Consumer(bq));
		
		producer.start();
		consumer.start();
	}
}
