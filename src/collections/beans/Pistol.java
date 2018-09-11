package collections.beans;

import java.io.Serializable;

public class Pistol implements Serializable {
	private static final long serialVersionUID = -24529837492364L;
	
	private String name;
	private int range;
	private boolean isAutomatic;	
	
	public Pistol() {
	}
	
	public Pistol(String name, int range, boolean isAutomatic) {
		super();
		this.name = name;
		this.range = range;
		this.isAutomatic = isAutomatic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

//	@Override
//	public boolean equals(Object o) {
//		return false;
//	}
	
	@Override
	public String toString() {
		return "Rifle [name=" + name + ", range=" + range + ", isAutomatic=" + isAutomatic + "]";
	}
}
