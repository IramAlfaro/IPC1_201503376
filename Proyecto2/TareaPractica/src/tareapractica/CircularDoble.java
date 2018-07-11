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
import javax.swing.JOptionPane;

/**
 *
 * @author irams
 */
public class CircularDoble {
    NodoMaletas primero;
    NodoMaletas ultimo;

    public CircularDoble() {
        primero = ultimo = null;
    }
    public void insertar(int numMaleta){
        NodoMaletas nuevo = new NodoMaletas(numMaleta);
        if(primero == null){
            primero = nuevo;
            primero.siguiente = primero;
            primero.anterior = primero;
            ultimo=primero;
        }else{
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            nuevo.anterior = ultimo;
            ultimo=nuevo;
        }
    }
    public String recorer(){
        String texto = "";
            NodoMaletas actual=primero;
            
            do{
                if(actual !=null){
                    texto += "\n";
                    texto += "Maleta Numero "+ actual.numMaleta;
                    texto += "\n";
                    texto += "\n";
                    actual = actual.siguiente;
                }else{
                    actual = primero;
                    JOptionPane.showMessageDialog(null, "El sistema se enuentra vacio");
                }
            }while(actual!=primero);
        return texto;
    }
    public void Eliminar(int eliminar){
        NodoMaletas actual = primero;
        for(int e  = 0; e<eliminar;e++){
            if(primero == ultimo){
                primero = ultimo = null;
            }else{
                primero  =primero.siguiente;
                primero.anterior = ultimo;
                ultimo.siguiente=primero;
                actual = null;
                actual=primero;
            }
        }
    }
    public void crear(){
        try {
            String ruta = "Maletas.dot";
            File archivo = new File(ruta);
            PrintWriter pw =null;
            try {
                if(archivo.exists()){
                    
                    pw  =new PrintWriter(new FileWriter(ruta));
                    pw.println(recorrido());
                }else{
                    pw  =new PrintWriter(new FileWriter(ruta));
                    pw.println(recorrido());
                }
                pw.close();
            } catch (IOException ex) {
                Logger.getLogger(CircularDoble.class.getName()).log(Level.SEVERE, null, ex);
            }
            Runtime rt = Runtime.getRuntime();
            Process pr = rt.exec("C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe -Tpng C:\\Users\\irams\\Desktop\\TareaPractica\\Maletas.dot -o C:\\Users\\irams\\Desktop\\TareaPractica\\Maletas.png");
            
            
        } catch (IOException ex) {
                Logger.getLogger(CircularDoble.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
    }
    String recorrido(){
        String texto = "";
        texto  += "digraph g{ \n";
        NodoMaletas actual  =primero;
        
        
        do{
            if(actual !=null){
                texto += actual.numMaleta +"->"+actual.siguiente.numMaleta+"\n";
                texto += actual.siguiente.numMaleta + "->" + actual.numMaleta + "\n";
                actual = actual.siguiente;
            }else{
                break;
            }
        }while(actual != primero);
        texto += "}";
        return texto;
    }
    
}
