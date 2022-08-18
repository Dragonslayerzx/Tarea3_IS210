
package com.lol.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javax.swing.JOptionPane;

public class VentanaController implements Initializable {
   
    @FXML
    private Button pressme;
    
    @FXML
    private void pressmev(ActionEvent event){
        
       JOptionPane.showMessageDialog(null, "Luis Daniel Diaz Caceres #20191032212");
       
    }
    
    @FXML
    private Button button0;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private Button buttonaddition;

    @FXML
    private Button buttonclear;

    @FXML
    private Button buttondelete;

    @FXML
    private Button buttondivision;

    @FXML
    private Button buttonequal;

    @FXML
    private Button buttonmultiplication;

    @FXML
    private Button buttonpoint;

    @FXML
    private Button buttonsubtraction;

    @FXML
    private Button buttton7;

    @FXML
    private Label screen;

    @FXML
    private Label screen2;
   
    double result;
    boolean sw = false;
    String num1 = "";
    String op = "";
    
    public void addvalue(ActionEvent event){
        
        if(sw == true){
            double n1 = Double.parseDouble(num1);
            
            screen.setText(screen.getText() + ((Button) event.getSource()).getText());
            String num2 = screen.getText();
            double n2 = Double.parseDouble(num2);
           
            switch(op){
                case "+":
                    result = n1+n2;
                break;
                    
                case "-":
                    result = n1-n2;
                break;
                    
                case "×":
                    result = n1*n2;
                break;
                    
                case "÷":
                    result = n1/n2;
                break;
            }
            screen2.setText(""+result);
            
        }else
            screen.setText(screen.getText() + ((Button) event.getSource()).getText());
        
          
    }

    public void clearScreen(){
        if (sw = true){
            sw = false;
            screen.setText("");
            screen2.setText("");
        }
        screen.setText("");
        screen2.setText("");
        
    }
    
    public void clearEntry(){
       if (!(screen.getText().length() == 0)) {
            screen.setText(screen.getText().substring(0, screen.getText().length() - 1));
        } 
    }
    
    public void operation(ActionEvent event){
        if(sw == true){
         return;   
        }
        op = ((Button) event.getSource()).getText();
        sw = true;
        num1 = screen.getText();
        screen.setText("");
        
          
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        
    }    
    
}
