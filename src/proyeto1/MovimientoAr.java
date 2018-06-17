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
public class MovimientoAr extends Thread{
    public TableroVentana tv;
    public NombresJugadores nj;
    public int cantidad=0;
    public int a=0,b=0;

    public MovimientoAr(int cantidad,TableroVentana tv, NombresJugadores nj) {
        this.tv = tv;
        this.nj = nj;
        this.cantidad = cantidad;
        
    }

    
    public boolean Comprobar(){
        
        if(a<=0)return true;
        return false;
    }
    public void MoverAba(int cantidad){
        
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
        
        //compruebo que el valor de los movimientos sea mayor a sero para que l jugador se siga moviendo
        if(cantidad <=0){
            if(nj.perOrdenLogico[tv.turno-1]!=3 ||nj.perOrdenLogico[tv.turno-1]!=6){
            atacar();
            return;
            }else{
                        Ataques atq = new Ataques(tv, nj);
                        atq.AtaquePrincesa();
            }
        }
        //compruebode que el personaje no se salga del tablero 
        //si se sale es devuelto al centro y se le resta una vida al jugador en turno
        if(Comprobar()){
            
            cantidad=0;
            tv.vecL[a][b]=0;
            tv.lTablero[a][b].setIcon(null);
            System.out.println(tv.vecL[a][b]);
             if(tv.turno==1||tv.turno==3||tv.turno==5){nj.setVidasJugador1(nj.getVidasJugador1()-1);}else{nj.setVidasJugador2(nj.getVidasJugador2()-1);}
                    tv.RepintarVida();
            tv.Repintar();
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
                //si el espacio siguiente a la posicion actual esta basio se movera un espacio
                if(tv.vecL[a-1][b]==0){
                    Mover1();
                    cantidad--;
                    
                //si en la posicion siguiente se encuentra una bomba y en su movimiento le queda solo uno entonces el personaje caera en una bomba
                //y perdera un vida
                }else if(tv.vecL[a-1][b]==7 && cantidad<=1){
                    if(tv.turno==1||tv.turno==3||tv.turno==5){nj.setVidasJugador1(nj.getVidasJugador1()-1);}else{nj.setVidasJugador2(nj.getVidasJugador2()-1);}
                    tv.RepintarVida();
                    Mover1();
                    cantidad--;
                    
                //comprueba si el personaje va a pasar por ensima de una bomba  
                }else if(tv.vecL[a-1][b]==7 && cantidad>1){
                    Mover1();
                    cantidad--;
                    Thread.sleep(1000);
                    if(Comprobar()){
                        cantidad=0;
                         tv.vecL[a][b]=7;
                        tv.lTablero[a][b].setIcon(null);
                        if(tv.turno==1||tv.turno==3||tv.turno==5){nj.setVidasJugador1(nj.getVidasJugador1()-1);}else{nj.setVidasJugador2(nj.getVidasJugador2()-1);}
                        tv.RepintarVida();
                        tv.Repintar();
                        Caracol(); 
                       if(nj.perOrdenLogico[tv.turno-1]!=3 ||nj.perOrdenLogico[tv.turno-1]!=6){
            atacar();
            return;
            }else{
                        Ataques atq = new Ataques(tv, nj);
                        atq.AtaquePrincesa();
            }
                    }else if(tv.vecL[a-1][b]==7 && cantidad<=1){
                        if(tv.turno==1||tv.turno==3||tv.turno==5){nj.setVidasJugador1(nj.getVidasJugador1()-1);}else{nj.setVidasJugador2(nj.getVidasJugador2()-1);}
                        tv.RepintarVida();
                        Mover1(); 
                        tv.vecL[a+1][b]=7;
                        tv.Repintar();
                        cantidad--;
                        
                    }else if(tv.vecL[a-1][b]==7 && cantidad >1){
                        Mover1();
                        cantidad--;
                        tv.vecL[a+1][b]=7;
                        tv.Repintar();
                        Thread.sleep(1000);
                        Mover1();
                        cantidad--;
                        tv.vecL[a+1][b]=7;
                        tv.Repintar();
                        Thread.sleep(1000);
                    }else if(tv.vecL[a-1][b]==8 && cantidad<=1){
                        if(tv.turno==1||tv.turno==3||tv.turno==5){nj.setVidasJugador1(nj.getVidasJugador1()+1);}else{nj.setVidasJugador2(nj.getVidasJugador2()+1);}
                        tv.RepintarVida();
                        
                        Mover1();
                        tv.vecL[a+1][b]=7;
                        tv.Repintar();
                        cantidad--;
                        
                    }else if(tv.vecL[a-1][b]==8 && cantidad >1){
                        Mover1();
                        cantidad--;
                        tv.vecL[a+1][b]=8;
                        tv.Repintar();
                        Thread.sleep(1000);
                        Mover1();
                        cantidad--;
                        tv.vecL[a+1][b]=7;
                        tv.Repintar();
                        Thread.sleep(1000);
                    }else{
                        Mover1();
                        cantidad--;
                        tv.vecL[a+1][b]=7;
                        tv.Repintar();
                    }
                    
                }else if(tv.vecL[a-1][b]==8 && cantidad<=1){
                    
                    if(tv.turno==1||tv.turno==3||tv.turno==5){nj.setVidasJugador1(nj.getVidasJugador1()+1);}else{nj.setVidasJugador2(nj.getVidasJugador2()+1);}
                    tv.RepintarVida();
                    Mover1();
                    cantidad--;
                    
                    
                    
                }else if(tv.vecL[a-1][b]==8 && cantidad>1){
                    Mover1();
                    cantidad--;
                    Thread.sleep(1000);
                    if(Comprobar()){
                        cantidad=0;
                        tv.vecL[a][b]=8;
                        tv.lTablero[a][b].setIcon(null);
                        if(tv.turno==1||tv.turno==3||tv.turno==5){nj.setVidasJugador1(nj.getVidasJugador1()-1);}else{nj.setVidasJugador2(nj.getVidasJugador2()-1);}
                        tv.RepintarVida();
                        tv.Repintar();
                        Caracol(); 
                       if(nj.perOrdenLogico[tv.turno-1]!=3 ||nj.perOrdenLogico[tv.turno-1]!=6){
            atacar();
            return;
            }else{
                        Ataques atq = new Ataques(tv, nj);
                        atq.AtaquePrincesa();
            }
                    }else if(tv.vecL[a-1][b]==7 && cantidad<=1){
                        if(tv.turno==1||tv.turno==3||tv.turno==5){nj.setVidasJugador1(nj.getVidasJugador1()-1);}else{nj.setVidasJugador2(nj.getVidasJugador2()-1);}
                        tv.RepintarVida();
                        Mover1(); 
                        tv.vecL[a+1][b]=8;
                        tv.Repintar();
                        cantidad--;
                        
                    }else if(tv.vecL[a-1][b]==7 && cantidad >1){
                        Mover1();
                        cantidad--;
                        tv.vecL[a+1][b]=8;
                        tv.Repintar();
                        Thread.sleep(1000);
                        Mover1();
                        cantidad--;
                        tv.vecL[a+1][b]=7;
                        tv.Repintar();
                        Thread.sleep(1000);
                    }else if(tv.vecL[a-1][b]==8 && cantidad<=1){
                        if(tv.turno==1||tv.turno==3||tv.turno==5){nj.setVidasJugador1(nj.getVidasJugador1()+1);}else{nj.setVidasJugador2(nj.getVidasJugador2()+1);}
                        tv.RepintarVida();
                        Mover1(); 
                        tv.vecL[a+1][b]=8;
                        tv.Repintar();
                        cantidad--;
                    }else if(tv.vecL[a-1][b]==8 && cantidad >1){
                        Mover1();
                        cantidad--;
                        tv.vecL[a+1][b]=8;
                        tv.Repintar();
                        Thread.sleep(1000);
                        Mover1();
                        cantidad--;
                        tv.vecL[a+1][b]=8;
                        tv.Repintar();
                        Thread.sleep(1000);
                    }else{
                        Mover1();
                        cantidad--;
                        tv.vecL[a+1][b]=8;
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
                        System.out.println("Izquierda");
                        mi.start();
                    }
                    cantidad=0;
                }
                
                
                Thread.sleep(1000);
                MoverAba(cantidad);
            } catch (InterruptedException ex) {
                Logger.getLogger(MovimientoDerecha.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    public void run(){
        MoverAba(cantidad);
    }
    public void Caracol(){
        int c,d,e,f,g;
            boolean encontrado=false;
            c=(tv.tamT)/2;
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
    public void Mover1(){
        tv.vecL[a][b]=0;
        tv.lTablero[a][b].setIcon(null);
        tv.Repintar(); 
        a= a-1;
        tv.vecL[a][b]=nj.perOrdenLogico[tv.turno-1];
        tv.Repintar();
        //cantidad--;
    }
    public void atacar(){
        
                int resp = JOptionPane.showConfirmDialog(null, "Deseas Atacar", "Atacar",JOptionPane.YES_NO_OPTION);
                if(resp== JOptionPane.YES_OPTION){
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
