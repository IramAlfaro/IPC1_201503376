/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapractica;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


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
    
    public void InsertarFinal(int maletas, int documentos, int numPasajero, int turnosS){
        NodoPasajeros nuevo = new NodoPasajeros(maletas, documentos,numPasajero, turnosS);
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
            texto += "Turnos en Espera "+actual.turnosS + "\n";
            texto += "\n";
            
        }
        return texto;
    }
    public void IngresarPasajeros(int canPasajeros, CircularDoble cd){
        for(int i = 0; i < canPasajeros;i++){
            Random r= new Random();
            int maletas = r.nextInt(4)+1;
            int documentos = r.nextInt(10)+1;
            int turno  = r.nextInt(3)+1;
            for(int j =0;j<maletas;j++){
                cd.insertar(numMal);
                numMal ++;
            }
            InsertarFinal(maletas, documentos,numPa,turno);
            
            
            numPa++;
        }
    }
    public void Sacar(OperacionCola oc){
        NodoPasajeros actual;
        actual=primero;
        for(int i =0;i<5;i++){
            if(actual !=null){
                oc.insertarCola(actual.numPasajero,actual.maletas , actual.turnosS,actual.documentos );
                //cd.Eliminar(actual.maletas);
                actual=actual.siguiente;
                Eliminar();
            }
        }
    }
    public void Crear(){
        try {
            String ruta = "Pasajeros.dot";
            File archivo = new File(ruta);
            PrintWriter pw =null;
            
            if(archivo.exists()){
                
                pw  =new PrintWriter(new FileWriter(ruta));
                pw.println(recorrido());
            }else{
                pw  =new PrintWriter(new FileWriter(ruta));
                pw.println(recorrido());
            }
            pw.close();
            Runtime rt = Runtime.getRuntime();
            Process pr = rt.exec("C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe -Tpng C:\\Users\\irams\\Desktop\\TareaPractica\\Pasajeros.dot -o C:\\Users\\irams\\Desktop\\TareaPractica\\Pasajeros.png");
        } catch (IOException ex) {
            Logger.getLogger(InsertarDE.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    String recorrido(){
        String texto="";
        texto += "digraph g { \n";
        NodoPasajeros actual;
        for(actual=primero;actual!=null;actual=actual.siguiente){
            if(actual.siguiente!=null){
            String textoA = "PasajeroNum_"+actual.numPasajero+"_Maletas_"+actual.maletas+"_Documentos_"+actual.documentos+"_Turnos_"+actual.turnosS+"\n";
            String textoAS = "PasajeroNum_"+actual.siguiente.numPasajero+"_Maletas_"+actual.siguiente.maletas+"_Documentos_"+actual.siguiente.documentos+"_Turnos_"+actual.siguiente.turnosS+"\n";
            texto += textoA +"->"+textoAS;
            }
            if(primero == ultimo){
            String textoA = "PasajeroNum_"+actual.numPasajero+"_Maletas_"+actual.maletas+"_Documentos_"+actual.documentos+"_Turnos_"+actual.turnosS+"\n";
                texto += textoA;
            }
        }   
        texto += "}";
        return texto;
        
    }
    
}
