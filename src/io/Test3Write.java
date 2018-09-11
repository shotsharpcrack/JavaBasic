package io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import io.beans.Rifle;

public class Test3Write {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("resources/test3.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			Rifle r = new Rifle(1000, false, 0.8);
			oos.writeObject(r);
			System.out.println("Done writing...");
						
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
