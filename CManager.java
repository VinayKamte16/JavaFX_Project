package application;
	
//Standard javafx imports
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
//components in this app
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
//imports for layouts
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;			
import javafx.scene.layout.HBox;
//Insetting and alignment
import javafx.geometry.Insets;
import javafx.geometry.Pos;
//Quitting the app
import javafx.application.Platform;
//Imports for file handling support
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
//Image for the icon
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
//Imports for alerts
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class CManager extends Application {
	//Components that need class scope.
	Label lblNames, lblEmail, lblAddress;
	TextField txtfEmail;
	TextArea txtAddr;
	Button btnClose, btnAbout;
	ListView<String> lvNames;
	

	public CManager() {
		//Instantiate components with 'new'
		lblNames = new Label("Names:");
		lblEmail = new Label("Email:");
		lblAddress = new Label("Address:");
		
		txtfEmail = new TextField();
		txtfEmail.setDisable(true);
		
		txtAddr = new TextArea();
		txtAddr.setDisable(true);
		
		
		btnClose = new Button("Close");
		btnClose.setMinWidth(60);
		btnClose.setStyle("-fx-color:green;");
		
		btnAbout = new Button("About");
		btnAbout.setMinWidth(60);	
		btnAbout.setStyle("-fx-color:blue;");
		
		lvNames = new ListView<String>();
		
		readContactNames("C:\\Users\\HP\\eclipse-workspace\\Tutorials\\contacts.csv");
		
	}
		
		private void readContactNames(String contactsFile) {
		try {
			BufferedReader buf = new BufferedReader( new FileReader(contactsFile));
			String line;
			while ((line = buf.readLine()) !=null) {
             	
			
			String[] contactDataArray = new String[3];
             contactDataArray = line.split(":");
             
             lvNames.getItems().add(contactDataArray[0]);
			}
			buf.close();
		}
			catch(Exception e) {
				System.err.println("File not found");
				e.printStackTrace();
				
			}
		}
		
		


		
		
		
		
		
	
	
	@Override
	public void init() {
		//Event handling...
		btnClose.setOnAction(event ->Platform.exit());
		
       btnAbout.setOnAction(event ->{
			 
			 Alert ar = new Alert(AlertType.INFORMATION);
			 
			 ar.setTitle("About");
			 
			 ar.setHeaderText("Student Number");
			 
			 ar.setContentText("3061040");
			 
			 ar.show();
			 
       });
       
     
       lvNames.setOnMousePressed(event -> {
    	  
    	  String selectedName =  lvNames.getSelectionModel().getSelectedItem().toString();
    	   try {
    	   BufferedReader buf = new BufferedReader(new FileReader("C:\\Users\\HP\\eclipse-workspace\\Tutorials\\contacts.csv"));
           String line;
           while ((line = buf.readLine()) != null) {
        	   String[] readLine = new String[3];
        	   readLine = line.split(":");
        	   if (readLine[0].equals(selectedName)) {
        		 //  System.out.print("FOUND "+ selectedName);
        		   String foundEMail = readLine[1];
        		   String foundAddr = readLine[2];
        	      
        		   
        		   txtfEmail.setText(foundEMail);
        		   txtAddr.setText(foundAddr);
        	   }
           }
        	   buf.close();
           }
    	   
           
           catch(Exception e) {
        	   System.err.println("Error loading mail and address");
        	   e.printStackTrace();
           }
           
           
           
           
       });
       
      
       
	}	      
    	      
    	      
    	      
    	      
    	      
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
        
    	   
    	   
    	   
    	   
       
       
    		   
    		   
    		   
    		   
    		   
    		   
    		
		
       
       
       
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//Set the title
		primaryStage.setTitle("ContactManager V1.0.0");
		
		//TODO: Add an icon
		//Always put a try and catch
		try {
			//add the icon
			primaryStage.getIcons().add(new Image("C:\\Users\\HP\\Desktop\\VinayIRP\\csk.png"));
		
		}
		catch(Exception e) {
			System.err.println("Wrong icon");
			e.printStackTrace();
			
		}
		//Set the width and height.
		primaryStage.setWidth(400);
		primaryStage.setHeight(300);
				
		//Create a layout
		//VBox vbMain = new VBox(); // our main container
		
		//Set the spacing
		//vbMain.setSpacing(10);
		//vbMain.setPadding(new Insets(10));
		
		//Sublayout Gridpane
		GridPane gp = new GridPane();
		gp.setHgap(10);
		gp.setVgap(10);
		
		//Sublayout HBox for buttons
		//HBox hbButtons = new HBox();
//		hbButtons.setSpacing(10);
//		hbButtons.getChildren().addAll(btnAbout,btnClose);
//		hbButtons.setAlignment(Pos.BASELINE_RIGHT);
//		
		//Add components to the gridpane
		gp.add(lblNames, 0, 0);
		gp.add(lblEmail, 1, 0);
		gp.add(txtfEmail, 1, 1);
		gp.add(lblAddress, 1, 2);
		gp.add(txtAddr, 1, 3);
		gp.add(lvNames, 0, 1, 1, 3);
		gp.add(btnAbout, 2, 6);
		gp.add(btnClose, 3, 6);
		
		//add subcontainers to main layout
//		vbMain.getChildren().add(gp);
//		vbMain.getChildren().add(hbButtons);
//				
		//Create a scene
		Scene s = new Scene(gp);
		
		//TODO: apply a stylesheet
        s.getStylesheets().add("css_style.css");
		
		//Set the scene
		primaryStage.setScene(s);
		
		//Show the stage
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		//Launch the application.
		launch();
	}
}