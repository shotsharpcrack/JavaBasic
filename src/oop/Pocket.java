package oop;

public class Pocket {
	private String item;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "Pocket [item=" + item + "]";
	}
	
	
}
