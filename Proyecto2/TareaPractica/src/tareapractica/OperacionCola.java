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
public class OperacionCola {
    NodoEscritorio PrimeroEs;
    public OperacionCola(NodoEscritorio primero) {
        PrimeroEs  = primero;
    }
    void insertarCola(int pasajero, int maletas, int turnosR, int documentos){
        NodoEscritorio actual = PrimeroEs;
        Boolean inserto = false;
        do{
        if(actual.acola==null){
            NodoColaEs nuevo = new NodoColaEs(pasajero, maletas, turnosR, documentos, 1);
            actual.acola = nuevo;
            actual.acola.siguiente=null;
            inserto=true;
        }else{
            NodoColaEs actualCola = actual.acola;
            while(actualCola.siguiente!=null){
                actualCola = actualCola.siguiente;
            }
            if(actualCola.posicion<7){
                NodoColaEs nuevo = new NodoColaEs(pasajero, maletas, turnosR, documentos, actualCola.posicion+1);
                actualCola.siguiente=nuevo;
                nuevo.siguiente = null;
                inserto=true;
            }else{
                if(actual.siguiente!=null){
                    actual=actual.siguiente;
                }else{
                    break;
                }
            }
        }
        }while(inserto==false);
    }   
    void TrasladarEliminar(){
        NodoEscritorio actual;
        for(actual = PrimeroEs;actual!=null;actual = actual.siguiente){
            if(actual.acola !=null){
            if(actual.ocupado ==false){
                actual.documentos=actual.acola.documentos;
                actual.maletas = actual.acola.maletas;
                actual.pasajero  =actual.acola.pasajero;
                actual.turnosR = actual.acola.turnosR;
                actual.ocupado =true;
                
                actual.acola = actual.acola.siguiente;
                
            }
            }
        }
        
    }
    public String recorrer(){
        String texto ="";
        NodoEscritorio actual = PrimeroEs;
        NodoColaEs actualCE;
        NodoDocumentos actualD;
        do{
            actualCE = actual.acola;
            actualD = actual.aPila;
            texto += "$$$$$ Escritorio "+ actual.mesa+" $$$$$\n";
            texto += " Ocupado "+actual.ocupado+"\n";
            texto += " Pasajeros "+actual.pasajero+"\n";
            texto += " Documentos "+actual.documentos+"\n";
            texto += " Maletas "+actual.maletas+"\n";
            texto += " Turnos de espera "+actual.turnosR+"\n";
            texto += "---- Cola del Escritorio ----\n";
            while(actualCE != null){
                
                texto += "  Pasajeros "+actualCE.pasajero+"\n";
                texto += "  Documentos "+actualCE.documentos+"\n";
                texto += "  Maletas "+actualCE.maletas+"\n";
                texto += "  Turnos de espera "+actualCE.turnosR+"\n";
                texto += "\n";
                actualCE = actualCE.siguiente;
            }
            texto += "---- Pila de Documentos ----\n";
            while(actualD != null){
                texto += "  Numero de Documento "+actualD.numDocuento+"\n";
                texto += "\n";
            }
            actual = actual.siguiente;
        }while(actual != null);
        return texto;
    }
}
