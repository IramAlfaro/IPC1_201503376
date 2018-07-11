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
public class NodoDocumentos {
    int numDocuento;
    NodoDocumentos sigiente;

    public NodoDocumentos(int numDocuento) {
        this.numDocuento = numDocuento;
        this.sigiente = null;
    }
    
}
