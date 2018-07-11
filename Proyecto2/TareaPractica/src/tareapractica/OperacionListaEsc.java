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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author irams
 */
public class OperacionListaEsc {
    int numeroDoc=0;
    NodoEscritorio primero;
    NodoEscritorio ultimo;

    public OperacionListaEsc() {
        primero = ultimo = null;
    }
    public boolean EstaVacio(){
        return primero==null;
    }
    void insertar(int pasajero, int maletas, int turnosR, int documentos, char mesa,boolean ocupado){
        NodoEscritorio nuevo = new NodoEscritorio(pasajero, maletas, turnosR, documentos, mesa, ocupado);
        if(EstaVacio()){
            primero  =nuevo;
            primero.siguiente = null;
            ultimo=primero;
        }else{
            ultimo.siguiente=nuevo;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
        }
    }
    public void Disminuir(){
        NodoEscritorio actual;
        for(actual = primero;actual !=null;actual=actual.siguiente){
            if(actual.ocupado){
                actual.turnosR = actual.turnosR-1;
            }
        }
    }
    public void EliminarPasajero(OperacionPila op, CircularDoble cd){
        NodoEscritorio actual;
        for(actual = primero;actual !=null;actual=actual.siguiente){
            if(actual.turnosR<=0){
                for(int i=1;i<actual.documentos;i++){
                        numeroDoc++;
                        op.insertarPila(numeroDoc);
                
                }
                
                cd.Eliminar(actual.maletas);
                actual.turnosR = 0;
                actual.ocupado = false;
                actual.maletas = 0;
                actual.pasajero = 0;
                actual.documentos = 0;
                
            }
        }
    }
    public void crearArch(){
        try {
            String ruta = "Escritorios.dot";
            File archivo = new File(ruta);
            PrintWriter pw =null;
            
            if(archivo.exists()){
                
                pw  =new PrintWriter(new FileWriter(ruta));
                pw.println(recorrido1());
            }else{
                pw  =new PrintWriter(new FileWriter(ruta));
                pw.println(recorrido1());
            }
            pw.close();
            Runtime rt = Runtime.getRuntime();
            Process pr = rt.exec("C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe -Tpng C:\\Users\\irams\\Desktop\\TareaPractica\\Escritorios.dot -o C:\\Users\\irams\\Desktop\\TareaPractica\\Escritorios.png");
        } catch (IOException ex) {
            Logger.getLogger(OperacionListaEsc.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    String recorrido1(){
        String texto="";
        texto += "digraph g{ \n";
        NodoEscritorio actualList=primero;
        NodoColaEs actualcola=actualList.acola;
        NodoDocumentos actualPila = actualList.aPila;
        while(actualList!=null){
            texto+="Mesa"+actualList.mesa+"_ocupado"+actualList.ocupado+"_PasajeroNum"+actualList.pasajero+"_Maletas"+actualList.maletas+"_Documentos"+actualList.documentos+"_Turnos"+actualList.turnosR+"->";
            //System.out.println(texto);
            if(actualList.siguiente!=null){
                texto+="Mesa"+actualList.siguiente.mesa+"_ocupado"+actualList.siguiente.ocupado+"_PasajeroNum"+actualList.siguiente.pasajero+"_Maletas"+actualList.siguiente.maletas+"_Documentos"+actualList.siguiente.documentos+"_Turnos"+actualList.siguiente.turnosR+";";
                texto+="\n";
                texto+="Mesa"+actualList.siguiente.mesa+"_ocupado"+actualList.siguiente.ocupado+"_PasajeroNum"+actualList.siguiente.pasajero+"_Maletas"+actualList.siguiente.maletas+"_Documentos"+actualList.siguiente.documentos+"_Turnos"+actualList.siguiente.turnosR+"->"+"Mesa"+actualList.mesa+"_ocupado"+actualList.ocupado+"_PasajeroNum"+actualList.pasajero+"_Maletas"+actualList.maletas+"_Documentos"+actualList.documentos+"_Turnos"+actualList.turnosR+";";
                texto+="\n";
            }else{
                texto+="NULL;";
                texto+="\n";
            }
            actualList=actualList.siguiente;
        }   
        actualList=primero;
        while(actualList!=null){
            if(actualList.acola !=null){
            texto+="Mesa"+actualList.mesa+"_ocupado"+actualList.ocupado+"_PasajeroNum"+actualList.pasajero+"_Maletas"+actualList.maletas+"_Documentos"+actualList.documentos+"_Turnos"+actualList.turnosR+"->"+"Pasajero"+actualList.acola.pasajero+"_Maletas"+actualList.acola.maletas+"_Documentos"+actualList.acola.documentos+"_Turnos"+actualList.acola.turnosR+"; \n";
            //System.out.println(texto);
            while(actualcola!=null){
                if(actualcola.siguiente!=null){
                    texto+="Pasajero"+actualcola.pasajero+"_Maletas"+actualcola.maletas+"_Documentos"+actualcola.documentos+"_Turnos"+actualcola.turnosR+"->"+"Pasajero"+actualcola.siguiente.pasajero+"_Maletas"+actualcola.siguiente.maletas+"_Documentos"+actualcola.siguiente.documentos+"_Turnos"+actualcola.siguiente.turnosR+"; \n";
                }
                actualcola=actualcola.siguiente;
            }
            actualList=actualList.siguiente;
            if(actualList!=null){
                actualcola=actualList.acola;
            }
            }else{
                break;
            }
        }
        
        texto+=rank();
        texto +="}";
        return texto;
    }
    String rank(){
        String texto="";
        NodoEscritorio actualList=primero;
        NodoColaEs actualcola=actualList.acola;
        while(actualList!=null){
            texto+=" \n {rank=same;"+"Mesa"+actualList.mesa+"_ocupado"+actualList.ocupado+"_PasajeroNum"+actualList.pasajero+"_Maletas"+actualList.maletas+"_Documentos"+actualList.documentos+"_Turnos"+actualList.turnosR+";";
            while(actualcola!=null){
                if(actualcola!=null){
                    texto+="Pasajero"+actualcola.pasajero+"_Maletas"+actualcola.maletas+"_Documentos"+actualcola.documentos+"_Turnos"+actualcola.turnosR+";";
                }
                actualcola=actualcola.siguiente;
            }
            texto+="}; \n";
            actualList=actualList.siguiente;
            if(actualList!=null){
                actualcola=actualList.acola;
            }
        }
        return texto;
    }
    public String imprimir(){
        String texto = "";
        
        
        return texto;
    }
}
