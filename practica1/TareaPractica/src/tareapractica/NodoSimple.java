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
public class NodoSimple {
    public int avion;
    public boolean ocupado =false;
    public int turnosR;
    public int hangar;
    
    NodoSimple siguiente;

    public NodoSimple(int avion, int turnosR, boolean ocupado, int hangar) {
        this.avion = avion;
        this.turnosR = turnosR;
        this.ocupado = ocupado;
        this.hangar = hangar;
        siguiente = null;
    }
    
    
}
