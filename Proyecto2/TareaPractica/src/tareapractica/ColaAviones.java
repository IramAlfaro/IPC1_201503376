
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
    public void crear(){
        try {
            String ruta = "ColaHang.dot";
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
            Process pr = rt.exec("C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe -Tpng C:\\Users\\irams\\Desktop\\TareaPractica\\ColaHang.dot -o C:\\Users\\irams\\Desktop\\TareaPractica\\ColaHang.png");
        } catch (IOException ex) {
            Logger.getLogger(InsertarDE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    String recorrido(){
        String texto ="";
        texto += "digraph g{ \n";
        NodoCA actual;
        
        for(actual = primero;actual!=null;actual= actual.siguiente){
            if(actual.siguiente !=null){
                String textoA = "Avion_"+actual.avion+"_Mantenimiento_"+actual.Mantenimiento+"\n";
                String textoAS = "Avion_"+actual.siguiente.avion+"_Mantenimiento_"+actual.siguiente.Mantenimiento+"\n";
                texto += textoA + "->" + textoAS;
            }
            if(primero == ultimo){
                String textoA = "Avion_"+actual.avion+"_Mantenimiento_"+actual.Mantenimiento+"\n";
                texto += textoA;
            }
        }
        texto+="}";
        return texto;
    }
    
}
