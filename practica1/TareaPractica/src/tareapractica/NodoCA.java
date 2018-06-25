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
public class NodoCA {
    public int avion;
    public int Mantenimiento;
    
    NodoCA siguiente;

    public NodoCA(int avion, int Mantenimiento) {
        this.avion = avion;
        this.Mantenimiento = Mantenimiento;
        siguiente =null;
    }
    
    
}
