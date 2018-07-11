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
public class NodoEscritorio {
    char mesa;
    int pasajero;
    int maletas;
    int turnosR;
    int documentos;
    boolean ocupado;
    
    NodoEscritorio siguiente;
    NodoEscritorio anterior;
    NodoColaEs acola;
    NodoDocumentos aPila;

    public NodoEscritorio(int pasajero, int maletas, int turnosR, int documentos, char mesa,boolean ocupado) {
        this.pasajero = pasajero;
        this.mesa = mesa;
        this.maletas = maletas;
        this.turnosR = turnosR;
        this.documentos = documentos;
        this.siguiente = null;
        this.anterior = null;
        
    }
}
