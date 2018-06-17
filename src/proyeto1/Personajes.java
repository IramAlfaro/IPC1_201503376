/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyeto1;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author irams
 */
public class Personajes {
    
    public ImageIcon imagper;
    
    public ImageIcon ImagenBombas(int tamT){
        ImageIcon per= new ImageIcon(getClass().getResource("/Imagenes/bomba.jpg"));
        Image per1 = per.getImage();
        Image imgtam = per1.getScaledInstance(600/tamT, 600/tamT, Image.SCALE_SMOOTH);
        per=new ImageIcon(imgtam);
        return per;  
    }
    public ImageIcon ImagenVidas(int tamT){
        ImageIcon per= new ImageIcon(getClass().getResource("/Imagenes/corazon.jpg"));
        Image per1 = per.getImage();
        Image imgtam = per1.getScaledInstance(600/tamT, 600/tamT, Image.SCALE_SMOOTH);
        per=new ImageIcon(imgtam);
        return per;  
    }
    public ImageIcon ImagenCaballero1(int tamT){
        ImageIcon per= new ImageIcon(getClass().getResource("/Imagenes/caballero.jpg"));
        Image per1 = per.getImage();
        Image imgtam = per1.getScaledInstance(600/tamT, 600/tamT, Image.SCALE_SMOOTH);
        per=new ImageIcon(imgtam);
        return per;  
    }
    public ImageIcon ImagenMago1(int tamT){
        ImageIcon per= new ImageIcon(getClass().getResource("/Imagenes/mago.jpg"));
        Image per1 = per.getImage();
        Image imgtam = per1.getScaledInstance(600/tamT, 600/tamT, Image.SCALE_SMOOTH);
        per=new ImageIcon(imgtam);
        return per;  
    }
    public ImageIcon ImagenPrincesa1(int tamT){
        ImageIcon per= new ImageIcon(getClass().getResource("/Imagenes/princesa.jpg"));
        Image per1 = per.getImage();
        Image imgtam = per1.getScaledInstance(600/tamT, 600/tamT, Image.SCALE_SMOOTH);
        per=new ImageIcon(imgtam);
        return per;  
    }
    public ImageIcon ImagenCaballero2(int tamT){
        ImageIcon per= new ImageIcon(getClass().getResource("/Imagenes/caballero2.jpg"));
        Image per1 = per.getImage();
        Image imgtam = per1.getScaledInstance(600/tamT, 600/tamT, Image.SCALE_SMOOTH);
        per=new ImageIcon(imgtam);
        return per;  
    }
    public ImageIcon ImagenMago2(int tamT){
        ImageIcon per= new ImageIcon(getClass().getResource("/Imagenes/mago2.jpg"));
        Image per1 = per.getImage();
        Image imgtam = per1.getScaledInstance(600/tamT, 600/tamT, Image.SCALE_SMOOTH);
        per=new ImageIcon(imgtam);
        return per;  
    }
    public ImageIcon ImagenPrincesa2(int tamT){
        ImageIcon per= new ImageIcon(getClass().getResource("/Imagenes/princesa2.jpg"));
        Image per1 = per.getImage();
        Image imgtam = per1.getScaledInstance(600/tamT, 600/tamT, Image.SCALE_SMOOTH);
        per=new ImageIcon(imgtam);
        return per;  
    }
    public ImageIcon ImagenVidas0(){
        ImageIcon vida= new ImageIcon(getClass().getResource("/Imagenes/0.jpg"));
        Image per1 = vida.getImage();
        Image imgtam = per1.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        vida=new ImageIcon(imgtam);
        return vida; 
    }
    public ImageIcon ImagenVidas1(){
        ImageIcon vida= new ImageIcon(getClass().getResource("/Imagenes/1.jpg"));
        Image per1 = vida.getImage();
        Image imgtam = per1.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        vida=new ImageIcon(imgtam);
        return vida; 
    }public ImageIcon ImagenVidas2(){
        ImageIcon vida= new ImageIcon(getClass().getResource("/Imagenes/2.jpg"));
        Image per1 = vida.getImage();
        Image imgtam = per1.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        vida=new ImageIcon(imgtam);
        return vida; 
    }public ImageIcon ImagenVidas3(){
        ImageIcon vida= new ImageIcon(getClass().getResource("/Imagenes/3.jpg"));
        Image per1 = vida.getImage();
        Image imgtam = per1.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        vida=new ImageIcon(imgtam);
        return vida; 
    }
    public ImageIcon ImagenVidas4(){
        ImageIcon vida= new ImageIcon(getClass().getResource("/Imagenes/4.jpg"));
        Image per1 = vida.getImage();
        Image imgtam = per1.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        vida=new ImageIcon(imgtam);
        return vida; 
    }
    public ImageIcon ImagenVidas5(){
        ImageIcon vida= new ImageIcon(getClass().getResource("/Imagenes/5.jpg"));
        Image per1 = vida.getImage();
        Image imgtam = per1.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        vida=new ImageIcon(imgtam);
        return vida; 
    }
    public ImageIcon ImagenVidas6(){
        ImageIcon vida= new ImageIcon(getClass().getResource("/Imagenes/6.jpg"));
        Image per1 = vida.getImage();
        Image imgtam = per1.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        vida=new ImageIcon(imgtam);
        return vida; 
    }
    public ImageIcon ImagenVidas7(){
        ImageIcon vida= new ImageIcon(getClass().getResource("/Imagenes/7.jpg"));
        Image per1 = vida.getImage();
        Image imgtam = per1.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        vida=new ImageIcon(imgtam);
        return vida; 
    }
    public ImageIcon ImagenVidas8(){
        ImageIcon vida= new ImageIcon(getClass().getResource("/Imagenes/8.jpg"));
        Image per1 = vida.getImage();
        Image imgtam = per1.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        vida=new ImageIcon(imgtam);
        return vida; 
    }
    public ImageIcon ImagenVidas9(){
        ImageIcon vida= new ImageIcon(getClass().getResource("/Imagenes/9.jpg"));
        Image per1 = vida.getImage();
        Image imgtam = per1.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        vida=new ImageIcon(imgtam);
        return vida; 
    }
    public ImageIcon ImagenVidas10(){
        ImageIcon vida= new ImageIcon(getClass().getResource("/Imagenes/10.jpg"));
        Image per1 = vida.getImage();
        Image imgtam = per1.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        vida=new ImageIcon(imgtam);
        return vida; 
    }
    public ImageIcon ImagenVidas11(){
        ImageIcon vida= new ImageIcon(getClass().getResource("/Imagenes/11.jpg"));
        Image per1 = vida.getImage();
        Image imgtam = per1.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        vida=new ImageIcon(imgtam);
        return vida; 
    }
    public ImageIcon ImagenVidas12(){
        ImageIcon vida= new ImageIcon(getClass().getResource("/Imagenes/12.jpg"));
        Image per1 = vida.getImage();
        Image imgtam = per1.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        vida=new ImageIcon(imgtam);
        return vida; 
    }
    public ImageIcon ImagenDado1(){
        ImageIcon id1= new ImageIcon(getClass().getResource("/Imagenes/dado1.jpg"));
        Image per1 = id1.getImage();
        Image imgtam = per1.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
        id1=new ImageIcon(imgtam);
        return id1; 
    }
    public ImageIcon ImagenDado2(){
        ImageIcon id2= new ImageIcon(getClass().getResource("/Imagenes/dado2.jpg"));
        Image per1 = id2.getImage();
        Image imgtam = per1.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
        id2=new ImageIcon(imgtam);
        return id2; 
    }
    public ImageIcon ImagenDado3(){
        ImageIcon id3= new ImageIcon(getClass().getResource("/Imagenes/dado3.jpg"));
        Image per1 = id3.getImage();
        Image imgtam = per1.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
        id3=new ImageIcon(imgtam);
        return id3; 
    }
    public ImageIcon ImagenDado4(){
        ImageIcon id4= new ImageIcon(getClass().getResource("/Imagenes/dado4.jpg"));
        Image per1 = id4.getImage();
        Image imgtam = per1.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
        id4=new ImageIcon(imgtam);
        return id4; 
    }
    public ImageIcon ImagenDado5(){
        ImageIcon id5= new ImageIcon(getClass().getResource("/Imagenes/dado5.jpg"));
        Image per1 = id5.getImage();
        Image imgtam = per1.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
        id5=new ImageIcon(imgtam);
        return id5; 
    }
    public ImageIcon ImagenDado6(){
        ImageIcon id6= new ImageIcon(getClass().getResource("/Imagenes/dado6.jpg"));
        Image per1 = id6.getImage();
        Image imgtam = per1.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
        id6=new ImageIcon(imgtam);
        return id6; 
    }
}
