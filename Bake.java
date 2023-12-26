package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Bake extends Application {
	Button btnBake, btnReset;
	ImageView imv;
	ProgressBar progBar;
	
	public Bake() {
		btnBake = new Button("Bake!");
		btnReset = new Button("Reset");
		progBar = new ProgressBar(0);
		progBar.setStyle("-fx-accent: #ff9412;");
		imv = new ImageView();
	}//end of constructor
	
	public void init() {
		
		btnBake.setOnAction(event -> clickedBake());
		
		btnReset.setOnAction(event -> clickedReset());
		
	}//end of init
	
	      private void clickedBake() {
	      //First show that bake was clicked
	    	  System.out.println("Bake!!!!");
	    	  // Get current status
	    	  double progress = progBar.getProgress();
	    	  progress += 0.1;
	    	  
	    	  if (progress >1) progress = 1;
	    	  
	    	  if(progress <0.3) {
	    		  Image img = new Image("red.jpg");
	    			imv.setImage(img);
	    	  }
	    	  else if(progress>0.6) {
	    		  Image img = new Image("blue.jpg");
	    			imv.setImage(img);
	    	  }
	    	  else {
	    		  Image img = new Image("brownie.jpg");
	    			imv.setImage(img);
	    	  }
	    	  progBar.setProgress(progress);
	      }
	      
	      private void clickedReset() {
	    	  btnBake.setDisable(false);
	    	  Image img = new Image("red.jpg");
  			imv.setImage(img);
	    	  double progress = progBar.getProgress();
	    	  progress = 0;
	    	  progBar.setProgress(progress);
	    	  }
	
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		//set title, min width and height for layout
		primaryStage.setTitle("CupcakeFest");
		primaryStage.setMinHeight(300);
		primaryStage.setMinWidth(400);
		
		//Scale the image
		
		

		//set preserve ratio
		imv.setFitWidth(300);
		progBar.setPrefWidth(400);
		
		
       BorderPane bpMain = new BorderPane();
      
      
       
       bpMain.setStyle("-fx-background-color: #ffc175;");
       bpMain.setCenter(imv);
      bpMain.setLeft(btnBake);
     bpMain.setBottom(progBar);
       bpMain.setRight(btnReset);
       
       
       //create a scene
       Scene s = new Scene(bpMain);
       
       //set the scene
       primaryStage.setScene(s);
       
       //show the scene
       primaryStage.show();
       
       
       }

	public static void main(String[] args) {
		launch();

	}

}
