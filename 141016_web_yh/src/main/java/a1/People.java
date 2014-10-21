package a1;

public class People {
	
	private Snack snack;

	public Snack getSnack() {
		return snack;
	}

	public void setSnack(Snack snack) {
		this.snack = snack;
	}

	@Override
	public String toString() {
		return "People [snack=" + snack + "]";
	}
	
	
	

}
