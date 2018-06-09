/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyeto1;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author irams
 */
public class VentanaOrdenar extends JFrame{
    String nomJug1;
    String nomJug2;

    public VentanaOrdenar(String nomJug1, String nomJug2) {
        this.nomJug1 = nomJug1;
        this.nomJug2 = nomJug2;
        add(cBox1());
        add(cBox2());
        add(Jugador1());
        add(Jugador2());
        add(J1P1());
        add(J1P2());
        add(J1P3());
        add(Agregar1());
        
        Inicializar();
        
    }
    JLabel nombreJug1;
    JLabel nombreJug2;
    JComboBox seleccionar1;
    JComboBox seleccionar2;
    JLabel jugPer1;
    JLabel jugPer2;
    JLabel jugPer3;
    JLabel jugPer11;
    JLabel jugPer22;
    JLabel jugPer33;
    JButton agregar1;
    JButton agregar2;
    JButton siguiente;
    
    public JLabel Jugador1(){
        nombreJug1 = new JLabel("Jugador 1 : "+ nomJug1+" Ordene sus personajes");
        nombreJug1.setBounds(10, 50, 260, 30);
        return nombreJug1;
    }
    public JLabel J1P1(){
        jugPer1 = new JLabel();
        jugPer1.setBorder(BorderFactory.createLineBorder(Color.black));
        jugPer1.setBounds(20, 90, 100, 30);
        return jugPer1;
    }
    public JLabel J1P2(){
        jugPer2 = new JLabel();
        jugPer2.setBorder(BorderFactory.createLineBorder(Color.black));
        jugPer2.setBounds(20, 130, 100, 30);
        return jugPer2;
    }
    public JLabel J1P3(){
        jugPer3 = new JLabel();
        jugPer3.setBorder(BorderFactory.createLineBorder(Color.black));
        jugPer3.setBounds(20, 170, 100, 30);
        return jugPer3;
    }
    public JButton Agregar1(){
        agregar1 = new JButton("Agregar");
        agregar1.setBounds(200, 160, 100, 30);
        return agregar1;
    }
    public JLabel J2P1(){
        jugPer11 = new JLabel();
        jugPer11.setBorder(BorderFactory.createLineBorder(Color.black));
        jugPer11.setBounds(20, 250, 100, 30);
        return jugPer11;
    }
    public JLabel J2P2(){
        jugPer22 = new JLabel();
        jugPer22.setBorder(BorderFactory.createLineBorder(Color.black));
        jugPer22.setBounds(20, 290, 100, 30);
        return jugPer22;
    }
    public JLabel J2P3(){
        jugPer33 = new JLabel();
        jugPer33.setBorder(BorderFactory.createLineBorder(Color.black));
        jugPer33.setBounds(20, 330, 100, 30);
        return jugPer33;
    }
    public JButton Agregar2(){
        agregar2 = new JButton("Agregar");
        agregar2.setBounds(200, 290, 100, 30);
        return agregar2;
    }
    public JLabel Jugador2(){
        nombreJug2 = new JLabel("Jugador 2 : "+ nomJug2+" Ordene sus personajes");
        nombreJug2.setBounds(10, 210, 260, 30);
        return nombreJug2;
    }
    public JComboBox cBox1(){
        seleccionar1 = new JComboBox();
        seleccionar1.addItem("Caballero");
        seleccionar1.addItem("Mago");
        seleccionar1.addItem("Princesa");
        seleccionar1.setBounds(200, 80, 100, 40);
        return seleccionar1;
    }
    public JComboBox cBox2(){
        seleccionar2 = new JComboBox();
        seleccionar2.addItem("Caballero");
        seleccionar2.addItem("Mago");
        seleccionar2.addItem("Princesa");
        seleccionar2.setBounds(200, 280, 100, 40);
        
        return seleccionar2;
    }
    public void Inicializar(){
        setLayout(null);
        setSize(400, 550);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
