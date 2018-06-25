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
public class InsertarS {
    NodoSimple primero;
    NodoSimple ultimo;

    public InsertarS() {
        primero = ultimo = null;
    }
    
    void insercion(int avion, int turnosR , boolean ocupado, int hangar){
        NodoSimple nuevo = new NodoSimple(avion, turnosR, ocupado,hangar);
        if(primero ==null){
            primero = nuevo;
            primero.siguiente=null;
            ultimo=primero;
        }else{
            ultimo.siguiente=nuevo;
            nuevo.siguiente=null;
            ultimo=nuevo;
        }
    }
    String recorrer(){
        NodoSimple actual ;
        String texto ="";
        for(actual = primero; actual != null; actual = actual.siguiente){
            texto += "######## Hangar " + actual.hangar+" ########\n";
            texto += "Numero de Avion : "+String.valueOf(actual.avion)+ "\n";
            texto += "Hangar Ocupado : "+String.valueOf(actual.ocupado)+ "\n";
            texto += "Mantenimiento : "+String.valueOf(actual.turnosR)+ "\n";
            texto += "\n";
        }
        return texto;
    }
    
    public void recorrerV(){
        NodoSimple actual;
        for(actual = primero; actual != null;actual = actual.siguiente){
            if(actual.ocupado == false){
                
                
            }
        }
    }
    public void Eliminar(){
        NodoSimple actual;
        actual=primero;
        for(actual = primero;actual !=null;actual = actual.siguiente){
            if(actual.turnosR==0){
                actual.avion=0;
                actual.ocupado=false;
                
            }
        }
    }
    public void Disminuir(){
        NodoSimple actual;
        actual=primero;
        for(actual = primero;actual !=null;actual = actual.siguiente){
            if(actual.turnosR >0){
                actual.turnosR = actual.turnosR -1;
            }
            if(actual.turnosR <= 0){
                Eliminar();
            }
            
        }
    }
    
}
