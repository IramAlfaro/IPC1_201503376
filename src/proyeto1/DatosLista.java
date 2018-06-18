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
public class DatosLista {
    private String nombreJugador1;
    private String nombreJugador2;
    private double tiempo;
    private String personajesJugador1;
    private String personajesJugador2;
    private int vidasJugador1;
    private int vidasJugador2;
    private String ganador;

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public DatosLista(String nombreJugador1, String nombreJugador2, double tiempo, String personajesJugador1, String personajesJugador2, int vidasJugador1, int vidasJugador2,String ganador) {
        this.nombreJugador1 = nombreJugador1;
        this.nombreJugador2 = nombreJugador2;
        this.tiempo = tiempo;
        this.personajesJugador1 = personajesJugador1;
        this.personajesJugador2 = personajesJugador2;
        this.vidasJugador1 = vidasJugador1;
        this.vidasJugador2 = vidasJugador2;
        this.ganador=ganador;
    }

    public String getNombreJugador1() {
        return nombreJugador1;
    }

    public void setNombreJugador1(String nombreJugador1) {
        this.nombreJugador1 = nombreJugador1;
    }

    public String getNombreJugador2() {
        return nombreJugador2;
    }

    public void setNombreJugador2(String nombreJugador2) {
        this.nombreJugador2 = nombreJugador2;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getPersonajesJugador1() {
        return personajesJugador1;
    }

    public void setPersonajesJugador1(String personajesJugador1) {
        this.personajesJugador1 = personajesJugador1;
    }

    public String getPersonajesJugador2() {
        return personajesJugador2;
    }

    public void setPersonajesJugador2(String personajesJugador2) {
        this.personajesJugador2 = personajesJugador2;
    }

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
    
}
