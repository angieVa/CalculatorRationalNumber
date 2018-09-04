package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import modelo.Calculator;

public class ViewController {
	
		Calculator calculator = new Calculator();

	
		
	    @FXML
	    private Label sign;

	    @FXML
	    private Button delete;

	    @FXML
	    private Button sqr;

	    @FXML
	    private Button divide;

	    @FXML
	    private Button Iquals;

	    @FXML
	    private Button multiply;

	    @FXML
	    private Button substract;

	    @FXML
	    private Label ResNumerator;

	    @FXML
	    private Button add;

	    @FXML
	    private Button inverse;

	    @FXML
	    private TextField denominator1;

	    @FXML
	    private TextField denominator2;

	    @FXML
	    private TextField numerator1;

	    @FXML
	    private TextField numerator2;

	    @FXML
	    private Label ResDenominator;

	    @FXML
	    private Button simplify;

	    
	    @FXML
	    void butAdd(ActionEvent event) {
	    	
	    	if(!(numerator1.getText().equals("")) && !(denominator1.getText().equals("")) && !(numerator2.getText().equals("")) && !(denominator2.getText().equals(""))) {
	    		
	    		int num1 = Integer.parseInt(numerator1.getText());
		    	int den1 = Integer.parseInt(denominator1.getText());
		    	int num2 = Integer.parseInt(numerator2.getText());
		    	int den2 = Integer.parseInt(denominator2.getText());
		    	
		    	calculator.AddRational(num1, den1, num2, den2);

		    	sign.setText("+");
		    	
	    	}
	    	
	    	

	    }

	    @FXML
	    void butSubstract(ActionEvent event) {
	    	
	    	if(!(numerator1.getText().equals("")) && !(denominator1.getText().equals("")) && !(numerator2.getText().equals("")) && !(denominator2.getText().equals(""))) {
	    	
	    	int num1 = Integer.parseInt(numerator1.getText());
	    	int den1 = Integer.parseInt(denominator1.getText());
	    	int num2 = Integer.parseInt(numerator2.getText());
	    	int den2 = Integer.parseInt(denominator2.getText());
	    	
	    	calculator.SubstractRational(num1, den1, num2, den2);
	    	
	    	sign.setText("-");
	    	}

	    }

	    @FXML
	    void butMultiply(ActionEvent event) {
	    	
	    	if(!(numerator1.getText().equals("")) && !(denominator1.getText().equals("")) && !(numerator2.getText().equals("")) && !(denominator2.getText().equals(""))) {
	    	
	    	int num1 = Integer.parseInt(numerator1.getText());
	    	int den1 = Integer.parseInt(denominator1.getText());
	    	int num2 = Integer.parseInt(numerator2.getText());
	    	int den2 = Integer.parseInt(denominator2.getText());
	    	
	    	calculator.multiplyRacional(num1, den1, num2, den2);
	    	sign.setText("*");
	    	
	    	}
	    }

	    @FXML
	    void butDivide(ActionEvent event) {
	    	
	    	if(!(numerator1.getText().equals("")) && !(denominator1.getText().equals("")) && !(numerator2.getText().equals("")) && !(denominator2.getText().equals(""))) {
	    	int num1 = Integer.parseInt(numerator1.getText());
	    	int den1 = Integer.parseInt(denominator1.getText());
	    	int num2 = Integer.parseInt(numerator2.getText());
	    	int den2 = Integer.parseInt(denominator2.getText());
	    	
	    	calculator.divideRational(num1, den1, num2, den2);
	    	
	    	sign.setText("/");
	    	}

	    }

	    @FXML
	    void butSqr(ActionEvent event) {
	    	
	    	if(!(numerator1.getText().equals("")) && !(denominator1.getText().equals(""))) {
	    		
	    		int num1 = Integer.parseInt(numerator1.getText());
		    	int den1 = Integer.parseInt(denominator1.getText());
	    		
	    		calculator.squaredRational(num1, den1);
	    		
	    		numerator1.setText(String.valueOf(calculator.getNumerator()));
	    		denominator1.setText(String.valueOf(calculator.getDenominator()));
	    		
	    	}
	    	
	    	if(!(numerator2.getText().equals("")) && !(denominator2.getText().equals(""))) {
	    		
	    		int num2 = Integer.parseInt(numerator2.getText());
		    	int den2 = Integer.parseInt(denominator2.getText());
	    		
	    		calculator.squaredRational(num2, den2);
	    		
	    		numerator2.setText(String.valueOf(calculator.getNumerator()));
	    		denominator2.setText(String.valueOf(calculator.getDenominator()));
	    	}

	    }

	    @FXML
	    void butInverse(ActionEvent event) {
	    	
	    	if(!(numerator1.getText().equals("")) && !(denominator1.getText().equals(""))) {
	    		
	    		int num1 = Integer.parseInt(numerator1.getText());
		    	int den1 = Integer.parseInt(denominator1.getText());
	    		
	    		calculator.RationalInverse(num1, den1);
	    		
	    		numerator1.setText(String.valueOf(calculator.getNumerator()));
	    		denominator1.setText(String.valueOf(calculator.getDenominator()));
	    		
	    	}
	    	
	    	if(!(numerator2.getText().equals("")) && !(denominator2.getText().equals(""))) {
	    		
	    		int num2 = Integer.parseInt(numerator2.getText());
		    	int den2 = Integer.parseInt(denominator2.getText());
	    		
	    		calculator.RationalInverse(num2, den2);
	    		
	    		numerator2.setText(String.valueOf(calculator.getNumerator()));
	    		denominator2.setText(String.valueOf(calculator.getDenominator()));
	    	}

	    }

	    @FXML
	    void butDelete(ActionEvent event) {
	    	
	    	numerator1.setText("");
	    	denominator1.setText("");
	    	numerator2.setText("");
	    	denominator2.setText("");
	    	ResNumerator.setText("");
	    	ResDenominator.setText("");
	    	

	    }

	    @FXML
	    void butZero(ActionEvent event) {

	    }

	    @FXML
	    void butIquals(ActionEvent event) {
	    	

	    	ResNumerator.setText(String.valueOf(calculator.getNumerator()));
	    	ResDenominator.setText(String.valueOf(calculator.getDenominator()));

	    }

	    @FXML
	    void butSimplify(ActionEvent event) {
	    	
	    	if(!(numerator1.getText().equals("")) && !(denominator1.getText().equals(""))) {
	    		
	    		int num1 = Integer.parseInt(numerator1.getText());
		    	int den1 = Integer.parseInt(denominator1.getText());
	    		
	    		calculator.simplifyRational(num1, den1);
	    		
	    		numerator1.setText(String.valueOf(calculator.getNumerator()));
	    		denominator1.setText(String.valueOf(calculator.getDenominator()));
	    		
	    	}
	    	
	    	if(!(numerator2.getText().equals("")) && !(denominator2.getText().equals(""))) {
	    		
	    		int num2 = Integer.parseInt(numerator2.getText());
		    	int den2 = Integer.parseInt(denominator2.getText());
	    		
	    		calculator.RationalInverse(num2, den2);
	    		
	    		numerator2.setText(String.valueOf(calculator.getNumerator()));
	    		denominator2.setText(String.valueOf(calculator.getDenominator()));
	    	}

	    }

}
