/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Darlin
 */
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mensaje; //guardará el mensaje
        String mensajeEncriptado; 
        String mensajeDesencriptado;
        char array[]; //almacenar el string
        
        mensaje = JOptionPane.showInputDialog("Ingrese el mensaje a encriptar: ");
        
        array = mensaje.toCharArray(); //convertir en char array
        
        for (int i = 0; i < array.length; i++) {
            //llave
            array[i]= (char)(array[i]+ (char)6);//iterar el mensaje y convertirlo en codigo ascii
        }                                       //posicion 6 cambiará 
        mensajeEncriptado = String.valueOf(array); 
        System.out.println("Escribió " + mensaje);
        System.out.println("Mensaje encriptado: " + mensajeEncriptado);
        
        for (int i = 0; i < array.length; i++) {
            
            array[i]= (char)(array[i] - (char)6);//iterar el mensaj
        }
        mensajeDesencriptado = String.valueOf(array);
        System.out.println("Mensaje desencriptado: " + mensajeDesencriptado);
    }
    
}
