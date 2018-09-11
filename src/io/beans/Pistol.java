package io.beans;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Pistol implements Externalizable {
	
	private transient int range;
	private boolean isAutomatic;
	private double collision;
	
	public static String brand = "Desert Eagle";
	
	
	public Pistol() {
	}
	
	public Pistol(int range, boolean isAutomatic, double collision) {
		super();
		this.range = range;
		this.isAutomatic = isAutomatic;
		this.collision = collision;
	}

	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public boolean isAutomatic() {
		return isAutomatic;
	}
	public void setAutomatic(boolean isAutomatic) {
		this.isAutomatic = isAutomatic;
	}
	public double getCollision() {
		return collision;
	}
	public void setCollision(double collision) {
		this.collision = collision;
	}
	@Override
	public String toString() {
		return "Rifle [range=" + range + ", isAutomatic=" + isAutomatic + ", collision=" + collision + "] : " + brand;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(range);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		collision = (int)in.readObject();
	}

}
