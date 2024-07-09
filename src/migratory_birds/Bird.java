package migratory_birds;

public class Bird {

	private String bird;
	private int count;
	
	public Bird(String bird, int count) {
		super();
		this.bird = bird;
		this.count = count;
	}
	
	public String getBird() {
		return bird;
	}
	public void setBird(String bird) {
		this.bird = bird;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
}
