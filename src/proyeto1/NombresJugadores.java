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
    public String[] idPerJug1; 
    public String[] idPerJug2; 

    public String[] getIdPerJug1() {
        return idPerJug1;
    }

    public void setIdPerJug1(String[] idPerJug1) {
        this.idPerJug1 = idPerJug1;
    }

    public String[] getIdPerJug2() {
        return idPerJug2;
    }

    public void setIdPerJug2(String[] idPerJug2) {
        this.idPerJug2 = idPerJug2;
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
        this.namePlayer1 = namePlayer1;
        this.namePlayer2 = namePlayer2;
        this.tamTablero = tamTablero; 
        idPerJug1 = new String[3];
        idPerJug2 = new String[3];
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
