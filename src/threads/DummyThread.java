package threads;

public class DummyThread implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is running...");
	}
}
