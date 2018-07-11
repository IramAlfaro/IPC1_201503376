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
public class InsertarDE {
    NodoDoble primero;
    NodoDoble ultimo;

    public InsertarDE() {
        primero = ultimo = null;
    }
    
    void insercion(String tipo, int pasajeros, int desabordaje, int mantenimiento,int numeroAvion){
        NodoDoble nuevo = new NodoDoble(tipo, pasajeros, desabordaje,mantenimiento,numeroAvion);
        if(primero == null){
            primero = nuevo;
            primero.siguiente=null;
            ultimo = primero;
        }else{
            ultimo.siguiente = nuevo;
            nuevo.anterior  = ultimo;
            ultimo = nuevo;
        }
    }
    String recorer(ColaPasajeros cp, CircularDoble cd){
        NodoDoble actual;
        String texto= "";
        
        for(actual =primero;actual !=null;actual = actual.siguiente){
            texto +="---------- Avion "+ actual.numeroAvion + " ---------- \n";
            texto +="Tipo : " + actual.tipo + "\n"; 
            texto +="Pasajeros : " + actual.pasajeros + "\n"; 
            texto +="Desabordaje : " + actual.desabordaje + "\n"; 
            texto +="Mantenimiento : " + actual.mantenimiento + "\n"; 
            texto +="\n";
            cp.IngresarPasajeros(actual.pasajeros,cd);
            
        }
        return texto;
    }
    void Disminuir(){
        NodoDoble actual;
        for(actual = primero; actual != null;actual = actual.siguiente){
            actual.desabordaje= actual.desabordaje -1;
        }
    }
    public void Eliminar(ColaAviones ca){
        NodoDoble actual;
        NodoDoble atras;
        actual = primero;
        atras =null;
        while(actual != null){
            if(actual.desabordaje==0){
                if(actual == primero){
                    if(primero == ultimo){
                        ca.insertar(actual.numeroAvion, actual.mantenimiento);
                        primero = ultimo=null;
                    }else{
                    ca.insertar(actual.numeroAvion, actual.mantenimiento);
                    primero = primero.siguiente;
                    primero.anterior = null;}
                }else if(actual == ultimo){
                    ca.insertar(actual.numeroAvion, actual.mantenimiento);
                    ultimo = ultimo.anterior;
                    ultimo.siguiente=null;
                }else{
                    ca.insertar(actual.numeroAvion, actual.mantenimiento);
                    atras.siguiente = actual.siguiente;
                    actual.siguiente.anterior= actual.anterior;
                }
            }
            atras = actual;
            actual = actual.siguiente;
        }
        
    }
    public void Crear(){
        try {
            String ruta = "Aviones.dot";
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
            Process pr = rt.exec("C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe -Tpng C:\\Users\\irams\\Desktop\\TareaPractica\\Aviones.dot -o C:\\Users\\irams\\Desktop\\TareaPractica\\Aviones.png");
        } catch (IOException ex) {
            Logger.getLogger(InsertarDE.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    String recorrido(){
        String texto = "";
        texto += "digraph g{ \n";
        NodoDoble actual = primero;
        
        for(actual  =primero;actual !=null;actual=actual.siguiente ){
            if(primero !=ultimo){
                if(actual != ultimo){
                    String textoA = "tipo_"+actual.tipo+"_Pasajeros_"+actual.pasajeros+"_Desabordaje_"+actual.desabordaje+"_Mantenimiento_"+actual.mantenimiento+"_Avion_"+actual.numeroAvion + "\n"; 
                    String textoAS = "tipo_"+actual.siguiente.tipo+"_Pasajeros_"+actual.siguiente.pasajeros+"_Desabordaje_"+actual.siguiente.desabordaje+"_Mantenimiento_"+actual.siguiente.mantenimiento+"_Avion_"+actual.siguiente.numeroAvion+ "\n"; 
                    texto += textoA + "->" + textoAS;
                    texto += textoAS + "->" + textoA;
                }
            }else{
                texto += "tipo_"+actual.tipo+"_Pasajeros_"+actual.pasajeros+"_Desabordaje_"+actual.desabordaje+"_Mantenimiento_"+actual.mantenimiento+"_Avion_"+actual.numeroAvion+ "\n"; 

            }
                
        }
        texto += "}";
        return texto;
    }
    
}
