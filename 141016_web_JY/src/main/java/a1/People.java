package a1;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

@Component
public class People {
	
	//저에게 스낵 타입의 객체를 내려주세요!!!!!
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
