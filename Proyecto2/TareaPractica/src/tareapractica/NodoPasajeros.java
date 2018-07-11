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
public class NodoPasajeros {
    public int numPasajero;
    public int maletas;
    public int documentos;
    public int turnosS;
    
    NodoPasajeros siguiente;

    public NodoPasajeros(int maletas, int documentos, int numPasajeros, int turnosS) {
        this.maletas = maletas;
        this.turnosS = turnosS;
        this.numPasajero = numPasajeros;
        this.documentos = documentos;
        siguiente=null;
    }
    
}
