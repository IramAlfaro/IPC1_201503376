/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyeto1;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 *
 * @author irams
 */
public class TimeOut {
    
    private int minutos = 0;
    private int min = 0 ;
    private int segundos =0;
    private Timer timer;
    private boolean isTimerRunning;
    private Display display;
    NombresJugadores nj;

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    TableroVentana tv;
    
    
    //public TimeOut (NombresJugadores nj, TableroVentana tv){
    
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            isTimerRunning = true;
            if(nj.getVidasJugador1()<=0 || nj.getVidasJugador2()<=0){
                timer.cancel();
                timer.purge();
                
                int resp = JOptionPane.showConfirmDialog(null, "Deseas Guardar la Partida", "Guardar",JOptionPane.YES_NO_OPTION);
                if(resp== JOptionPane.YES_OPTION){
                        // mandar datos a la clase para guardar la partida
                        //retornar a menu inicial
                        String tim = String.valueOf(min) + "."+String.valueOf(segundos);
                        double times = Double.parseDouble(tim);
                        String personajes1 = nj.strPersonajes[0]+"/"+nj.strPersonajes[2]+"/"+nj.strPersonajes[4];
                        String personajes2 = nj.strPersonajes[1]+"/"+nj.strPersonajes[3]+"/"+nj.strPersonajes[5];
                        String ganador;
                        if(nj.getVidasJugador1()>nj.getVidasJugador2()){ganador = nj.getNamePlayer1();}else{ganador = nj.getNamePlayer2();}
                        EscribirArchivo  ea = new EscribirArchivo();
                        ea.crear(nj, times, personajes1, personajes2, ganador);
                        System.out.println("si");   
                        tv.dispose();
                        MenuPrincipal mp = new MenuPrincipal();
                        mp.setVisible(true);
                        
                }else{
                        // regresar al menu inicial  y no mandar datos
                        MenuPrincipal mp = new MenuPrincipal();
                        mp.setVisible(true);
                        System.out.println("ño");
                }
            }
            if(segundos <60){
                segundos++;
            }else{
                segundos = 0;
                min = min+1;
                if(min < minutos-1){}
                else{
                    isTimerRunning = false;
                    timer.cancel();
                    timer.purge();
                    int resp = JOptionPane.showConfirmDialog(null, "Deseas Guardar la Partida", "Guardar",JOptionPane.YES_NO_OPTION);
                    if(resp== JOptionPane.YES_OPTION){
                        // mandar datos a la clase para guardar la partida
                        //retornar a menu inicial
                         String tim = String.valueOf(min) + "."+String.valueOf(segundos);
                        double times = Double.parseDouble(tim);
                        String personajes1 = nj.strPersonajes[0]+"/"+nj.strPersonajes[2]+"/"+nj.strPersonajes[4];
                        String personajes2 = nj.strPersonajes[1]+"/"+nj.strPersonajes[3]+"/"+nj.strPersonajes[5];
                        String ganador;
                        if(nj.getVidasJugador1()>nj.getVidasJugador2()){ganador = nj.getNamePlayer1();}else{ganador = nj.getNamePlayer2();}
                        EscribirArchivo  ea = new EscribirArchivo();
                        ea.crear(nj, times, personajes1, personajes2, ganador);
                        System.out.println("si");   
                        tv.dispose();
                        MenuPrincipal mp = new MenuPrincipal();
                        mp.setVisible(true);
                    }else{
                        // regresar al menu inicial  y no mandar datos
                        MenuPrincipal mp = new MenuPrincipal();
                        mp.setVisible(true);
                        System.out.println("ño");
                    }
                }
                    
            }
            
            if(isTimerRunning){
                
                nj.setTiempo(display.PrintTime(min, segundos, nj));
                //System.out.println(nj.getTiempo());
                tv.cronometro.setText(nj.getTiempo());
                
                
            }
            
        }
    };

    TimeOut(NombresJugadores nj, TableroVentana tv) {
        timer = new Timer();
        display = new Display();
        this.nj=nj;
        this.tv = tv;
        setMinutos(nj.getMin());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void start(int timeout, int interval){
        timer.schedule(task, timeout, interval);
    }
}  

