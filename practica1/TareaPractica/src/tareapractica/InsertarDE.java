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
public class InsertarDE {
    NodoDoble primero;
    NodoDoble ultimo;

    public InsertarDE() {
        primero = ultimo = null;
    }
    
    void insercion(String tipo, int pasajeros, int desabordaje, int mantenimiento,int numeroAvion){
        NodoDoble nuevo = new NodoDoble(tipo, pasajeros, desabordaje,mantenimiento,numeroAvion);
        if(primero == null){
            primero = nuevo;
            primero.siguiente=null;
            ultimo = primero;
        }else{
            ultimo.siguiente = nuevo;
            nuevo.anterior  = ultimo;
            ultimo = nuevo;
        }
    }
    String recorer(ColaPasajeros cp, CircularDoble cd){
        NodoDoble actual;
        String texto= "";
        
        for(actual =primero;actual !=null;actual = actual.siguiente){
            texto +="---------- Avion "+ actual.numeroAvion + " ---------- \n";
            texto +="Tipo : " + actual.tipo + "\n"; 
            texto +="Pasajeros : " + actual.pasajeros + "\n"; 
            texto +="Desabordaje : " + actual.desabordaje + "\n"; 
            texto +="Mantenimiento : " + actual.mantenimiento + "\n"; 
            texto +="\n";
            cp.IngresarPasajeros(actual.pasajeros,cd);
            
        }
        return texto;
    }
    void Disminuir(){
        NodoDoble actual;
        for(actual = primero; actual != null;actual = actual.siguiente){
            actual.desabordaje= actual.desabordaje -1;
        }
    }
    public void Eliminar(ColaAviones ca){
        NodoDoble actual;
        NodoDoble atras;
        actual = primero;
        atras =null;
        while(actual != null){
            if(actual.desabordaje==0){
                if(actual == primero){
                    if(primero == ultimo){
                        ca.insertar(actual.numeroAvion, actual.mantenimiento);
                        primero = ultimo=null;
                    }else{
                    ca.insertar(actual.numeroAvion, actual.mantenimiento);
                    primero = primero.siguiente;
                    primero.anterior = null;}
                }else if(actual == ultimo){
                    ca.insertar(actual.numeroAvion, actual.mantenimiento);
                    ultimo = ultimo.anterior;
                    ultimo.siguiente=null;
                }else{
                    ca.insertar(actual.numeroAvion, actual.mantenimiento);
                    atras.siguiente = actual.siguiente;
                    actual.siguiente.anterior= actual.anterior;
                }
            }
            atras = actual;
            actual = actual.siguiente;
        }
        
    }
    
}
