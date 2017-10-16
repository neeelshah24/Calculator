package state;

import gui.CalculatorGUI;
import javafx.scene.control.*;

public class ButtonValue extends CalculatorGUI {
	
	
	
	public static String buttonValue(Button buttonClicked) {
		String num = "";
		
			if (getOneValue() == buttonClicked) {
				num = "1"; 
				
			} else if (getTwoValue() == buttonClicked) {
				num = "2";
				
			} else if (getThreeValue() == buttonClicked) {
				num = "3";
				
			} else if (getFourValue() == buttonClicked) {
				num = "4";
				
			} else if (getFiveValue() == buttonClicked) {
				num = "5";
				
			} else if (getSixValue() == buttonClicked) {
				num = "6";
				
			} else if (getSevenValue() == buttonClicked) {
				num = "7";
						
			} else if (getEightValue() == buttonClicked) {
				num = "8";
				
			} else if (getNineValue() == buttonClicked) {
				num = "9";
				
			} else if (getZeroValue() == buttonClicked) {
				num = "0";
			}
			
			return num;
	}


	
}
