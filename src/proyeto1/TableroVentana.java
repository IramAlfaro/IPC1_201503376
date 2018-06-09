/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyeto1;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author irams
 */
public class TableroVentana extends JFrame {
    
    JLabel[][] lTablero;
    JLabel tiempo;
    JLabel cronometro;
    JLabel ju1;
    JLabel ju2;
    
    JPanel panel;
    int tamT;
    String nombreJ1;
    String nombreJ2;
    
    
    
    public TableroVentana(int tamanio, String nombre1, String nombre2){
        tamT=tamanio;
        nombreJ1 = nombre1;
        nombreJ2 = nombre2;
        
        
        
    }
    public TableroVentana(){
        add(getjpanel());
        add(lTiempo());
        add(lCronometro());
        add(lJugador1());
        add(lJugador2());
        
        
        Inicializar();
    }
    public JLabel lTiempo(){
        tiempo = new JLabel("Tiempo : ");
        tiempo.setBounds(760, 30, 120, 70);
        tiempo.setFont(new Font("Arial",Font.BOLD, 20));
        
        
        return tiempo;
    }
    public JLabel lCronometro(){
        cronometro = new JLabel("00:00");
        cronometro.setBounds(860, 30, 120, 70);
        cronometro.setFont(new Font("Arial", Font.BOLD, 20));
        
        return cronometro;
    }
    public JLabel lJugador1(){
        ju1 = new JLabel("Jugador 1 :  " + nombreJ1);
        ju1.setBounds(760, 90, 170, 70);
        ju1.setFont(new Font("Ariela", Font.BOLD, 15));
        return ju1;
    }
    public JLabel lJugador2(){
        ju2 = new JLabel("Jugador 2 :  " + nombreJ2);
        ju2.setBounds(1050, 90, 170, 70);
        ju2.setFont(new Font("Ariela", Font.BOLD, 15));
        return ju2;
    }
    
     
   
    //creacion del panel para el tablero
    public JPanel getjpanel(){
        
        JPanel panel = new JPanel();
        //int tamT = tamMatriz();
        lTablero = new JLabel[tamT][tamT];
        panel.setLayout(new GridLayout(tamT,tamT));
        
        //debo decidir que es lo que va a ir dentro de los Labels
        
        panel.setBounds(80, 80, 600, 600);
        //creacion del tablero dentro del panel
        for(int i = 0;i<tamT;i++){
            for(int j = 0;j<tamT;j++){
                lTablero[i][j]=new JLabel();
                lTablero[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
                
                panel.add(lTablero[i][j]);
            }
        }
        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        return panel;
    }
    //valores Iniciales del Frame Principal
    public void Inicializar(){
        
        setLayout(null);
        setSize(1400, 800);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }
    
    
}
