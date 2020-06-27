package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class pfin extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			FXMLLoader loader = new FXMLLoader();
		    loader.setLocation(getClass().getResource("/view/login.fxml"));

//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		    Parent root = loader.load();
		    Scene screen = new Scene(root);
		    primaryStage.setScene(screen);
		    primaryStage.setTitle("pfin");
		    primaryStage.setResizable(false);
		    primaryStage.show();
		    
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
