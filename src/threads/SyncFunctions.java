package threads;

public class SyncFunctions {

	public synchronized static void func1() {
		try {
			Thread.sleep(2000);
			System.out.println("func1 completed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public synchronized static void func2() {
		try {
			Thread.sleep(4000);
			System.out.println("func2 completed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void func3() {
		try {
			Thread.sleep(2000);
			System.out.println("func3 completed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void func4() {
		try {
			Thread.sleep(4000);
			System.out.println("func4 completed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		SyncFunctions sf = new SyncFunctions();
		
		MyThread mt = new MyThread(sf);
		mt.start();
		
//		SyncFunctions.func1();	// 2 sec
		sf.func3();// 2 sec
		
		System.out.println("main done...");
	}
	
	public static class MyThread extends Thread {
		SyncFunctions sf;
		public MyThread(SyncFunctions sf) {
			this.sf = sf;
		}
		
		@Override
		public void run() {
//			SyncFunctions.func2();
			sf.func4();	// 4 sec
		}
	}

}
