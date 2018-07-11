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
public class OperacionPila {
    NodoEscritorio primeroE;
    

    public OperacionPila(NodoEscritorio primero) {
        primeroE = primero;        
    }
    
    void insertarPila(int numDocumento){
        NodoEscritorio actual = primeroE;
        Boolean inserto  =false;
        do{
            if(actual.aPila==null){
                NodoDocumentos nuevo = new NodoDocumentos(numDocumento);
                actual.aPila = nuevo;
                actual.aPila.sigiente = null;
                
                inserto = true;
            }else{
                NodoDocumentos actualPila = actual.aPila;
                while(actualPila.sigiente!=null){
                    actualPila  =actualPila.sigiente;
                }
                for(int i=0;i<actual.documentos;i++){
                    NodoDocumentos nuevo  =new NodoDocumentos(numDocumento);
                    actual.aPila.sigiente = actual.aPila;
                    actual.aPila = nuevo;
                    
                    inserto = true;
                }
                if(actual.siguiente !=null){
                    actual = actual.siguiente;
                }else{
                    break;
                }
            }
        }while(inserto==false);
    }
}
