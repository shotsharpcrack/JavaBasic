package exceptionHandling;

import java.io.FileOutputStream;

public class TestExceptions {
	public static void main(String args[]) throws Throwable {
		String a = "a";
		reflectionChangeString(a);
		System.out.println(a.toString());

		a = null;
		
		NullPointerException npe = null;
		boolean flag = true;
		
		getResult(flag);
		
		System.out.println(getResult(flag));
		
		// All concrete classes, and can be try-catch
		Throwable t = new Throwable();
		Error e = new Error();
		Exception ee = new Exception();
		RuntimeException re = new RuntimeException();
		
		
	}
	
	public static void reflectionChangeString(String a) throws Throwable {
	}
	
	public static void x(boolean input) throws ParentException {
		if(input) {
			throw new ParentException();
		}
		
	}
	
	// may throws
	public static void y(boolean input) throws SubException {
		if(!input) {
			throw new SubException();
		}
		
	}
	
	public static String getResult(boolean flag) {
		String result = "";
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("c:/test/test.txt");
			fos.write(1);
			
			// logic
			x(flag);
			y(flag);
			
			
			fos.close();
		} catch (SubException e) {
			result = "Sub";
			System.exit(1);
			System.out.println("exit");
		} catch (ParentException e) {
			result = "Parent";
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// will be executed no matter what, except JVM is down
			// most of the time, finally block is used for closing things
			System.out.println("finally");
		}
		
//		try {
//			x(flag);
//			y(flag);
//		} catch (Throwable e) {
//			result = "Wrong";
//		} 
		return result;
	}
	
	
	public static class ParentException extends Exception {
		
	}
	
	public static class SubException extends ParentException {
		
	}
	

}
