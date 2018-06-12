/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyeto1;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.net.URL;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author irams
 */
public class TableroVentana extends JFrame {
    
    int vecL[][];
    JLabel[][] lTablero;
    JLabel tiempo;
    JLabel cronometro;
    JLabel ju1;
    JLabel ju2;
    
    JLabel personajes1;
    JLabel personajes2;
    
    JLabel j1p1;
    JLabel j1p2;
    JLabel j1p3;
    JLabel j2p1;
    JLabel j2p2;
    JLabel j2p3;
    
    
    JPanel panel;
    int tamT;
    NombresJugadores nj;
    
    
    
    
    public TableroVentana( NombresJugadores nj){
        tamT = nj.getTamTablero();
        
        
        this.nj = nj;
        add(getjpanel());
        
        //add(panel);
        add(lTiempo());
        add(lCronometro());
        add(lJugador1());
        add(lJugador2());
        add(lPersonajes());
        add(lPersonajes2());
        add(primerPerJ1());
        add(segundoPerJ1());
        add(terceroPerJ1());
        add(primerPerJ2());
        add(segundoPerJ2());
        add(terceroPerJ2());
        
        Inicializar();
          
    }
    public TableroVentana(){
        
    }
    public JLabel lTiempo(){
        tiempo = new JLabel("Tiempo : ");
        tiempo.setBounds(760, 30, 120, 70);
        tiempo.setFont(new Font("Arial",Font.BOLD, 20));
        
        
        return tiempo;
    }
    public JLabel lCronometro(){
        cronometro = new JLabel(nj.getTiempo());
        cronometro.setBounds(860, 30, 120, 70);
        cronometro.setFont(new Font("Arial", Font.BOLD, 20));
        
        return cronometro;
    }
    public JLabel lJugador1(){
        ju1 = new JLabel("Jugador 1 :  " + nj.getNamePlayer1());
        ju1.setBounds(760, 90, 170, 70);
        ju1.setFont(new Font("Ariela", Font.BOLD, 15));
        return ju1;
    }
    public JLabel lPersonajes(){
        personajes1 = new JLabel("Personajes : ");
        personajes1.setBounds(760, 150, 100, 40);
        
        
        return personajes1;
    }
    public JLabel lJugador2(){
        ju2 = new JLabel("Jugador 2 :  " + nj.getNamePlayer2());
        ju2.setBounds(1050, 90, 170, 70);
        ju2.setFont(new Font("Ariela", Font.BOLD, 15));
        return ju2;
    }
    public JLabel lPersonajes2(){
        personajes2 = new JLabel("Personajes :");
        personajes2.setBounds(1050, 150, 100, 40);
        
        return personajes2;
    }
    public JLabel primerPerJ1(){
        j1p1 = new JLabel(nj.idPerJug1[0]);
        j1p1.setBounds(760, 190, 100, 25);
        j1p1.setBorder(BorderFactory.createLineBorder(Color.black));
        return j1p1;
    }
    public JLabel segundoPerJ1(){
        j1p2 = new JLabel(nj.idPerJug1[1]);
        j1p2.setBounds(760, 220, 100, 25);
        j1p2.setBorder(BorderFactory.createLineBorder(Color.black));
        return j1p2;
    }
    public JLabel terceroPerJ1(){
        j1p3 = new JLabel(nj.idPerJug1[2]);
        j1p3.setBounds(760, 250, 100, 25);
        j1p3.setBorder(BorderFactory.createLineBorder(Color.black));
        return j1p3;
    }
    public JLabel primerPerJ2(){
        j2p1 = new JLabel(nj.idPerJug2[0]);
        j2p1.setBounds(1050, 190, 100, 25);
        j2p1.setBorder(BorderFactory.createLineBorder(Color.black));
        return j2p1;
    }
    public JLabel segundoPerJ2(){
        j2p1 = new JLabel(nj.idPerJug2[1]);
        j2p1.setBounds(1050, 220, 100, 25);
        j2p1.setBorder(BorderFactory.createLineBorder(Color.black));
        return j2p1;
    }
    public JLabel terceroPerJ2(){
        j2p1 = new JLabel(nj.idPerJug2[2]);
        j2p1.setBounds(1050, 250, 100, 25);
        j2p1.setBorder(BorderFactory.createLineBorder(Color.black));
        return j2p1;
    }
     
   
    //creacion del panel para el tablero
    
    public JPanel getjpanel(){
        tamT = nj.getTamTablero();
        vecL = new int[tamT][tamT];
        
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
                vecL[i][j] = 0;
                panel.add(lTablero[i][j]);
            }
        }
        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        PosIniciales();
        return panel;
    }

    public void PosIniciales(){
      
        //primero llenar de bombas
        int cantBombas = (int) ((int)(tamT * tamT) * 0.1);
        int cantVidas = (int)((int)(tamT*tamT)*0.05);
        for(int i =0; i <cantBombas;i++){
            boolean validarB = true;
            do{
            Random ran1  =new Random();
            int iRan1 = ran1.nextInt(tamT);
            Random ran2  =new Random();
            int iRan2 = ran2.nextInt(tamT);
            if(vecL[iRan1][iRan2]==0){
                vecL[iRan1][iRan2]=7;
                ImageIcon per= new ImageIcon(getClass().getResource("/Imagenes/bomba.jpg"));
                Image per1 = per.getImage();
                Image imgtam = per1.getScaledInstance(600/tamT, 600/tamT, Image.SCALE_SMOOTH);
                per=new ImageIcon(imgtam);
                lTablero[iRan1][iRan2].setIcon(per);
                validarB = false;
            }
            
            }while(validarB);
        }
        for(int i =0; i <cantVidas;i++){
            boolean validarV = true;
            do{
            Random ran1  =new Random();
            int iRan1 = ran1.nextInt(tamT);
            Random ran2  =new Random();
            int iRan2 = ran2.nextInt(tamT);
            if(vecL[iRan1][iRan2]==0){
                vecL[iRan1][iRan2]=8;
                ImageIcon per= new ImageIcon(getClass().getResource("/Imagenes/corazon.jpg"));
                Image per1 = per.getImage();
                Image imgtam = per1.getScaledInstance(600/tamT, 600/tamT, Image.SCALE_SMOOTH);
                per=new ImageIcon(imgtam);
                lTablero[iRan1][iRan2].setIcon(per);
                validarV = false;
            }
            
            }while(validarV);
        }
        
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
