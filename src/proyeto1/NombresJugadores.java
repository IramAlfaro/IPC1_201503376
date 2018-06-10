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

    private String namePlayer1;
    private String namePlayer2;
    private int tamTablero;
    private String tiempo;

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
        this.namePlayer1 = namePlayer1;
        this.namePlayer2 = namePlayer2;
        this.tamTablero = tamTablero; 
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
