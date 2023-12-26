package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;



public class PG23 extends Application {
	Label lblProg;
	Button btnIncrease, btnDecrease;
	ProgressBar progBar;
	ProgressIndicator progInd;
	
	public PG23() {
		lblProg = new Label("Progress:");
		btnIncrease = new Button("Increase");
		btnDecrease = new Button("Decrease");
		progBar = new ProgressBar(0);
		progInd = new ProgressIndicator(0);
		
		
	}//end of constructor
	
	public void init() {
		
		//Handle events on Increase and Decrease Button
		btnIncrease.setOnAction(event ->increaseProgress());
		
		btnDecrease.setOnAction(event ->decreaseProgress());
		
		
	}   //end of init
		
		//method for increase progress
          private void increaseProgress() {
          //first show that increase button is clicked
	      System.out.println("Clicked Increase");
	      //Get current Progress
          double progress = progBar.getProgress();
          System.out.println("Progress +" + progress);
          //Increase Progress
          progress += 0.05;
          //max progress can be 1, not >1
          if (progress>1) 
        	  progress = 1;
          //If progress <0.4, the progInd and progBar has red accent
          if (progress<0.4) {
        	  progBar.setStyle("-fx-accent: red;");
        	  progInd.setStyle("-fx-accent: red;");
          }
          else if(progress>0.9) {
        	  progBar.setStyle("-fx-accent: blue;");
        	  progInd.setStyle("-fx-accent: blue;");
          }
          else {
        	  progBar.setStyle("-fx-accent: green;");
        	  progInd.setStyle("-fx-accent: green;");
          }
	           progBar.setProgress(progress);
	           progInd.setProgress(progress);
          }
	     	
		//Same process for decrease button
          private void decreaseProgress() {
              //first show that increase button is clicked
    	      System.out.println("Clicked Decrease");
    	      //Get current Progress
              double progress = progBar.getProgress();
              System.out.println("Progress: " + progress);
              //Decrease Progress
              progress -= 0.05;
              //max progress can be 1, not >1
              if (progress>1) 
            	  progress = 1;
              //If progress <0.4, the progInd and progBar has red accent
              if (progress<0.4) {
            	  progBar.setStyle("-fx-accent: red;");
            	  progInd.setStyle("-fx-accent: red;");
              }
              else if(progress>0.9) {
            	  progBar.setStyle("-fx-accent: blue;");
            	  progInd.setStyle("-fx-accent: blue;");
              }
              else {
            	  progBar.setStyle("-fx-accent: green;");
            	  progInd.setStyle("-fx-accent: green;");
              }
    	           progBar.setProgress(progress);
    	           progInd.setProgress(progress);
          
    
          //Sr
          if (progress < 0) progress = 0;
          
          if (progress<0.4) {
        	  progBar.setStyle("-fx-accent: red;");
        	  progInd.setStyle("-fx-accent: red;");
          }
          else if(progress>0.9) {
        	  progBar.setStyle("-fx-accent: blue;");
        	  progInd.setStyle("-fx-accent: blue;");
          }
          else {
        	  progBar.setStyle("-fx-accent: green;");
        	  progInd.setStyle("-fx-accent: green;");
          }
	           progBar.setProgress(progress);
	           progInd.setProgress(progress);
          
		

	
}


	@Override
	public void start(Stage primaryStage) throws Exception {
		// set title, minimum width and height for primaryStage
		primaryStage.setTitle("PG23");
		primaryStage.setMinHeight(20);
		primaryStage.setMinWidth(20);
		
		//Main layout VBox
		VBox vbMain = new VBox();
		vbMain.setSpacing(10);
		vbMain.setPadding(new Insets(10));
		
		//Create a HBox for Progress Indicator and Progress Bar
		HBox hb1  =new HBox();
		hb1.getChildren().addAll(progBar,progInd);
		
		//create a Hbox for Increase and Decrease Button
		HBox hb2 = new HBox();
		hb2.getChildren().addAll(btnIncrease,btnDecrease);
		
		
		//Add all layouts and components to main layout
		vbMain.getChildren().addAll(lblProg,hb1,hb2);
		
		//Create a scene (Not like one would create in a restaurant!!)
		Scene s = new Scene(vbMain);
		
		//Set a scene
		primaryStage.setScene(s);
		
		//Show the scene
		primaryStage.show();
		
}

	public static void main(String[] args) {
		// T-0 seconds, lets gooo!!!!!
		launch();

	}

}
