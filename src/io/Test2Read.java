package io;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class Test2Read {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("resources/test2.dat");
				BufferedInputStream bis = new BufferedInputStream(fis);
				DataInputStream dis = new DataInputStream(bis);) {
			
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readBoolean());
			System.out.println("Done");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
