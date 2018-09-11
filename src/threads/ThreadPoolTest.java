package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolTest {

	public static void testThreadPool1() {
		// 1. Thread pool with no limitation
		// 2. Thread pool with fixed threads inside.
//		ExecutorService executorService = Executors.newCachedThreadPool();
//		ExecutorService executorService = Executors.newFixedThreadPool(5);
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		for(int i = 0; i < 100; i++) {
			executorService.execute(new DummyThread());
		}
		
		executorService.shutdown();
		System.out.println("Executor Service is down!");
	}
	
	public static void testCallable() {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		List<Future<Integer>> resultList = new ArrayList();
		
		for(int i = 1; i <= 10; i++) {
			Future<Integer> future = executorService.submit(new SmartThread(i));
			resultList.add(future);		// insert future in order, 1 - 10;
		}
		
		for(Future<Integer> f : resultList) {
			try {
				while(!f.isDone()) {
					// wait
				}
				System.out.println(f.get());
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				executorService.shutdown();
			}
		}
	}
	
	public static void main(String[] args) {
//		testThreadPool1();
		testCallable();
	}

}
