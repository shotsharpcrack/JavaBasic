package io;

import java.io.FileOutputStream;

public class Test1Write {
	public static void main(String args[]) {
		int[] nums = {-1, 2, 3, 4, 9826349};
		try (FileOutputStream fos = new FileOutputStream("resources/test1.dat");
				MyConnection mc = new MyConnection();) {
			
			// output an int array to a file
			for(int x : nums) {
				fos.write(x);
			}
			
			System.out.println("Done");
//			throw new RuntimeException();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static class MyConnection implements AutoCloseable{

		@Override
		public void close() throws Exception {
			System.out.println("Closing my own connection...");
		}
		
	}
}
