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
    
    NodoPasajeros siguiente;

    public NodoPasajeros(int maletas, int documentos, int numPasajeros) {
        this.maletas = maletas;
        this.numPasajero = numPasajeros;
        this.documentos = documentos;
        siguiente=null;
    }
    
}
