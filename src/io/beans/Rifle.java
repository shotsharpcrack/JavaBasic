package io.beans;

import java.io.Serializable;

public class Rifle implements Serializable{
	private static final long serialVersionUID = -24529837492364L;
	
	private transient int range;
	private boolean isAutomatic;
	private double collision;
	private String name;
	
	public static String brand = "AK47";
	
	public Rifle() {}
	public Rifle(int range, boolean isAutomatic, double collision) {
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

	
}
