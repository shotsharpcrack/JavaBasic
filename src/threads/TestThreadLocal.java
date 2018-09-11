package threads;

import java.util.Map;

public class TestThreadLocal {

	public static void main(String[] args) {
		ThreadLocal<Integer> tl = new ThreadLocal<Integer>() {
			@Override
			public Integer initialValue() {
				return 10;
			}
		};
		
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " is running...");
				int x = tl.get();
				System.out.println("x in r1: " + x);
				x++;
				tl.set(x);
				System.out.println("x in r1 after modification: " + x);
				System.out.println("x in TL for r1 after modification: " + tl.get());
			}
		};

		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " is running...");
				int x = tl.get();
				System.out.println("x in r2: " + x);
				x += 10;
				tl.set(x);
				System.out.println("x in r2 after modification: " + x);
				System.out.println("x in TL for r2 after modification: " + tl.get());
			}
		};
		
		new Thread(r1).start();
		new Thread(r2).start();
		
		MyThreadLocal mtl = new MyThreadLocal();
	}

	
	public static class MyThreadLocal {
		private Object initialValue;
		private Map<Thread, Object> map;
		
		public Object initialValue() {
			return initialValue;
		}
		
		public Object get(Thread t) {
			// my logic
			return map.get(t);
		}
		
		public void set(Thread t, Object val) {
			// my logic
			map.put(t, val);
		}
	}
}
