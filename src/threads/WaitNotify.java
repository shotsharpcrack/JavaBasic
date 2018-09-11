package threads;

public class WaitNotify {

	public static class Add extends Thread {
		private int x,y;
		private Object obj;
		public Add(int x, int y, Object obj) {
			this.x = x;
			this.y = y;
			this.obj = obj;
		}
		
		private int result = 0;
		private boolean isDone = false;
		
		
		public int getResult() {
			synchronized(obj) {
				// use while instead of if
				// always check if result is generated before return
				while(!isDone) {
					try {
						obj.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
			return result;
		}
		
		@Override
		public void run() {
			synchronized(obj) {
				result = x + y;
				isDone = true;
				obj.notify();
			}
		}
	}
	
	public static class Multiply extends Thread {
		private int x,y;
		private Object obj;
		public Multiply(int x, int y, Object obj) {
			this.x = x;
			this.y = y;
			this.obj = obj;
		}
		
		private int result = 0;
		private boolean isDone = false;
		
		
		public int getResult() {
			synchronized(obj) {
				// use while instead of if
				// always check if result is generated before return
				while(!isDone) {
					try {
						obj.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
			return result;
		}
		
		@Override
		public void run() {
			synchronized(obj) {
				result = x * y;
				isDone = true;
				obj.notify();
			}
		}
	}
	
	public static void main(String[] args) {
		int x = 2;
		int y = 4;
		Object obj = new Object();
		
		Add add = new Add(x, y, obj);
		Multiply multiply = new Multiply(x, y, obj);
		add.start();
		multiply.start();
		
		int addResult = add.getResult();
		int mulResult = multiply.getResult();
		
		System.out.println("add : " + addResult);
		System.out.println("multiply : " + mulResult);
		System.out.println("done...");
	}

}
