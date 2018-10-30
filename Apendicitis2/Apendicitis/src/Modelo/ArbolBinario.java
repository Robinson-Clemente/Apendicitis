
package Modelo;


public class ArbolBinario {
    
    private Nodo raiz;
        
    
    public ArbolBinario(Nodo raiz){
    
    this.raiz = raiz;     
    
    }
    
    public static Nodo nuevoArbol(Nodo left,Object dato, Nodo right){
        
    return new Nodo(left,dato,right);
    }
    
    

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    
    
    
    
    
    
    
    
}
