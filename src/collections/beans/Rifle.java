package collections.beans;

import java.io.Serializable;

public class Rifle implements Serializable, Comparable<Rifle> {
	private static final long serialVersionUID = -24529837492364L;
	
	private String name;
	private int range;
	private boolean isAutomatic;	
	
	public Rifle() {
	}
	
	public Rifle(String name, int range, boolean isAutomatic) {
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

	@Override
	public int hashCode() {
		return name.hashCode() + range + (isAutomatic ? 34 << 12 : 15 << 18);
	}
	
	@Override
	public boolean equals(Object o) {
		boolean result = false;
		
		if(o instanceof Rifle) {
			Rifle incomingRifle = (Rifle)o;
			if(this.getRange() == incomingRifle.getRange()
					&& this.name.equals(incomingRifle.getName())
					&& this.isAutomatic() == incomingRifle.isAutomatic()) {
				result = true;
			}
		}
		
		return result;
	}
	
	@Override
	public String toString() {
		return "Rifle [name=" + name + ", range=" + range + ", isAutomatic=" + isAutomatic + "]";
	}

	@Override
	public int compareTo(Rifle r) {
		return range - r.range;
	}
}
