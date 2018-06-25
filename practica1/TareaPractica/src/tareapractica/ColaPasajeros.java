/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapractica;

import java.util.Random;


/**
 *
 * @author irams
 */
public class ColaPasajeros {
    NodoPasajeros primero;
    NodoPasajeros ultimo;
    int numPa=1;
    int numMal=1;

    public ColaPasajeros() {
        primero = ultimo = null;
    }
    
    public void InsertarFinal(int maletas, int documentos, int numPasajero){
        NodoPasajeros nuevo = new NodoPasajeros(maletas, documentos,numPasajero);
        if(primero ==null){
            primero = nuevo;
            primero.siguiente= null;
            ultimo = primero;
        }else{
            ultimo.siguiente = nuevo;
            nuevo.siguiente = null;
            ultimo=nuevo;
        }
    }
    public void Eliminar(){
        if(primero == ultimo){
            primero = ultimo = null;
        }else{
            primero = primero.siguiente;
        }
    }
    public String Recorer(){
        String texto ="";
        NodoPasajeros actual;
        for(actual = primero;actual != null; actual = actual.siguiente){
            texto += "\n";
            texto += "Pasajero # "+actual.numPasajero+"\n";
            texto += "Documentos "+ actual.documentos+"\n";
            texto += "Maletas " +actual.maletas+"\n";
            texto += "\n";
            
        }
        return texto;
    }
    public void IngresarPasajeros(int canPasajeros, CircularDoble cd){
        for(int i = 0; i < canPasajeros;i++){
            Random r= new Random();
            int maletas = r.nextInt(4)+1;
            int documentos = r.nextInt(10)+1;
            for(int j =0;j<maletas;j++){
                cd.insertar(numMal);
                numMal ++;
            }
            InsertarFinal(maletas, documentos,numPa);
            
            
            numPa++;
        }
    }
    public void Sacar(CircularDoble cd){
        NodoPasajeros actual;
        actual=primero;
        for(int i =0;i<5;i++){
            
            cd.Eliminar(actual.maletas);
            actual=actual.siguiente;
            Eliminar();
        }
    }
    
    
}
