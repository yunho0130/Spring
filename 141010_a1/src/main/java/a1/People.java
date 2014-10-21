package a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class People {
	
	// 여기에서 객체 생성하는 코드는 하나도 없어요. 그런데 객체 누가 생성할까요? Spring이 해요. 
	@Autowired
	private Snack snack;

	public void setSnack(Snack snack) {
		this.snack = snack;
	}

	@Override
	public String toString() {
		return "People [snack=" + snack + "]";
	}
	
	
}
