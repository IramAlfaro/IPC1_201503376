/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyeto1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author irams
 */
public class VentanaOrdenar extends JFrame{
    
    JLabel nombreJug1;
    JLabel ltiempo;
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
    JButton jugar;
    JSpinner tiempo;
    int index1 = 0;
    int index2 = 0;
    TimeOut to;
    NombresJugadores nj;
    TableroVentana tv ;
    
    
     
    
    public VentanaOrdenar(NombresJugadores nj) {
        
        this.nj = nj;
        
        add(cBox1());
        add(tiempo());
        add(LT());
        add(cBox2());
        add(Jugador1());
        add(Jugador2());
        add(J1P1());
        add(J1P2());
        add(J1P3());
        add(Agregar1());
        add(J2P1());
        add(J2P2());
        add(J2P3());
        add(Agregar2());
        add(Jugar());
        
        
        Inicializar();
        //NombresJugadores nj = new NombresJugadores() ;
        
    }
    
    
    public JLabel Jugador1(){
        nombreJug1 = new JLabel("Jugador 1 : "+ nj.getNamePlayer1() +" Ordene sus personajes");
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
        agregar1.setBounds(200, 150, 100, 30);
        agregar1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                switch (index1){
                    case 0:
                        if(seleccionar1.getSelectedItem() == "Caballero"){
                            jugPer1.setText((String)seleccionar1.getSelectedItem());
                            seleccionar1.removeItemAt(seleccionar1.getSelectedIndex());
                            nj.strPersonajes[0] = jugPer1.getText();
                            nj.perOrdenLogico[0] = 1;
                            
                        }else if(seleccionar1.getSelectedItem() == "Mago"){
                            jugPer1.setText((String)seleccionar1.getSelectedItem());
                            seleccionar1.removeItemAt(seleccionar1.getSelectedIndex());
                            nj.strPersonajes[0] = jugPer1.getText();
                            nj.perOrdenLogico[0] = 2;
                            
                        }else if(seleccionar1.getSelectedItem() == "Princesa"){
                            jugPer1.setText((String)seleccionar1.getSelectedItem());
                            seleccionar1.removeItemAt(seleccionar1.getSelectedIndex());
                            nj.strPersonajes[0] = jugPer1.getText();
                            nj.perOrdenLogico[0] = 3;
                            
                        }
                        index1++;
                        break;
                    case 1:
                        if(seleccionar1.getSelectedItem() == "Caballero"){
                            jugPer2.setText((String)seleccionar1.getSelectedItem());
                            seleccionar1.removeItemAt(seleccionar1.getSelectedIndex());
                            nj.strPersonajes[2] = jugPer2.getText();
                            nj.perOrdenLogico[2] = 1;
                            index1++;
                        }else if(seleccionar1.getSelectedItem() == "Mago"){
                            jugPer2.setText((String)seleccionar1.getSelectedItem());
                            seleccionar1.removeItemAt(seleccionar1.getSelectedIndex());
                            nj.strPersonajes[2] = jugPer2.getText();
                            nj.perOrdenLogico[2] = 2;
                            index1++;
                        }else if(seleccionar1.getSelectedItem() == "Princesa"){
                            jugPer2.setText((String)seleccionar1.getSelectedItem());
                            seleccionar1.removeItemAt(seleccionar1.getSelectedIndex());
                            nj.strPersonajes[2] = jugPer2.getText();
                            nj.perOrdenLogico[2] = 3;
                            index1++;
                        }
                        break;
                    case 2:
                        if(seleccionar1.getSelectedItem() == "Caballero"){
                            jugPer3.setText((String)seleccionar1.getSelectedItem());
                            seleccionar1.removeItemAt(seleccionar1.getSelectedIndex());
                            nj.strPersonajes[4] = jugPer3.getText();
                            nj.perOrdenLogico[4] = 1;
                            index1++;
                        }else if(seleccionar1.getSelectedItem() == "Mago"){
                            jugPer3.setText((String)seleccionar1.getSelectedItem());
                            seleccionar1.removeItemAt(seleccionar1.getSelectedIndex());
                            nj.strPersonajes[4] = jugPer3.getText();
                            nj.perOrdenLogico[4] = 2;
                            index1++;
                        }else if(seleccionar1.getSelectedItem() == "Princesa"){
                            jugPer3.setText((String)seleccionar1.getSelectedItem());
                            seleccionar1.removeItemAt(seleccionar1.getSelectedIndex());
                            nj.strPersonajes[4] = jugPer3.getText();
                            nj.perOrdenLogico[4] = 3;
                            index1++;
                        }

                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "No Existen mas personajes");
                        
                }
            }
        });
        return agregar1;
    }
    public JLabel J2P1(){
        jugPer11 = new JLabel();
        jugPer11.setBorder(BorderFactory.createLineBorder(Color.black));
        jugPer11.setBounds(20, 260, 100, 30);
        return jugPer11;
    }
    public JLabel J2P2(){
        jugPer22 = new JLabel();
        jugPer22.setBorder(BorderFactory.createLineBorder(Color.black));
        jugPer22.setBounds(20, 300, 100, 30);
        return jugPer22;
    }
    public JLabel J2P3(){
        jugPer33 = new JLabel();
        jugPer33.setBorder(BorderFactory.createLineBorder(Color.black));
        jugPer33.setBounds(20, 340, 100, 30);
        return jugPer33;
    }
    public JButton Agregar2(){
        agregar2 = new JButton("Agregar");
        agregar2.setBounds(200, 340, 100, 30);
        agregar2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                switch (index1){
                    case 3:
                        if(seleccionar2.getSelectedItem() == "Caballero"){
                            jugPer11.setText((String)seleccionar2.getSelectedItem());
                            seleccionar2.removeItemAt(seleccionar2.getSelectedIndex());
                            nj.strPersonajes[1] = jugPer11.getText();
                            nj.perOrdenLogico[1] = 4;
                            index1++;
                        }else if(seleccionar2.getSelectedItem() == "Mago"){
                            jugPer11.setText((String)seleccionar2.getSelectedItem());
                            seleccionar2.removeItemAt(seleccionar2.getSelectedIndex());
                            nj.strPersonajes[1] = jugPer11.getText();
                            nj.perOrdenLogico[1] = 5;
                            index1++;
                        }else if(seleccionar2.getSelectedItem() == "Princesa"){
                            jugPer11.setText((String)seleccionar2.getSelectedItem());
                            seleccionar2.removeItemAt(seleccionar2.getSelectedIndex());
                            nj.strPersonajes[1] = jugPer11.getText();
                            nj.perOrdenLogico[1] = 6;
                            index1++;
                        }
                        break;
                    case 4:
                        if(seleccionar2.getSelectedItem() == "Caballero"){
                            jugPer22.setText((String)seleccionar2.getSelectedItem());
                            seleccionar2.removeItemAt(seleccionar2.getSelectedIndex());
                            nj.strPersonajes[3] = jugPer22.getText();
                            nj.perOrdenLogico[3] = 4;
                            index1++;
                        }else if(seleccionar2.getSelectedItem() == "Mago"){
                            jugPer22.setText((String)seleccionar2.getSelectedItem());
                            seleccionar2.removeItemAt(seleccionar2.getSelectedIndex());
                            nj.strPersonajes[3] = jugPer22.getText();
                            nj.perOrdenLogico[3] = 5;
                            index1++;
                        }else if(seleccionar2.getSelectedItem() == "Princesa"){
                            jugPer22.setText((String)seleccionar2.getSelectedItem());
                            seleccionar2.removeItemAt(seleccionar2.getSelectedIndex());
                            nj.strPersonajes[3] = jugPer22.getText();
                            nj.perOrdenLogico[3] = 6;
                            index1++;
                        }
                        break;
                    case 5:
                        if(seleccionar2.getSelectedItem() == "Caballero"){
                            jugPer33.setText((String)seleccionar2.getSelectedItem());
                            seleccionar2.removeItemAt(seleccionar2.getSelectedIndex());
                            nj.strPersonajes[5] = jugPer33.getText();
                            nj.perOrdenLogico[5] = 4;
                            index1++;
                        }else if(seleccionar2.getSelectedItem() == "Mago"){
                            jugPer33.setText((String)seleccionar2.getSelectedItem());
                            seleccionar2.removeItemAt(seleccionar2.getSelectedIndex());
                            nj.strPersonajes[5] = jugPer33.getText();
                            nj.perOrdenLogico[5] = 5;
                            index1++;
                        }else if(seleccionar2.getSelectedItem() == "Princesa"){
                            jugPer33.setText((String)seleccionar2.getSelectedItem());
                            seleccionar2.removeItemAt(seleccionar2.getSelectedIndex());
                            nj.strPersonajes[5] = jugPer33.getText();
                            //System.out.println(nj.strPersonajes[5]);
                            nj.perOrdenLogico[5] = 6;
                            index1++;
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "No Existen mas personajes");
                        
                }
            }
        });
        return agregar2;
    }
    public JLabel Jugador2(){
        nombreJug2 = new JLabel("Jugador 2 : "+ nj.getNamePlayer2()+" Ordene sus personajes");
        nombreJug2.setBounds(10, 220, 260, 30);
        return nombreJug2;
    }
    public JLabel LT(){
        ltiempo =new JLabel("Tiempo");
        ltiempo.setBounds(100, 420, 60, 40);
        return ltiempo;
    }
    public JSpinner tiempo(){
        tiempo = new JSpinner();
        tiempo.setBounds(180, 420, 70, 40);
        
        return tiempo;
    }
    public JButton Jugar(){
        jugar = new JButton("Jugar");
        jugar.setBounds(150, 480, 70, 30);
        jugar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(jugPer3.getText()!= "" && jugPer33.getText()!=""){
                    
                    tv = new TableroVentana(nj);
                    
                    to = new TimeOut(nj,tv);
                    to.start(0, 1000);
                    dispose();
                    String minutos = tiempo.getValue().toString();
                    nj.setMin(Integer.parseInt(minutos));
                }else{
                    JOptionPane.showMessageDialog(null, "Debe ingresar el orden de todos sus personajes");
                }
            }
        });
        return jugar;
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
        setSize(400, 600);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
