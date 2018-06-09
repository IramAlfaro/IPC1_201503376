/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyeto1;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author irams
 */
public class VentanaBienvenida extends JFrame {
    JLabel mensajeB;
    JLabel mensaje1;
    JLabel nombre1;
    JLabel nombre2;
    JTextField n1;
    JTextField n2;
    JButton siguiente;
    JButton Salir;
    JComboBox tamTablero;
    
    public VentanaBienvenida(){
        add(bienvenida());
        add(Jug1());
        add(Jug2());
        add(Inombre1());
        add(Inombre2());
        add(mensaje());
        add(Box());
        add(bSiguiente());
        add(bSalir());
        Inicializar();
    }
    
    public void Inicializar(){
        setLayout(null);
        setSize(400, 550);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public JLabel bienvenida(){
        mensajeB = new JLabel("¡Bienvenido a Arcade War!");
        mensajeB.setBounds(30, 5, 350, 120);
        mensajeB.setFont(new Font("Arial", Font.BOLD,25));
        return mensajeB;
    }
    public JLabel Inombre1(){
        nombre1 = new JLabel("Nombre del Jugador 1 :");
        nombre1.setBounds(50, 80, 150, 80);
        return nombre1;
    }
    public JLabel Inombre2(){
        nombre2 = new JLabel("Nombre del Jugador 2 :");
        nombre2.setBounds(50, 170, 150, 80);
        return nombre2;
    }
    public JLabel mensaje(){
        mensaje1 = new JLabel("Seleccione el tamaño del tablero : ");
        mensaje1.setBounds(80, 270, 250, 80);
        return mensaje1;
    }
    public JTextField Jug1(){
        n1 = new JTextField();
        n1.setBounds(50, 140, 150, 30); 
        return n1;
    }
    public JTextField Jug2(){
        n2 = new JTextField();
        n2.setBounds(50, 230, 150, 30); 
        return n2;
    }
    public  JComboBox Box(){
        tamTablero = new JComboBox();
        tamTablero.addItem("8");
        tamTablero.addItem("9");
        tamTablero.addItem("10");
        tamTablero.addItem("11");
        tamTablero.addItem("12");
        tamTablero.addItem("13");
        tamTablero.addItem("14");
        tamTablero.addItem("15");
        tamTablero.addItem("16");
        tamTablero.addItem("17");
        tamTablero.addItem("18");
        tamTablero.setBounds(150, 350, 70, 30);
        return tamTablero;
   }
    public JButton bSiguiente(){
        siguiente = new JButton("Siguiente");
        siguiente.setBounds(60, 420, 100, 40);
        siguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                TableroVentana tv = new TableroVentana(tamTablero.getSelectedIndex()+8, n1.getText(), n2.getText());
                VentanaOrdenar vo = new VentanaOrdenar(n1.getText(), n2.getText());
            }
        });
        return siguiente;
    }
    public JButton bSalir(){
        Salir = new JButton("Salir");
        Salir.setBounds(215, 420, 100, 40);
        Salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dispose();
            }
        });
        
        return Salir;
    }
    
    
    
    
}
