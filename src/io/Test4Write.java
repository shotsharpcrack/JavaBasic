package io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import io.beans.Pistol;

public class Test4Write {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("resources/test4.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			Pistol p = new Pistol(1000, false, 0.8);
			oos.writeObject(p);
			System.out.println("Done writing...");
						
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
