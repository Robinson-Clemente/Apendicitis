package apendicitis;

import Modelo.Nodo;
import Vista.Vista;
import javax.swing.JOptionPane;

public class Correr {

    Nodo element = Apendicitis.getArbol().getRaiz();
    boolean estado =false;

    public boolean Recorrer(String answer) {

        Vista.setText(element.getDato().toString());

        if (answer.equals("SI")) {

            if (element.getRight() != null) {
                element = element.getRight();
                Vista.setText(element.getDato().toString());
            }
        } else {
            if (element.getLeft() != null) {
                element = element.getLeft();
                Vista.setText(element.getDato().toString());
            }
        }

        if (element.getDato().equals("APENDICITIS")) {

            JOptionPane.showMessageDialog(null, "TIENE APENDICITIS",null,0);
           Vista.comprobar(true);
        } else if (element.getDato().equals("NO APENDICITIS")) {

            JOptionPane.showMessageDialog(null, "NO TIENE APENDICITIS");
            Vista.comprobar(false);

        }
   
    return estado;
    }

    
    
  public  void reiniciar(){
  
  element = Apendicitis.getArbol().getRaiz();
  Vista.setText(element.getDato().toString());
  Vista.colordefault();
  }  
    
}

