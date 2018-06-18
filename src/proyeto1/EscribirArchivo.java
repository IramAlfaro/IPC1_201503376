/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyeto1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
public class EscribirArchivo {
    
    public void crear(NombresJugadores nj, double tiempo,String personajes1,String personajes2,String ganador){
        //ruta del archivo
        String ruta = "Lista.txt";
        File archivo = new File(ruta);
        PrintWriter pw = null;
        try {
            if(archivo.exists()){
                JOptionPane.showMessageDialog(null, "El archivo ya existe");
                pw  =new PrintWriter(new FileWriter(ruta,true));
                pw.println(nj.getNamePlayer1() + ","+nj.getNamePlayer2()+","+tiempo + ","+personajes1+","+personajes2+","+nj.getVidasJugador1()+","+nj.getVidasJugador2()+","+ganador);
            
            }else{
                pw  =new PrintWriter(new FileWriter(ruta));
                }
            pw.close();
        } catch (Exception e) {
             Logger.getLogger(EscribirArchivo.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    
}
