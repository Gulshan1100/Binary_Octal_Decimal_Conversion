/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binaryoctaldecimalconversion;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
/**
 *
 * @author gulsh
 */
public class BinaryOctalDecimalConversion extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Binary to Decimal");
        
        Button btn2 = new Button();
        btn2.setText("Decimal to Binary");
        
        Button btn3 = new Button();
        btn3.setText("Octal to Decimal");
        
        Button btn4 = new Button();
        btn4.setText("Decimal to Octal");
        
        Button btn5 = new Button();
        btn5.setText("Binary to Octal");
        
        Button btn6 = new Button();
        btn6.setText("Octal to Binary");
        
        TextField input=new TextField();
        TextField output=new TextField();
        Conversion c=new Conversion();
        
        HBox h=new HBox();
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
               output.setText(Integer.toString(c.BtoD(Integer.parseInt(input.getText()))));
            }
        });
        
         btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
               output.setText(c.DtoB(Integer.parseInt(input.getText())));
            }
        });
         
          btn3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                output.setText(Integer.toString(c.OtoD(Integer.parseInt(input.getText()))));
            }
        });
          
           btn4.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                output.setText(c.DtoO(Integer.parseInt(input.getText())));
            }
        });
           
            btn5.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
               output.setText(c.BtoO(Integer.parseInt(input.getText())));
            }
        });
            
             btn6.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
               output.setText(c.OtoB(Integer.parseInt(input.getText())));
            }
        });
        
        VBox root = new VBox();
        h.getChildren().addAll(input,output);
        root.getChildren().add(h);
        
        root.getChildren().add(btn);
        root.getChildren().add(btn2);
        root.getChildren().add(btn3);
        root.getChildren().add(btn4);
        root.getChildren().add(btn5);
        root.getChildren().add(btn6);
        Scene scene = new Scene(root, 200, 250);
        
        primaryStage.setTitle("BinaryOctalDecimalConversion");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
