
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
public class ColaAviones {
    NodoCA primero;
    NodoCA ultimo;

    public ColaAviones() {
        primero =ultimo = null;
        
    }
    
    public void insertar(int avion , int mantenimiento){
        NodoCA nuevo = new NodoCA(avion, mantenimiento);
        if(primero == null){
            primero = nuevo;
            primero.siguiente = null;
            ultimo = primero;
        }else{
            ultimo.siguiente=nuevo;
            nuevo.siguiente = null;
            ultimo = nuevo;
        }
    }
    public void EliminarP(){
        if(primero == ultimo){
            primero = ultimo = null;
        }else{
            primero = primero.siguiente;
        }
    }
    public void MoverAMantenimiento(InsertarS is){
        
        NodoSimple hangar;
        for(hangar  = is.primero; hangar !=null;hangar= hangar.siguiente){
            if(primero!=null){
                if(hangar.ocupado==false){
                    hangar.avion =primero.avion;
                    hangar.turnosR = primero.Mantenimiento;
                    hangar.ocupado = true;
                    EliminarP();
                }
            }
        }
    }
    
}
