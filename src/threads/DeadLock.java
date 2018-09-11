package threads;

public class DeadLock {

	public static class Thread1 extends Thread {
		private Object obj1, obj2;		// lock
		
		public Thread1(Object obj1, Object obj2) {
			this.obj1 = obj1;
			this.obj2 = obj2;
		}
		
		@Override
		public void run() {
			System.out.println("Thread1 starts......");
			synchronized(obj1) {
				try {
					Thread.sleep(1000);
				} catch(Exception e) {
					e.printStackTrace();
				}
				
				synchronized(obj2) {
					System.out.println("Thread1 get both locks......");
				}
				
				System.out.println("Thread1 complete.");
			}
		}
	}
	
	public static class Thread2 extends Thread {
		private Object obj1, obj2;		// lock
		
		public Thread2(Object obj1, Object obj2) {
			this.obj1 = obj1;
			this.obj2 = obj2;
		}
		
		@Override
		public void run() {
			System.out.println("Thread2 starts......");
			synchronized(obj2) {
				try {
					Thread.sleep(1000);
				} catch(Exception e) {
					e.printStackTrace();
				}
				
				synchronized(obj1) {
					System.out.println("Thread2 get both locks......");
				}
				
				System.out.println("Thread2 complete.");
			}
		}
	}
	
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		Thread1 t1 = new Thread1(obj1, obj2);
		Thread2 t2 = new Thread2(obj1, obj2);
		
		// daemon thread : a thread will be shut off by OS if no other thread is running
		t1.setDaemon(true);
		t2.setDaemon(true);
		
		t1.start();
		t2.start();
		
		try {
			Thread.sleep(5000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Both thread started, main() complete!");
	}

}
