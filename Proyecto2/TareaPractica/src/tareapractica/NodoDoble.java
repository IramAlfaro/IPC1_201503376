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
public class NodoDoble {
    String tipo;
    int pasajeros;
    int desabordaje;
    int mantenimiento;
    int numeroAvion;
    
    NodoDoble siguiente;
    NodoDoble anterior;
    
    

    public NodoDoble(String tipo, int pasajeros, int desabordaje, int mantenimiento,int numeroAvion) {
        this.tipo = tipo;
        this.pasajeros = pasajeros;
        this.desabordaje = desabordaje;
        this.mantenimiento = mantenimiento;
        this.numeroAvion = numeroAvion;
        this.siguiente = null;
        this.anterior = null;
        
    }
    
}
