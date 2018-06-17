/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyeto1;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author irams
 */
public class MovimientoAb extends Thread{
    public TableroVentana tv;
    public NombresJugadores nj;
    public int cantidad=0;
    public int a=0,b=0;

    public MovimientoAb(int cantidad,TableroVentana tv, NombresJugadores nj) {
        this.tv = tv;
        this.nj = nj;
        this.cantidad = cantidad;
        
    }

    public MovimientoAb() {
    }
    public boolean Comprobar(){
        if(a>=tv.tamT-1)return true;
        
        return false;
    }
    public void MoverArr(int cantidad){
        
        a=0;
        boolean seguir=true;
        do{
            
            for(int i = 0; i <tv.tamT;i++){
                for(int j =0; j <tv.tamT;j++){
                    if(nj.perOrdenLogico[tv.turno-1]==tv.vecL[i][j]){
                        a=i;
                        b=j;
                        seguir=false;
                        
                    }
                }
            }
        }while(seguir);
        if(cantidad <=0){
            if(nj.perOrdenLogico[tv.turno-1]!=3 ||nj.perOrdenLogico[tv.turno-1]!=6){
            atacar();
            return;
            }else{
                        Ataques atq = new Ataques(tv, nj);
                        atq.AtaquePrincesa();
            }
        }
        if(Comprobar()){
            cantidad=0;
            tv.vecL[a][b]=0;
            tv.lTablero[a][b].setIcon(null);
            System.out.println(tv.vecL[a][b]);
            tv.Repintar();
            if(tv.turno==1||tv.turno==3||tv.turno==5){nj.setVidasJugador1(nj.getVidasJugador1()-1);}else{nj.setVidasJugador2(nj.getVidasJugador2()-1);}
            tv.RepintarVida();
            Caracol();
            if(nj.perOrdenLogico[tv.turno-1]!=3 ||nj.perOrdenLogico[tv.turno-1]!=6){
            atacar();
            return;
            }else{
                        Ataques atq = new Ataques(tv, nj);
                        atq.AtaquePrincesa();
            }
            
            
            /*aqui debo poner el codigo para que el personaje sea colocado en el centro de tablero y 
            si encuentra un espacio diferente de cero debe hacer una espiral hasta encontrar un lugar en */
        }else{
            try {
                if(tv.vecL[a+1][b]==0){
                    mover1();
                    cantidad--;
                    
                }else if(tv.vecL[a+1][b]==7 && cantidad<=1){
                    
                    if(tv.turno==1||tv.turno==3||tv.turno==5){nj.setVidasJugador1(nj.getVidasJugador1()-1);}else{nj.setVidasJugador2(nj.getVidasJugador2()-1);}
                    tv.RepintarVida();
                    mover1();
                    cantidad--;
                    
                    
                }else if(tv.vecL[a+1][b]==7 && cantidad>1){
                    
                    mover1();
                    cantidad--;
                    Thread.sleep(1000);
                    
                    if(Comprobar()){
                        cantidad=0;
                        tv.vecL[a][b]=7;
                        tv.lTablero[a][b].setIcon(null);
                        tv.Repintar();
                        if(tv.turno==1||tv.turno==3||tv.turno==5){nj.setVidasJugador1(nj.getVidasJugador1()-1);}else{nj.setVidasJugador2(nj.getVidasJugador2()-1);}
                        tv.RepintarVida();
                        Caracol();
                        if(nj.perOrdenLogico[tv.turno-1]!=3 ||nj.perOrdenLogico[tv.turno-1]!=6){
            atacar();
            return;
            }else{
                        Ataques atq = new Ataques(tv, nj);
                        atq.AtaquePrincesa();
            }
                    }else if(tv.vecL[a+1][b]==8 && cantidad<=1){
                        mover1();
                        if(tv.turno==1||tv.turno==3||tv.turno==5){nj.setVidasJugador1(nj.getVidasJugador1()+1);}else{nj.setVidasJugador2(nj.getVidasJugador2()+1);}
                        tv.RepintarVida();
                        tv.vecL[a-1][b]=7;
                        tv.Repintar();
                        cantidad--;
                        Thread.sleep(1000);
                    }else if(tv.vecL[a+1][b]==8 && cantidad>1){
                        mover1();
                        tv.vecL[a-1][b]=7;
                        tv.Repintar();
                        cantidad--;
                        Thread.sleep(1000);
                        mover1();
                        tv.vecL[a-1][b]=8;
                        tv.Repintar();
                        cantidad--;
                    }else if(tv.vecL[a+1][b]==7 && cantidad<=1){
                         mover1();
                        if(tv.turno==1||tv.turno==3||tv.turno==5){nj.setVidasJugador1(nj.getVidasJugador1()-1);}else{nj.setVidasJugador2(nj.getVidasJugador2()-1);}
                        tv.RepintarVida();
                        tv.vecL[a-1][b]=7;
                        tv.Repintar();
                        cantidad--;
                        Thread.sleep(1000);
                    }else if(tv.vecL[a+1][b]==7 && cantidad>1){
                        mover1();
                        tv.vecL[a-1][b]=7;
                        tv.Repintar();
                        cantidad--;
                        Thread.sleep(1000);
                        mover1();
                        tv.vecL[a-1][b]=7;
                        tv.Repintar();
                        cantidad--;
                    }else{
                        mover1();
                        cantidad--;
                        tv.vecL[a-1][b]=7;
                        tv.Repintar();
                    }
                    
                }else if(tv.vecL[a+1][b]==8 && cantidad<=1){
                    
                    if(tv.turno==1||tv.turno==3||tv.turno==5){nj.setVidasJugador1(nj.getVidasJugador1()+1);}else{nj.setVidasJugador2(nj.getVidasJugador2()+1);}
                    tv.RepintarVida();
                    mover1();
                    cantidad--;
                    Thread.sleep(1000);
                    
                    
                }else if(tv.vecL[a+1][b]==8 && cantidad>1){
                    mover1();
                    cantidad--;
                    Thread.sleep(1000);
                    if(Comprobar()){
                        cantidad=0;
                        tv.vecL[a][b]=7;
                        tv.lTablero[a][b].setIcon(null);
                        tv.Repintar();
                        if(tv.turno==1||tv.turno==3||tv.turno==5){nj.setVidasJugador1(nj.getVidasJugador1()-1);}else{nj.setVidasJugador2(nj.getVidasJugador2()-1);}
                        tv.RepintarVida();
                        Caracol();
                        if(nj.perOrdenLogico[tv.turno-1]!=3 ||nj.perOrdenLogico[tv.turno-1]!=6){
            atacar();
            return;
            }else{
                        Ataques atq = new Ataques(tv, nj);
                        atq.AtaquePrincesa();
            }
                    }else if(tv.vecL[a+1][b]==8 && cantidad<=1){
                        mover1();
                        if(tv.turno==1||tv.turno==3||tv.turno==5){nj.setVidasJugador1(nj.getVidasJugador1()+1);}else{nj.setVidasJugador2(nj.getVidasJugador2()+1);}
                        tv.RepintarVida();
                        tv.vecL[a-1][b]=8;
                        tv.Repintar();
                        cantidad--;
                        Thread.sleep(1000);
                    }else if(tv.vecL[a+1][b]==8 && cantidad>1){
                        mover1();
                        tv.vecL[a-1][b]=8;
                        tv.Repintar();
                        cantidad--;
                        Thread.sleep(1000);
                        mover1();
                        tv.vecL[a-1][b]=8;
                        tv.Repintar();
                        cantidad--;
                    }else if(tv.vecL[a+1][b]==7 && cantidad<=1){
                         mover1();
                        if(tv.turno==1||tv.turno==3||tv.turno==5){nj.setVidasJugador1(nj.getVidasJugador1()-1);}else{nj.setVidasJugador2(nj.getVidasJugador2()-1);}
                        tv.RepintarVida();
                        tv.vecL[a-1][b]=8;
                        tv.Repintar();
                        cantidad--;
                        Thread.sleep(1000);
                    }else if(tv.vecL[a+1][b]==7 && cantidad>1){
                        mover1();
                        tv.vecL[a-1][b]=8;
                        tv.Repintar();
                        cantidad--;
                        Thread.sleep(1000);
                        mover1();
                        tv.vecL[a-1][b]=7;
                        tv.Repintar();
                        cantidad--;
                    }else{
                        mover1();
                        cantidad--;
                        tv.vecL[a-1][b]=7;
                        tv.Repintar();
                    }
                    
                }else{
                    Random selec = new Random();
                    int nr  = selec.nextInt(2);
                    if(nr==0){
                        MovimientoDerecha md = new MovimientoDerecha(cantidad, tv, nj);
                        System.out.println("derecha");
                        md.start();
                    }else{
                        MoverIzquierda mi = new MoverIzquierda(cantidad, tv, nj);
                        System.out.println("izquierda");
                        mi.start();
                    }
                    cantidad =0;
                }
                
                
                Thread.sleep(1000);
                MoverArr(cantidad);
            } catch (InterruptedException ex) {
                Logger.getLogger(MovimientoDerecha.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    public void run(){
        MoverArr(cantidad);
    }
    public void Caracol(){
        int c,d,e,f,g;
            boolean encontrado=false;
            c=(tv.tamT-1)/2;
            d=c;
            e=c;
            do{
                f=e;
                for(g = d;g>= e-1;g--){
                    if(!encontrado){
                        if(tv.vecL[g][f]==0){
                            tv.vecL[g][f]=nj.perOrdenLogico[tv.turno-1];
                            tv.vecL[a][b]=0;
                            tv.Repintar();
                            encontrado=true;
                        }
                    }
                }
                g++;
                for(f = g+2;f<= d+1;f++){
                    if(!encontrado){
                        if(tv.vecL[g][f]==0){
                            tv.vecL[g][f]=nj.perOrdenLogico[tv.turno-1];
                            tv.vecL[a][b]=0;
                            tv.Repintar();
                            encontrado=true;
                        }
                    }
                }
                f--;
                for(g = e;g<= d+1;g++){
                    if(!encontrado){
                        if(tv.vecL[g][f]==0){
                            tv.vecL[g][f]=nj.perOrdenLogico[tv.turno-1];
                            tv.vecL[a][b]=0;
                            tv.Repintar();
                            encontrado=true;
                        }
                    }
                }
                g--;
                for(f = d;f>= e;f--){
                    if(!encontrado){
                        if(tv.vecL[g][f]==0){
                            tv.vecL[g][f]=nj.perOrdenLogico[tv.turno-1];
                            tv.vecL[a][b]=0;
                            tv.Repintar();
                            encontrado=true;
                        }
                    }
                }
                d++;
                e--;
            }while(!encontrado);
    }
    public void mover1(){
        tv.vecL[a][b]=0;
            tv.lTablero[a][b].setIcon(null);
                    tv.Repintar();
                    a= a+1;
                    tv.vecL[a][b]=nj.perOrdenLogico[tv.turno-1];
                    tv.Repintar();
    }
    public void atacar(){
        
                int resp = JOptionPane.showConfirmDialog(null, "Deseas Atacar", "Atacar",JOptionPane.YES_NO_OPTION);
                if(resp== JOptionPane.YES_OPTION){
                    System.out.println("Puede atacar");
                    
                    System.out.println("Puede atacar");
                    tv.atacarAbajo.setEnabled(true);
                    tv.atacarArriba.setEnabled(true);
                    tv.atacarDerecha.setEnabled(true);
                    tv.atacarIzquierda.setEnabled(true);
                    
                }else{
                    tv.dado.setEnabled(true);
                }
            
            
    }
    
}
