package a1;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

@Component
public class People {
	
	// Snack 타입의 객체를 달라는 명시적 표현. 
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
