package a1;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

@Component
public class People {
	
	// Snack Ÿ���� ��ü�� �޶�� ����� ǥ��. 
	@Inject
	private Snack snack;

	public void setSnack(Snack snack) {
		this.snack = snack;
	}

	@Override
	public String toString() {
		return "People [snack=" + snack + "]";
	}
	
	
}
