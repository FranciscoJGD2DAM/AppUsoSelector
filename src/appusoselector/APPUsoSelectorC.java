/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusoselector;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import selectordeslizamiento.SelectorDeslizamiento;

/**
 *
 * @author usuario
 */
public class APPUsoSelectorC implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private SelectorDeslizamiento SelectorArriba;
    @FXML
    private SelectorDeslizamiento SelectorAbajo;
    @FXML
    private Label LabelMostarSeleccionado;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        List<String> lista = new ArrayList<String>();
        List<String> lista2 = new ArrayList<String>();
        
        lista.add("Uno");
        lista.add("Dos");
        lista.add("Tres");
        lista.add("Cuatro");
        lista.add("Cinco");
        
        lista2.add("Uno");
        lista2.add("Dos");
        lista2.add("Tres");
        lista2.add("Cuatro");
        lista2.add("Cinco");
        
        SelectorArriba.setItems((ArrayList<String>) lista);
        SelectorAbajo.setItems((ArrayList<String>) lista2);
        
        
        
    }

    @FXML
    private void onActionselectorArrriba(ActionEvent event) {
        LabelMostarSeleccionado.setText("Pulsado el selector de arriba");
    }

    @FXML
    private void onActionselectorAbajo(ActionEvent event) {
        LabelMostarSeleccionado.setText("Pulsado el selector de abajo");
    }
    
    
}
