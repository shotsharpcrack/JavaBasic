package threads;

public class ThreadBasic {

	public static void main(String[] args) {
		MyThread1 mt1 = new MyThread1();
		MyThread2 mt2 = new MyThread2();

//		mt1.run();
//		mt2.run();
		
		mt1.start();
		new Thread(mt2).start();
		
		System.out.println("main exit...");
	}

	// Thread is a concrete class
	public static class MyThread1 extends Thread {
		@Override
		public void run() {
			try {
				Thread.sleep(2000);
				System.out.println("MyThread1 completed");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static class MyThread2 implements Runnable {
		@Override
		public void run() {
			try {
				Thread.sleep(4000);
				System.out.println("MyThread2 finished");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
