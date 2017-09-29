package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login extends Application {

    public static void main(String[] args) {
    	UserFunction.load_list();
    	UserFunction.authenticate("na", "na");
    	
        launch(args);
        UserFunction.save_list();

    }

    
 
    public static Stage primary_stage;

	@Override
    public void start(Stage primaryStage) {
		primary_stage = primaryStage;
        primaryStage.setTitle("JavaFX Welcome");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);
        
        Label type=new Label("Type");
        grid.add(type,0,3);
        
        TextField typeTextField = new TextField();
        grid.add(typeTextField, 1, 3);

        
        

        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);
        
        Button sign_btn= new Button("Sign Up");
        grid.add(sign_btn, 0, 4);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);

        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Sign in button pressed");
                 Object Group;
				if (UserFunction.authenticate(userTextField.getText(), pwBox.getText()))
                 {   
					
					
               	 Group grp = new Group();
               	 Scene scn= new Scene(grp,300,300);
               	Button atmpt= new Button("Attempt Quiz");
           
               grp.getChildren().add(atmpt);
              
               primaryStage.setScene(scn);
                	 
                 }
                 else {  
                	
                	 Group grp = new Group();
                	 Scene scn= new Scene(grp,300,300);
                		Button msg= new Button("Wrong Username or Password");
                grp.getChildren().add(msg);
               
                primaryStage.setScene(scn);
            }
            }
        });
        
        sign_btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e)
            {
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Sign Up button pressed");
                UserFunction.add_user(userTextField.getText(), pwBox.getText(),typeTextField.getText());
            }
        });

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
