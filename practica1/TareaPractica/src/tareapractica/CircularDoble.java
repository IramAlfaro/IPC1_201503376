/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapractica;

/**
 *
 * @author irams
 */
public class CircularDoble {
    NodoMaletas primero;
    NodoMaletas ultimo;

    public CircularDoble() {
        primero = ultimo = null;
    }
    public void insertar(int numMaleta){
        NodoMaletas nuevo = new NodoMaletas(numMaleta);
        if(primero == null){
            primero = nuevo;
            primero.siguiente = primero;
            primero.anterior = primero;
            ultimo=primero;
        }else{
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            nuevo.anterior = ultimo;
            ultimo=nuevo;
        }
    }
    public String recorer(){
        String texto = "";
            NodoMaletas actual=primero;
            do{
                texto += "\n";
                texto += "Maleta Numero "+ actual.numMaleta;
                texto += "\n";
                texto += "\n";
                actual = actual.siguiente;
            }while(actual!=primero);
        return texto;
    }
    public void Eliminar(int eliminar){
        NodoMaletas actual = primero;
        for(int e  = 0; e<eliminar;e++){
            if(primero == ultimo){
                primero = ultimo = null;
            }else{
            primero  =primero.siguiente;
            primero.anterior = ultimo;
            ultimo.siguiente=primero;
            actual = null;
            actual=primero;
            }
        }
    }
    
}
