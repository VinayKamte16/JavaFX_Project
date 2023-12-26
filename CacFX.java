package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CacFX extends Application {
	TextArea txtMain;
	Button bOne,b2,b3,b4,b5,b6,b7,b8,b9,b0,bMul,bDiv,bAdd,bSub,bC,bEqt;
	
	public  CacFX() {
		txtMain = new TextArea();
		txtMain.setDisable(true);
		bOne = new Button("1");
		b2 = new Button("2");
		b3 = new Button("3");
		b4 = new Button("4");
		b5 = new Button("5");
		b6 = new Button("6");
		b7 = new Button("7");
		b8 = new Button("8");
		b9 = new Button("9");
		b0 = new Button("0");
		bMul = new Button("*");
		bDiv = new Button("/");
		bEqt = new Button("=");
		bC = new Button("C");
		bAdd = new Button("+");
		bSub = new Button("-");
	}

	
	public void init() {
		bOne.setOnAction(event ->{
		txtMain.setDisable(false);
		txtMain.setText("1");
		
		b2.setOnAction(event ->{
		txtMain.setDisable(false);
		txtMain.setText("2");
		});
			
		bOne.setOnAction(event ->{
		txtMain.setDisable(false);
		txtMain.setText("1");
				
		bOne.setOnAction(event ->{
		txtMain.setDisable(false);
		txtMain.setText("1");
			
		bOne.setOnAction(event ->{
		txtMain.setDisable(false);
		txtMain.setText("1");
				
		bOne.setOnAction(event ->{
		txtMain.setDisable(false);
		txtMain.setText("1");
					
		bOne.setOnAction(event ->{
		txtMain.setDisable(false);
		txtMain.setText("1");
						
		bOne.setOnAction(event ->{
		txtMain.setDisable(false);
		txtMain.setText("1");
							
		bMul.setOnAction(event ->{
		txtMain.setDisable(false);
	    txtMain.setText("1");
	});
								
	    bOne.setOnAction(event ->{
		txtMain.setDisable(false);
		txtMain.setText("1");
									
		bOne.setOnAction(event ->{
		txtMain.setDisable(false);
		txtMain.setText("1");
										
		bOne.setOnAction(event ->{
		txtMain.setDisable(false);
		txtMain.setText("1");
											
		bOne.setOnAction(event ->{
	    txtMain.setDisable(false);
		txtMain.setText("1");
												
		bOne.setOnAction(event ->{
		txtMain.setDisable(false);
	    txtMain.setText("1");
													
													
		
		});
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("CacFX");
		primaryStage.setMinHeight(800);
		primaryStage.setMinWidth(600);
		
		
		//Main layout
		BorderPane bpMain = new BorderPane();
		bpMain.setMinHeight(200);
		bpMain.setMinWidth(300);
		
		
		
		//for buttons
		GridPane gpMain = new GridPane();
		
		gpMain.setVgap(20);
		gpMain.setHgap(20);
		gpMain.add(bOne, 0, 0);
		gpMain.add(b2, 1, 0);
		gpMain.add(b3, 2, 0);
		gpMain.add(bAdd, 3, 0);
		gpMain.add(b4, 0, 1);
		gpMain.add(b5, 1, 1);
		gpMain.add(b6, 2, 1);
		gpMain.add(bMul, 3, 1);
		gpMain.add(b7, 0, 2);
		gpMain.add(b8, 1, 2);
		gpMain.add(b9, 2, 2);
		gpMain.add(bSub, 3, 2);
		gpMain.add(bC, 0, 3);
		gpMain.add(b0, 1, 3);
		gpMain.add(bEqt, 2, 3);
		gpMain.add(bDiv, 3, 3);
		
		
		
		
		
		
		
		bpMain.setLeft(txtMain);
		bpMain.setRight(gpMain);
		
		
		
		Scene s = new Scene(bpMain);
		
		primaryStage.setScene(s);
		
		primaryStage.show();
		
		
		

	}

	public static void main(String[] args) {
		launch(args);

	}
	
}
