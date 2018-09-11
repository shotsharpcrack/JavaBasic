package exceptionHandling;

public class TestError {
	public static class MyError extends Error {
		
	}
	
	public static void main(String[] args) {
		try {
			throw new MyError();
		} catch(Error e) {
			e.printStackTrace();
			System.out.println("I got my error!");
		}
		System.out.println("yayyyyy");
	}

}
