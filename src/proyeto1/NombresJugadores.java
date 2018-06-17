/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyeto1;

/**
 *
 * @author irams
 */
class NombresJugadores {
    public int[] posicionesX;
    public int[] posicionesY;
    

    
    private String namePlayer1;
    private String namePlayer2;
    private int tamTablero;
    private String tiempo;
    public boolean[] puedeAtacar;
    public String[] strPersonajes; 
    public int[] perOrdenLogico;
    private int vidasJugador1;
    private int vidasJugador2;

    public int getVidasJugador1() {
        return vidasJugador1;
    }

    public void setVidasJugador1(int vidasJugador1) {
        this.vidasJugador1 = vidasJugador1;
    }

    public int getVidasJugador2() {
        return vidasJugador2;
    }

    public void setVidasJugador2(int vidasJugador2) {
        this.vidasJugador2 = vidasJugador2;
    }

   
    
    

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public int getTamTablero() {
        return tamTablero;
    }

    public void setTamTablero(int tamTablero) {
        this.tamTablero = tamTablero;
    }

    public NombresJugadores(String namePlayer1, String namePlayer2, int tamTablero) {
        posicionesX = new int[6];
        posicionesY = new int[6];
        puedeAtacar = new boolean[6];
        for(int i = 0 ; i<6;i++){
            puedeAtacar[i]=true;
        }
        vidasJugador1 = 5;
        vidasJugador2 = 5;
        this.namePlayer1 = namePlayer1;
        this.namePlayer2 = namePlayer2;
        this.tamTablero = tamTablero; 
        strPersonajes = new String[6];
        perOrdenLogico = new int[6];
    }

    public NombresJugadores() {
    }
    

    
    public String getNamePlayer1() {
        return namePlayer1;
    }

    public void setNamePlayer1(String namePlayer1) {
        this.namePlayer1 = namePlayer1;
    }

    public String getNamePlayer2() {
        return namePlayer2;
    }

    public void setNamePlayer2(String namePlayer2) {
        this.namePlayer2 = namePlayer2;
    }
    
    
}
