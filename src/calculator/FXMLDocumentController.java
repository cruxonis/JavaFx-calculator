/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author zentrend
 */
public class FXMLDocumentController implements Initializable {
    
    ScriptEngine js = new ScriptEngineManager().getEngineByExtension("js");
    private String szamol(String kifejezes){
        String eredmeny;
        kifejezes=kifejezes.replace(",",".");
        try{
            eredmeny = ""+js.eval(kifejezes);
        }catch(ScriptException ex){
            eredmeny=" ";
        } if(eredmeny.equals("null")){
            eredmeny = "0";
        }else if(eredmeny.contains("fun"))
            eredmeny="";
        return eredmeny;
    }
    char[] szamok = {'1','2','3','4','5','6','7','8','9','0'};
    //Engedélyezi, hogy lehet e tizedes vesszőt letenni
    boolean tort=true;
    
    @FXML
    private TextField szamolas;

    @FXML
    private TextField eredmeny;

    @FXML
    private Button egy;

    @FXML
    private Button ketto;

    @FXML
    private Button harom;

    @FXML
    private Button oszt;

    @FXML
    private Button negy;

    @FXML
    private Button ot;

    @FXML
    private Button hat;

    @FXML
    private Button szoroz;

    @FXML
    private Button het;

    @FXML
    private Button nyolc;

    @FXML
    private Button kilenc;

    @FXML
    private Button minusz;

    @FXML
    private Button nulla;

    @FXML
    private Button egyenlo;

    @FXML
    private Button plusz;
    
        @FXML
    private Button tizedes;

    @FXML
    private Button torol;

    @FXML
    private Button szazalek;

    
    @FXML
    void adEgy(ActionEvent event) {
        
        
        szamolas.setText(szamolas.getText() + "1");
    }

    @FXML
    void adKetto(ActionEvent event) {
        szamolas.setText(szamolas.getText() + "2");
    }

    @FXML
    void adHarom(ActionEvent event) {
        szamolas.setText(szamolas.getText() + "3");
    } 
    
    
    @FXML
    void adNegy(ActionEvent event) {
        szamolas.setText(szamolas.getText() + "4");
    }
    
    @FXML
    void adOt(ActionEvent event) {
        szamolas.setText(szamolas.getText() + "5");
    }
    
    @FXML
    void adHat(ActionEvent event) {
        szamolas.setText(szamolas.getText() + "6");
    }

    @FXML
    void adHet(ActionEvent event) {
        szamolas.setText(szamolas.getText() + "7");
    }


    @FXML
    void adNyolc(ActionEvent event) {
        szamolas.setText(szamolas.getText() + "8");
    }
    
     @FXML
    void adKilenc(ActionEvent event) {
        szamolas.setText(szamolas.getText() + "9");
    }

        
    @FXML
    void adNulla(ActionEvent event) {
        szamolas.setText(szamolas.getText() + "0");
    }
    
    @FXML
    void minusz(ActionEvent event) {
        //Lekérdezi az utolsó karaktert a sorból
        char l= szamolas.getText().charAt(szamolas.getText().length()-1);
        //ellenőrzi, hogy van e már érték bevive
        if(szamolas.getText().length()>0){
            //ellenőrzi, hogy az utolsó bevitt érték egy szám e
            for (int i = 0; i < szamok.length; i++) {
                if (l==szamok[i]) {
                    szamolas.setText(szamolas.getText() + "-");
                    tort=true;
                }
            }
        }  
    }

    @FXML
    void oszt(ActionEvent event) {
        //Lekérdezi az utolsó karaktert a sorból
        char l= szamolas.getText().charAt(szamolas.getText().length()-1);
        //ellenőrzi, hogy van e már érték bevive
        if(szamolas.getText().length()>0){
            //ellenőrzi, hogy az utolsó bevitt érték egy szám e
            for (int i = 0; i < szamok.length; i++) {
                
                    if (l==szamok[i]) {
                    
                    szamolas.setText(szamolas.getText() + "/");
                    tort=true;
                }
            }
        }
        
    }

    @FXML
    void plusz(ActionEvent event) {
        //Lekérdezi az utolsó karaktert a sorból
        char l= szamolas.getText().charAt(szamolas.getText().length()-1);
        //ellenőrzi, hogy van e már érték bevive
        if(szamolas.getText().length()>0){
            //ellenőrzi, hogy az utolsó bevitt érték egy szám e
            for (int i = 0; i < szamok.length; i++) {
                if (l==szamok[i]) {
                    szamolas.setText(szamolas.getText() + "+");
                    tort=true;
                }
            }
        }  
    }

    @FXML
    void szazalek(ActionEvent event) {
        
    }

    @FXML
    void szoroz(ActionEvent event) {
        //Lekérdezi az utolsó karaktert a sorból
        char l= szamolas.getText().charAt(szamolas.getText().length()-1);
        //ellenőrzi, hogy van e már érték bevive
        if(szamolas.getText().length()>0){
            //ellenőrzi, hogy az utolsó bevitt érték egy szám e
            for (int i = 0; i < szamok.length; i++) {
                if (l==szamok[i]) {
                    szamolas.setText(szamolas.getText() + "*");
                    tort=true;
                }
            }
        }  
    }
    

    @FXML
    void tizedes(ActionEvent event) {
        //Lekérdezi az utolsó karaktert a sorból
        char l= szamolas.getText().charAt(szamolas.getText().length()-1);
        //ellenőrzi, hogy van e már érték bevive
        
        
        if(szamolas.getText().length()>0){
            //ellenőrzi, hogy az utolsó bevitt érték egy szám e
            for (int i = 0; i < szamok.length; i++) {
                    if (l==szamok[i] && tort==true) {
                    szamolas.setText(szamolas.getText() + ",");
                    tort=false;
                }    
            }
        }  
    }

    
    @FXML
    void torlesAction(ActionEvent event){
        szamolas.clear();
        tort=true;
        szamolas.requestFocus();
    }
     @FXML
    void vagolapAction(ActionEvent event) {
       
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        szamolas.textProperty().addListener(
        (ob, regi, uj)->{
        eredmeny.setText(szamol(uj));
            
    });
        // TODO
    }    
    
}
