/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author E304
 */
public class Nodo {
    
    private Nodo left;
    private Object dato;
    private Nodo right;
    
    
    public Nodo(){}
    
    public Nodo(Nodo left, Object dato, Nodo right){
    
    this.left = left;
    this.dato = dato;
    this.right = right;
    
    
    }

    public Nodo getLeft() {
        return left;
    }

    public void setLeft(Nodo left) {
        this.left = left;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getRight() {
        return right;
    }

    public void setRight(Nodo right) {
        this.right = right;
    }
    
    
    
    
    
    
    
}
