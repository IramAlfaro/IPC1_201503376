/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyeto1;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author irams
 */
public class CrearTablero {
    NombresJugadores nj;
    TableroVentana tv;

    public CrearTablero(NombresJugadores nj, TableroVentana tv) {
        this.nj = nj;
        this.tv = tv;
    }
    
    public JPanel Tablero(){
        tv.tamT = nj.getTamTablero();
        tv.vecL = new int[tv.tamT][tv.tamT];
        
        JPanel panel = new JPanel();
        //int tamT = tamMatriz();
        tv.lTablero = new JLabel[tv.tamT][tv.tamT];
        panel.setLayout(new GridLayout(tv.tamT,tv.tamT));
        
        //debo decidir que es lo que va a ir dentro de los Labels
        
        panel.setBounds(80, 80, 600, 600);
        //creacion del tablero dentro del panel
        for(int i = 0;i<tv.tamT;i++){
            for(int j = 0;j<tv.tamT;j++){
                tv.lTablero[i][j]=new JLabel();
                tv.lTablero[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
                tv.vecL[i][j] = 0;
                panel.add(tv.lTablero[i][j]);
            }
        }
        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        tv.PosIniciales();
        return panel;
    }
    
}
