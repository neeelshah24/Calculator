package state;

import javafx.scene.control.*;

public interface CalculatorState {
	public void firstOperand(Button firstNum);
	public void secondOperand(Button secondNum);
	public void operator(String sign);
	public void error();
	
}
