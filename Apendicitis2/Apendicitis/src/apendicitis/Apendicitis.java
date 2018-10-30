
package apendicitis;

import Modelo.ArbolBinario;
import Modelo.Nodo;
import Vista.Vista;
import java.util.ArrayDeque;
import javax.swing.JFrame;


public class Apendicitis {

   
    
    public static ArbolBinario arboltotal;
    
    public static void main(String[] args) {
        
        ArrayDeque<Nodo> pila = new ArrayDeque<>();

       
        Nodo noAP = new Nodo(null, "NO APENDICITIS", null);
        Nodo AP = new Nodo(null, "APENDICITIS", null);        
        Nodo raiz;
        Nodo left, right;
        
        left = ArbolBinario.nuevoArbol(noAP,"Migración del dolor"+"\n hacia "
                   + "el cuadrante derecho"+ "" ,AP);      
        right = AP;               
        raiz = ArbolBinario.nuevoArbol(left,"ANOREXIA",right);        
        pila.push(raiz);
        
        
        left = noAP;
        right =  ArbolBinario.nuevoArbol(left, "ANOREXIA", AP);        
        raiz = ArbolBinario.nuevoArbol(left, "Leucositosis", right);        
        pila.push(raiz);
        
        
        left = pila.pop();
        right = pila.pop();        
        raiz = ArbolBinario.nuevoArbol(left, "Náuseas/vomitos", right);        
        pila.push(raiz);
        
        right = pila.pop();
        raiz = ArbolBinario.nuevoArbol(noAP, "Signo de Blumberg", right);
        
        
       arboltotal = new ArbolBinario(raiz);
       
       JFrame.setDefaultLookAndFeelDecorated(true);
     
       Vista a = new Vista();        
        a.setVisible(true);
        
      
    }
    
    
    public static ArbolBinario getArbol(){    
    return arboltotal;
    }
    
    
    
    
    
    
    
}
