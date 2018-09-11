package io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import io.beans.Pistol;

public class Test4Read {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("resources/test4.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			Pistol p = (Pistol)ois.readObject();
			System.out.println(p);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
