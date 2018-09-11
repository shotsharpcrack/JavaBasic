package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import io.beans.Rifle;

public class T3 {

	public static void main(String[] args) {
		Rifle r1 = null, r2 = null;
		try (FileOutputStream fos = new FileOutputStream("resources/test3.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			Rifle r = new Rifle(1000, false, 0.8);
			oos.writeObject(r);
			System.out.println("Done writing...");
			r1 = r;
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		try (FileInputStream fis = new FileInputStream("resources/test3.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			Rifle.brand = "AWP";
			
			Rifle r = (Rifle)ois.readObject();
			System.out.println(r);
			
//			System.out.println(ois.readObject());
			r2 = r;
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(r1 == r2);
	}

}
