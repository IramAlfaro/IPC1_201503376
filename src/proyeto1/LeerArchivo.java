/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyeto1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author irams
 */
public class LeerArchivo {
    public DatosLista[] ObtenerPersona(String archivo)throws IOException{
      String cadena="";
      DatosLista[] per = new DatosLista[]{new DatosLista("", "", 0.0, "", "", 0, 0,""),new DatosLista("", "", 0.0, "", "", 0, 0,""),new DatosLista("", "", 0.0, "", "", 0, 0,""),new DatosLista("", "", 0, "", "", 0, 0,""),new DatosLista("", "", 0, "", "", 0, 0,""),new DatosLista("", "", 0, "", "", 0, 0,""),new DatosLista("", "", 0, "", "", 0, 0,""),new DatosLista("", "", 0, "", "", 0, 0,""),new DatosLista("", "", 0, "", "", 0, 0,""),new DatosLista("", "", 0, "", "", 0, 0,"")};
      
      FileReader fr = new FileReader(archivo);
      BufferedReader br  = new BufferedReader(fr);
      int linea=0;
      while((cadena = br.readLine())!=null){
                System.out.println(cadena);
                String[] cadenap = cadena.split(",");
                per[linea]= new DatosLista(cadenap[0], cadenap[1], Double.parseDouble(cadenap[2]), cadenap[3],cadenap[4], Integer.parseInt(cadenap[5]), Integer.parseInt(cadenap[6]),cadenap[7]);
                linea++;
            }
      br.close();
      return per;
    } 
}
