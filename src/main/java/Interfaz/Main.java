package Interfaz;

import Generic.RationalNumber;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import modelo.Calculator;

public class Main extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("/view/inicio.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Calculator");
		primaryStage.show();
	}

	
	public static void main(String[] args) {
		
//		Calculator calcu = new Calculator();
//		calcu.multiplyRacional(2, 3, 3, 2);
//		
//		System.out.println(calcu.getNumerator() + " : " + calcu.getDenominator()); 
//		
		
		launch(args);
		
		
	}
}
