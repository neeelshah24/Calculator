package gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import state.ButtonValue;
import state.CalculatorState;
import javafx.scene.layout.*;




@SuppressWarnings("restriction")
public class CalculatorGUI extends Application {
	public static Button zeroLabel;
	public static Button oneLabel;
	public static Button twoLabel;
	public static Button threeLabel;
	public static Button fourLabel;
	public static Button fiveLabel;
	public static Button sixLabel;
	public static Button sevenLabel;
	public static Button eightLabel;
	public static Button nineLabel;
	public static Button addLabel;
	public static Button subtractLabel;
	public static Button multiplyLabel;
	public static Button divideLabel;
	public static Button inverseLabel;
	public static Button equalLabel;
	public static Button sqrtLabel;
	public static Button clearLabel;
	public static Button clearAllLabel;
	protected TextArea displayArea;
	private int sceneWidth, sceneHeight;
	//private static double one, two, three, four, five, six, seven, eight, nine;
	
	public static Button getOneValue() {
		return oneLabel;
	}
	
	public static Button getTwoValue() {
		return twoLabel;
	}
	
	public static Button getThreeValue() {
		return threeLabel;
	}
	
	public static Button getFourValue() {
		return fourLabel;
	}
	
	public static Button getFiveValue() {
		return fiveLabel;
	}
	
	public static Button getSixValue() {
		return sixLabel;
	}
	
	public static Button getSevenValue() {
		return sevenLabel;
	}
	
	public static Button getEightValue() {
		return eightLabel;
	}
	
	public static Button getNineValue() {
		return nineLabel;
	}
	
	public static Button getZeroValue() {
		return zeroLabel;
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public void start(Stage primaryStage) {
		sceneWidth = 300;
		sceneHeight = 350;
		
		
		displayArea = new TextArea();
		displayArea.setPrefSize(sceneWidth, sceneHeight / 5);
		displayArea.setWrapText(true);
		displayArea.setEditable(false);
		
		VBox allign = new VBox();
		allign.setPadding(new Insets(10, 20, 0, 20));
		allign.setSpacing(15);
		
		HBox firstRow = new HBox();
		firstRow.setSpacing(10);
		
		HBox secondRow = new HBox();
		secondRow.setSpacing(10);
		
		HBox thirdRow = new HBox();
		thirdRow.setSpacing(10);
		
		HBox fourthRow = new HBox();
		fourthRow.setSpacing(10);
		
		sevenLabel = new Button("7");
		sevenLabel.setPrefSize(100, 50);
		sevenLabel.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				displayArea.setText(ButtonValue.buttonValue(sevenLabel));	
			}	
	    });
		
		eightLabel = new Button("8");
		eightLabel.setPrefSize(100, 50);
		eightLabel.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				displayArea.setText(ButtonValue.buttonValue(eightLabel));	
			}	
	    });
		
		nineLabel = new Button("9");
		nineLabel.setPrefSize(100, 50);
		nineLabel.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				displayArea.setText(ButtonValue.buttonValue(nineLabel));	
			}	
	    });
		
		divideLabel = new Button("/");
		divideLabel.setPrefSize(100, 50);
		
		clearAllLabel = new Button("CE");
		clearAllLabel.setPrefSize(100, 50);
		
		firstRow.getChildren().addAll(sevenLabel, eightLabel, nineLabel, divideLabel, clearAllLabel);
		allign.getChildren().addAll(firstRow);
		
		
		fourLabel = new Button("4");
		fourLabel.setPrefSize(100, 50);
		fourLabel.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				displayArea.setText(ButtonValue.buttonValue(fourLabel));	
			}	
	    });
		
		fiveLabel = new Button("5");
		fiveLabel.setPrefSize(100, 50);
		fiveLabel.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				displayArea.setText(ButtonValue.buttonValue(fiveLabel));	
			}	
	    });
		
		sixLabel = new Button("6");
		sixLabel.setPrefSize(100, 50);
		sixLabel.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				displayArea.setText(ButtonValue.buttonValue(sixLabel));	
			}	
	    });
		
		multiplyLabel = new Button("*");
		multiplyLabel.setPrefSize(100, 50);
		
		clearLabel = new Button("C");
		clearLabel.setPrefSize(100, 50);
		
		secondRow.getChildren().addAll(fourLabel, fiveLabel, sixLabel, multiplyLabel, clearLabel);
		allign.getChildren().addAll(secondRow);
		
		oneLabel = new Button("1");
		oneLabel.setPrefSize(100, 50);
		oneLabel.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				displayArea.setText(ButtonValue.buttonValue(oneLabel));	
			}	
	    });
		
		twoLabel = new Button("2");
		twoLabel.setPrefSize(100, 50);
		twoLabel.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				displayArea.setText(ButtonValue.buttonValue(twoLabel));	
			}	
	    });
		
		threeLabel = new Button("3");
		threeLabel.setPrefSize(100, 50);
		threeLabel.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				displayArea.setText(ButtonValue.buttonValue(threeLabel));	
			}	
	    });
		
		subtractLabel = new Button("-");
		subtractLabel.setPrefSize(100, 50);
		
		inverseLabel = new Button("1/X");
		inverseLabel.setPrefSize(100, 50);
		
		thirdRow.getChildren().addAll(oneLabel, twoLabel, threeLabel, subtractLabel, inverseLabel);
		allign.getChildren().addAll(thirdRow);
		
		
		
		zeroLabel = new Button("0");
		zeroLabel.setPrefSize(100, 50);
		zeroLabel.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				displayArea.setText(ButtonValue.buttonValue(zeroLabel));	
			}	
	    });
		
		sqrtLabel = new Button("SQRT");
		sqrtLabel.setPrefSize(100, 50);
		
		addLabel = new Button("+");
		addLabel.setPrefSize(100, 50);
		
		equalLabel = new Button("=");
		equalLabel.setPrefSize(100, 50);
		
		fourthRow.getChildren().addAll(zeroLabel, sqrtLabel, addLabel, equalLabel);
		allign.getChildren().addAll(fourthRow);
		
		
		BorderPane border = new BorderPane();
		border.setTop(displayArea);
		border.setCenter(allign);
		
		
		Scene scene = new Scene(border, sceneWidth, sceneHeight);
		primaryStage.setTitle("Calculator");
		//the size of the window cannot be adjusted
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	
	private class CalculatorMachine implements CalculatorState{

		@SuppressWarnings("unlikely-arg-type")
		@Override
		public void firstOperand(Button firstNum) {
			String firstTotal = "";
			String secondString = "";
			firstTotal = firstNum.getText();
			secondString = firstTotal;
			
			if (!(this.equals(addLabel) && this.equals(divideLabel) && 
					this.equals(subtractLabel) && this.equals(multiplyLabel) && 
					this.equals(sqrtLabel) && this.equals(inverseLabel))) {
				firstTotal += 
				
			}
			
			
		}

		@Override
		public void secondOperand(Button secondNum) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void operator(String sign) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void error() {
			// TODO Auto-generated method stub
			
		}
		

	}


}
