package io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import io.beans.Rifle;

public class Test3Read {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("resources/test3.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			Rifle.brand = "AWP";
			
			Rifle r = (Rifle)ois.readObject();
			System.out.println(r);
			
//			System.out.println(ois.readObject());
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
