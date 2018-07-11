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
    public void crear(){
        try {
            String ruta = "Hangares.dot";
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
            Process pr = rt.exec("C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe -Tpng C:\\Users\\irams\\Desktop\\TareaPractica\\Hangares.dot -o C:\\Users\\irams\\Desktop\\TareaPractica\\Hangares.png");
        } catch (IOException ex) {
            Logger.getLogger(InsertarDE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    String recorrido(){
        String texto  ="";
        texto = "digraph g{ \n";
        NodoSimple actual;
        for(actual = primero;actual!=null;actual =actual.siguiente){
            if(actual .siguiente !=null){
                String textoA = "Avion_"+actual.avion+"_Ocupado_"+actual.ocupado+"_Turnos_"+actual.turnosR+"_Hangar_"+actual.hangar+"\n";
                String textoAS = "Avion_"+actual.siguiente.avion+"_Ocupado_"+actual.siguiente.ocupado+"_Turnos_"+actual.siguiente.turnosR+"_Hangar_"+actual.siguiente.hangar+"\n";
                texto += textoA + "->" + textoAS;
            }
            if(primero == ultimo){
                 String textoA = "Avion_"+actual.avion+"_Ocupado_"+actual.ocupado+"_Turnos_"+actual.turnosR+"_Hangar_"+actual.hangar+"\n";
                 texto += textoA;
            }
        }
        texto += "}";
        return texto;
    }
    
}
