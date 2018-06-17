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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    int turno;
    JLabel[][] lTablero;
    JLabel tiempo;
    JLabel cronometro;
    JLabel ju1;
    JLabel ju2;
    
    JLabel personajes1;
    JLabel personajes2;
    
    JLabel VidasJugador1;
    JLabel VidasJugador2;
    JLabel lVida1;
    JLabel lVida2;
    
    JLabel iVida1;
    JLabel iVida2;
    JLabel lDado;
    JLabel j1p1;
    JLabel j1p2;
    JLabel j1p3;
    JLabel j2p1;
    JLabel j2p2;
    JLabel j2p3;
    
    JButton dado;
    JButton moverDerecha;
    JButton moverIzquierda;
    JButton moverArriba;
    JButton moverAbajo;
    JButton atacarDerecha;
    JButton atacarIzquierda;
    JButton atacarArriba;
    JButton atacarAbajo;
    
    JPanel panel;
    int tamT;
    int nrd;
    NombresJugadores nj;
    Personajes p;
    
    TableroVentana tv;
    
    
    
    public TableroVentana( NombresJugadores nj){
        //md = new MovimientoDerecha(nrd,tv, nj);
        tamT = nj.getTamTablero();
        p = new Personajes();
        CrearTablero ct = new CrearTablero(nj, this);
        
        this.tv=this;
        this.nj = nj;
        add(AtacarDerecha());
        add(AtacarAbajo());
        add(AtacarArriba());
        add(AtacarIzquierda());
        add(MoverArriba());
        add(MoverAbajo());
        add(ImagenDado());
        add(MoverIzquierda());
        add(ct.Tablero());
        add(TextoVida1());
        add(TextoVida2());
        add(ImagenVidas1());
        add(ImagenVidas2());
        add(MoverDerecha());
        add(TirarDado());
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
        j1p1 = new JLabel((String)nj.strPersonajes[0]);
        j1p1.setBounds(760, 190, 100, 25);
        j1p1.setBorder(BorderFactory.createLineBorder(Color.black));
        return j1p1;
    }
    public JLabel segundoPerJ1(){
        j1p2 = new JLabel((String)nj.strPersonajes[2]);
        j1p2.setBounds(760, 220, 100, 25);
        j1p2.setBorder(BorderFactory.createLineBorder(Color.black));
        return j1p2;
    }
    public JLabel terceroPerJ1(){
        j1p3 = new JLabel((String)nj.strPersonajes[4]);
        j1p3.setBounds(760, 250, 100, 25);
        j1p3.setBorder(BorderFactory.createLineBorder(Color.black));
        return j1p3;
    }
    public JLabel primerPerJ2(){
        j2p1 = new JLabel((String)nj.strPersonajes[1]);
        j2p1.setBounds(1050, 190, 100, 25);
        j2p1.setBorder(BorderFactory.createLineBorder(Color.black));
        return j2p1;
    }
    public JLabel segundoPerJ2(){
        j2p2 = new JLabel((String)nj.strPersonajes[3]);
        j2p2.setBounds(1050, 220, 100, 25);
        j2p2.setBorder(BorderFactory.createLineBorder(Color.black));
        return j2p2;
    }
    public JLabel terceroPerJ2(){
        j2p3 = new JLabel((String)nj.strPersonajes[5]);
        j2p3.setBounds(1050, 250, 100, 25);
        j2p3.setBorder(BorderFactory.createLineBorder(Color.black));
        return j2p3;
    }
    public JLabel TextoVida1(){
        lVida1 = new JLabel("Vidas :");
        lVida1.setBounds(760, 290, 70, 30);
        return lVida1;
    }
    public JLabel ImagenVidas1(){
        iVida1 = new JLabel();
        iVida1.setBounds(765, 320, 150, 150);
        iVida1.setIcon(p.ImagenVidas5());
        return iVida1;
    }
    public JLabel TextoVida2(){
        lVida2 = new JLabel("Vidas :");
        lVida2.setBounds(1050, 290, 70, 30);
        return lVida2;
    }
    public JLabel ImagenVidas2(){
        iVida2 = new JLabel();
        iVida2.setBounds(1100, 320, 150, 150);
        iVida2.setIcon(p.ImagenVidas5());
        return iVida2;
    }
    public JLabel ImagenDado(){
        lDado = new JLabel();
        lDado.setBounds(740, 520, 70, 70);
        lDado.setIcon(p.ImagenDado1());
        return lDado;
    }
    public JButton TirarDado(){
        dado = new JButton("Tirar");
        dado.setBounds(740, 600, 70, 40);
        dado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                turno++;
                Random rd = new Random();
                nrd = rd.nextInt(6)+1;
                if(turno > 6)turno = 1;
                
                switch(nrd){
                    
                    case 1:
                        lDado.setIcon(p.ImagenDado1());
                    break;
                    case 2:
                        lDado.setIcon(p.ImagenDado2());
                    break;
                    case 3:
                        lDado.setIcon(p.ImagenDado3());
                    break;
                    case 4:
                        lDado.setIcon(p.ImagenDado4());
                    break;
                    case 5:
                        lDado.setIcon(p.ImagenDado5());
                    break;
                    case 6:
                        lDado.setIcon(p.ImagenDado6());
                    break;
                }
                if(nj.puedeAtacar[nj.perOrdenLogico[turno-1]-1]){
                    System.out.println("dado "+nrd);
                    moverDerecha.setEnabled(true);
                    moverIzquierda.setEnabled(true);
                    moverArriba.setEnabled(true);
                    moverAbajo.setEnabled(true);
                    dado.setEnabled(false);
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Este Personaje perdio su turno");
                }
                if(turno > 6)turno = 1;
            }
        });
        return dado;
    } 
    public JButton MoverDerecha(){
        moverDerecha = new JButton("Derecha");
        moverDerecha.setEnabled(false);
        moverDerecha.setBounds(940, 580, 110, 40);
        moverDerecha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //dado.setEnabled(true);
                moverDerecha.setEnabled(false);
                moverIzquierda.setEnabled(false);
                moverArriba.setEnabled(false);
                moverAbajo.setEnabled(false);
                MovimientoDerecha md = new MovimientoDerecha(nrd,tv, nj);
                md.start();
                System.out.println("turno "+turno);
                
            }
        });
        return moverDerecha;
    }
    public JButton AtacarDerecha(){
        atacarDerecha = new JButton("Derecha");
        atacarDerecha.setEnabled(false);
        atacarDerecha.setBounds(1220, 580, 100, 40);
        atacarDerecha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Ataques atq=new Ataques(tv, nj);
                atq.AtacarDerecha();
                atacarAbajo.setEnabled(false);
                atacarArriba.setEnabled(false);
                atacarIzquierda.setEnabled(false);
                atacarDerecha.setEnabled(false);
            }
        });
        return atacarDerecha;
    }
    public JButton MoverIzquierda(){
        moverIzquierda = new JButton("Izquierda");
        moverIzquierda.setEnabled(false);
        moverIzquierda.setBounds(830, 580, 100, 40);
        moverIzquierda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //dado.setEnabled(true);
                moverIzquierda.setEnabled(false);
                moverDerecha.setEnabled(false);
                moverArriba.setEnabled(false);
                moverAbajo.setEnabled(false);
                MoverIzquierda mi= new MoverIzquierda(nrd,tv,nj);
                mi.start();
            }
        });
        
        return moverIzquierda;
    }public JButton AtacarIzquierda(){
        atacarIzquierda = new JButton("Izquierda");
        atacarIzquierda.setEnabled(false);
        atacarIzquierda.setBounds(1110, 580, 100, 40);
        atacarIzquierda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Ataques atq=new Ataques(tv, nj);
                atq.AtacarIzquierda();
                atacarAbajo.setEnabled(false);
                atacarArriba.setEnabled(false);
                atacarIzquierda.setEnabled(false);
                atacarDerecha.setEnabled(false);
            }
        });
        return atacarIzquierda;
    }
    public JButton MoverArriba(){
        moverArriba = new JButton("Arriba");
        moverArriba.setEnabled(false);
        moverArriba.setBounds(880, 530, 110, 40);
        moverArriba.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //dado.setEnabled(true);
                moverIzquierda.setEnabled(false);
                moverDerecha.setEnabled(false);
                moverArriba.setEnabled(false);
                moverAbajo.setEnabled(false);
                MovimientoAr ma = new MovimientoAr(nrd, tv, nj);
                ma.start();
            }
        });
        
        return moverArriba;
    }
    public JButton AtacarArriba(){
        atacarArriba = new JButton("Arriba");
        atacarArriba.setEnabled(false);
        atacarArriba.setBounds(1160, 530, 100, 40);
        atacarArriba.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Ataques atq=new Ataques(tv, nj);
                atq.AtaqueArriba();
                atacarAbajo.setEnabled(false);
                atacarArriba.setEnabled(false);
                atacarIzquierda.setEnabled(false);
                atacarDerecha.setEnabled(false);
            }
        });
        return atacarArriba;
    }
    public JButton MoverAbajo(){
        moverAbajo = new JButton("Abajo");
        moverAbajo.setEnabled(false);
        moverAbajo.setBounds(880, 630, 110, 40);
        moverAbajo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //dado.setEnabled(true);
                moverIzquierda.setEnabled(false);
                moverDerecha.setEnabled(false);
                moverArriba.setEnabled(false);
                moverAbajo.setEnabled(false);
                
                MovimientoAb mab = new MovimientoAb(nrd, tv, nj);
                mab.start();
            }
        });
        
        return moverAbajo;
    } 
    public JButton AtacarAbajo(){
        atacarAbajo = new JButton("Abajo");
        atacarAbajo.setEnabled(false);
        atacarAbajo.setBounds(1160, 630, 100, 40);
        atacarAbajo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Ataques atq=new Ataques(tv, nj);
                atq.AtacarAbajo();
                atacarAbajo.setEnabled(false);
                atacarArriba.setEnabled(false);
                atacarIzquierda.setEnabled(false);
                atacarDerecha.setEnabled(false);
            }
        });
        return atacarAbajo;
    }
    //creacion del panel para el tablero
    
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
                
                lTablero[iRan1][iRan2].setIcon(p.ImagenBombas(tamT));
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
                lTablero[iRan1][iRan2].setIcon(p.ImagenVidas(tamT));
                validarV = false;
            }
            
            }while(validarV);
            
        }
        boolean validarP1 = true;
        do{
           Random ran1  =new Random();
            int iRan1 = ran1.nextInt(tamT);
            Random ran2  =new Random();
            int iRan2 = ran2.nextInt(tamT); 
            if(vecL[iRan1][iRan2]==0 ){
                vecL[iRan1][iRan2] = 1;
                nj.posicionesX[0]=iRan1;
                nj.posicionesY[0]=iRan2;
                lTablero[iRan1][iRan2].setIcon(p.ImagenCaballero1(tamT));
                validarP1 = false;
            }
        }while(validarP1);
        boolean validarP2 = true;
        do{
            Random ran1  =new Random();
            int iRan1 = ran1.nextInt(tamT);
            Random ran2  =new Random();
            int iRan2 = ran2.nextInt(tamT); 
            if(vecL[iRan1][iRan2]==0 ){
                vecL[iRan1][iRan2] = 2;
                nj.posicionesX[1]=iRan1;
                nj.posicionesY[1]=iRan2;
                lTablero[iRan1][iRan2].setIcon(p.ImagenMago1(tamT));
                validarP2 = false;
            }
        }while(validarP2);
        boolean validarP3= true;
        do{
            Random ran1  =new Random();
            int iRan1 = ran1.nextInt(tamT);
            Random ran2  =new Random();
            int iRan2 = ran2.nextInt(tamT); 
            if(vecL[iRan1][iRan2]==0 ){
                vecL[iRan1][iRan2] = 3;
                nj.posicionesX[2]=iRan1;
                nj.posicionesY[2]=iRan2;
                lTablero[iRan1][iRan2].setIcon(p.ImagenPrincesa1(tamT));
                validarP3 = false;
            }
        }while(validarP3);
        boolean validar4 = true;
        do{
            Random ran1  =new Random();
            int iRan1 = ran1.nextInt(tamT);
            Random ran2  =new Random();
            int iRan2 = ran2.nextInt(tamT); 
            if(vecL[iRan1][iRan2]==0 ){
                vecL[iRan1][iRan2] = 4;
                nj.posicionesX[3]=iRan1;
                nj.posicionesY[3]=iRan2;
                lTablero[iRan1][iRan2].setIcon(p.ImagenCaballero2(tamT));
                validar4 = false;
            }
        }while(validar4);
        boolean validar5 = true;
        do{
            Random ran1  =new Random();
            int iRan1 = ran1.nextInt(tamT);
            Random ran2  =new Random();
            int iRan2 = ran2.nextInt(tamT); 
            if(vecL[iRan1][iRan2]==0 ){
                vecL[iRan1][iRan2] = 5;
                nj.posicionesX[4]=iRan1;
                nj.posicionesY[4]=iRan2;
                lTablero[iRan1][iRan2].setIcon(p.ImagenMago2(tamT));
                validar5 = false;
            }
        }while(validar5);
        boolean validar6 = true;
        do{
            Random ran1  =new Random();
            int iRan1 = ran1.nextInt(tamT);
            Random ran2  =new Random();
            int iRan2 = ran2.nextInt(tamT); 
            if(vecL[iRan1][iRan2]==0 ){
                vecL[iRan1][iRan2] = 6;
                nj.posicionesX[5]=iRan1;
                nj.posicionesY[5]=iRan2;
                lTablero[iRan1][iRan2].setIcon(p.ImagenPrincesa2(tamT));
                validar6 = false;
            }
        }while(validar6);
        
    }
    //valores Iniciales del Frame Principal
    public void Inicializar(){
        
        setLayout(null);
        setSize(1400, 800);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public void Repintar(){
        for(int i = 0; i < tamT;i++){
            for(int j =0; j <tamT;j++){
                if(vecL[i][j] == 1){
                    lTablero[i][j].setIcon(p.ImagenCaballero1(tamT));
                }
                if(vecL[i][j] == 2){
                    lTablero[i][j].setIcon(p.ImagenMago1(tamT));
                }
                if(vecL[i][j] == 3){
                    lTablero[i][j].setIcon(p.ImagenPrincesa1(tamT));
                }
                if(vecL[i][j] == 4){
                    lTablero[i][j].setIcon(p.ImagenCaballero2(tamT));
                }
                if(vecL[i][j] == 5){
                    lTablero[i][j].setIcon(p.ImagenMago2(tamT));
                }
                if(vecL[i][j] == 6){
                    lTablero[i][j].setIcon(p.ImagenPrincesa2(tamT));
                }
                if(vecL[i][j] == 7){
                    lTablero[i][j].setIcon(p.ImagenBombas(tamT));
                }
                if(vecL[i][j] == 8){
                    lTablero[i][j].setIcon(p.ImagenVidas(tamT));
                }
            }
        }
    }
    public void RepintarVida(){
        switch (nj.getVidasJugador2()){
            case 0:
                iVida2.setIcon(p.ImagenVidas0());
                break;
                case 1:
                iVida2.setIcon(p.ImagenVidas1());
                break;
                case 2:
                iVida2.setIcon(p.ImagenVidas2());
                break;
                case 3:
                iVida2.setIcon(p.ImagenVidas3());
                break;
                case 4:
                iVida2.setIcon(p.ImagenVidas4());
                break;
                case 5:
                iVida2.setIcon(p.ImagenVidas5());
                break;
                case 6:
                iVida2.setIcon(p.ImagenVidas6());
                break;
                case 7:
                iVida2.setIcon(p.ImagenVidas7());
                break;
                case 8:
                iVida2.setIcon(p.ImagenVidas8());
                break;
                case 9:
                iVida2.setIcon(p.ImagenVidas9());
                break;
                case 10:
                iVida2.setIcon(p.ImagenVidas10());
                break;
                case 11:
                iVida2.setIcon(p.ImagenVidas11());
                break;
                case 12:
                iVida2.setIcon(p.ImagenVidas12());
                break;
        }
        switch (nj.getVidasJugador1()){
            case 0:
                iVida1.setIcon(p.ImagenVidas0());
                break;
                case 1:
                iVida1.setIcon(p.ImagenVidas1());
                break;
                case 2:
                iVida1.setIcon(p.ImagenVidas2());
                break;
                case 3:
                iVida1.setIcon(p.ImagenVidas3());
                break;
                case 4:
                iVida1.setIcon(p.ImagenVidas4());
                break;
                case 5:
                iVida1.setIcon(p.ImagenVidas5());
                break;
                case 6:
                iVida1.setIcon(p.ImagenVidas6());
                break;
                case 7:
                iVida1.setIcon(p.ImagenVidas7());
                break;
                case 8:
                iVida1.setIcon(p.ImagenVidas8());
                break;
                case 9:
                iVida1.setIcon(p.ImagenVidas9());
                break;
                case 10:
                iVida1.setIcon(p.ImagenVidas10());
                break;
                case 11:
                iVida1.setIcon(p.ImagenVidas11());
                break;
                case 12:
                iVida1.setIcon(p.ImagenVidas12());
                break;
        }
    }
    
}
