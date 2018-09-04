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
	    private Button nine;

	    @FXML
	    private Label sign;

	    @FXML
	    private Button seven;

	    @FXML
	    private Button two;

	    @FXML
	    private Button three;

	    @FXML
	    private Button delete;

	    @FXML
	    private Button eight;

	    @FXML
	    private Button zero;

	    @FXML
	    private Button sqr;

	    @FXML
	    private Button four;

	    @FXML
	    private Button divide;

	    @FXML
	    private Button Iquals;

	    @FXML
	    private Button multiply;

	    @FXML
	    private Button five;

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
	    private Button six;

	    @FXML
	    private TextField denominator2;

	    @FXML
	    private Button one;

	    @FXML
	    private TextField numerator1;

	    @FXML
	    private TextField numerator2;

	    @FXML
	    private Label ResDenominator;

	    @FXML
	    private Button simplify;

	    @FXML
	    void butOne(ActionEvent event) {

	    }

	    @FXML
	    void butTwo(ActionEvent event) {

	    }

	    @FXML
	    void butThree(ActionEvent event) {

	    }

	    @FXML
	    void butFour(ActionEvent event) {

	    }

	    @FXML
	    void butFive(ActionEvent event) {

	    }

	    @FXML
	    void butSix(ActionEvent event) {

	    }

	    @FXML
	    void butSeven(ActionEvent event) {

	    }

	    @FXML
	    void butEight(ActionEvent event) {

	    }

	    @FXML
	    void butNine(ActionEvent event) {

	    }

	    @FXML
	    void butAdd(ActionEvent event) {
	    	
	    	int num1 = Integer.parseInt(numerator1.getText());
	    	int den1 = Integer.parseInt(denominator1.getText());
	    	int num2 = Integer.parseInt(numerator2.getText());
	    	int den2 = Integer.parseInt(denominator2.getText());
	    	
	    	calculator.AddRational(num1, den1, num2, den2);

	    	sign.setText("+");
	    	

	    }

	    @FXML
	    void butSubstract(ActionEvent event) {
	    	
	    	int num1 = Integer.parseInt(numerator1.getText());
	    	int den1 = Integer.parseInt(denominator1.getText());
	    	int num2 = Integer.parseInt(numerator2.getText());
	    	int den2 = Integer.parseInt(denominator2.getText());
	    	
	    	calculator.SubstractRational(num1, den1, num2, den2);
	    	
	    	sign.setText("-");
	    	

	    }

	    @FXML
	    void butMultiply(ActionEvent event) {
	    	
	    	int num1 = Integer.parseInt(numerator1.getText());
	    	int den1 = Integer.parseInt(denominator1.getText());
	    	int num2 = Integer.parseInt(numerator2.getText());
	    	int den2 = Integer.parseInt(denominator2.getText());
	    	
	    	calculator.multiplyRacional(num1, den1, num2, den2);
	    	sign.setText("*");
	    	

	    }

	    @FXML
	    void butDivide(ActionEvent event) {
	    	
	    	int num1 = Integer.parseInt(numerator1.getText());
	    	int den1 = Integer.parseInt(denominator1.getText());
	    	int num2 = Integer.parseInt(numerator2.getText());
	    	int den2 = Integer.parseInt(denominator2.getText());
	    	
	    	calculator.divideRational(num1, den1, num2, den2);
	    	
	    	sign.setText("/");
	    	

	    }

	    @FXML
	    void butSqr(ActionEvent event) {

	    }

	    @FXML
	    void butInverse(ActionEvent event) {

	    }

	    @FXML
	    void butDelete(ActionEvent event) {

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

	    }

}
