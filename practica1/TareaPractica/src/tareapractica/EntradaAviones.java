/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapractica;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author irams
 */
public class EntradaAviones {
    
    public String GenerarAviones(int cantAviones, int turno,InsertarDE ide, ColaPasajeros cp,CircularDoble cd){
        String texto="";
        if(cantAviones > 0){
            texto = "+++++++++++++++++ Turno #"+turno+" +++++++++++++++++\n";
            Random ran = new Random();
            int iran = ran.nextInt(3);
            if(iran == 0){
                Random r  =new Random();
                int rPasajeros = r.nextInt(6)+5;
                int rMantenimiento = r.nextInt(3)+1;
                ide.insercion("Pequeño", rPasajeros, 1, rMantenimiento,turno);
                texto += ide.recorer(cp, cd);
            }else if(iran == 1){
                Random r  =new Random();
                int rPasajeros = r.nextInt(11)+15;
                int rMantenimiento = r.nextInt(3)+2;
                ide.insercion("Mediano", rPasajeros, 2, rMantenimiento,turno);
                texto += ide.recorer(cp,cd);
            }else if(iran == 2){
                Random r  =new Random();
                int rPasajeros = r.nextInt(11)+30;
                int rMantenimiento = r.nextInt(4)+3;
                ide.insercion("Grande", rPasajeros, 3, rMantenimiento,turno);
                texto += ide.recorer(cp, cd);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ya no Entraran mas aviones");
            texto="";
        }
    return texto;
    }
    
}
