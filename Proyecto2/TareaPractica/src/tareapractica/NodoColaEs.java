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
public class NodoColaEs {
    int pasajero;
    int maletas;
    int turnosR;
    int documentos;
    int posicion;
    
    NodoColaEs siguiente;

    public NodoColaEs(int pasajero, int maletas, int turnosR, int documentos, int posicion) {
        this.pasajero = pasajero;
        this.maletas = maletas;
        this.turnosR = turnosR;
        this.documentos = documentos;
        this.posicion =posicion;
        this.siguiente=null;
    }
    
}
