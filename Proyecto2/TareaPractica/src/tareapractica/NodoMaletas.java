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
public class NodoMaletas {
    public int numMaleta;
    public NodoMaletas siguiente;
    public NodoMaletas anterior;

    public NodoMaletas(int numMaleta) {
        this.numMaleta = numMaleta;
        siguiente = null;
        anterior = null;
    }
}