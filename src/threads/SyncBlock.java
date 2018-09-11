package threads;

public class SyncBlock {

	public static class MyThread implements Runnable {
		
		Object obj;
		public MyThread(Object obj) {
			this.obj = obj;
		}
		
		public synchronized void foo() {
			System.out.println("foo() started...");
			synchronized(obj) {
				try {
					Thread.sleep(2000);
					System.out.println("MyThread completed");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		@Override
		public void run() {
			foo();
		}
	}
	
	public static void main(String[] args) {
		Object obj = new Object();
		MyThread mt1 = new MyThread(obj);
		MyThread mt2 = new MyThread(obj);
		
		new Thread(mt1).start();
		new Thread(mt2).start();
		System.out.println("main done...");

	}

}
