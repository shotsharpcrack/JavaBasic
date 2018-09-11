package threads;

import java.util.concurrent.Callable;

public class SmartThread implements Callable{

	private int num;
	
	public SmartThread(int num) {
		this.num = num;
	}
	
	public int factorial(int i) {
		return i <= 0 ? 1 : i * factorial(--i);
	}
	
	@Override
	public Integer call() throws Exception {
		return factorial(num);
//		Integer result = factorial(num);
//		System.out.println(result);
//		
//		return result;
	}

}
