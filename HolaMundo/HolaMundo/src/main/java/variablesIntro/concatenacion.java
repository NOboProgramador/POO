/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variablesIntro;

/**
 *
 * @author MR
 */
public class concatenacion {
public static void main(String arg[] ) {
String usuario="pepe";   
String saludar="Saludos";        
System.out.println("saludos"+" "+usuario);   
 
 int i=3;
 int j=5;
 System.out.println(i + j);
 //primero encuentra un cadena por lo tanto lo restante lo concatena
 System.out.println(saludar + i + j);
 //primero encuentro numeros,por lo tanto primero suma y despues concatena
 System.out.println(i + j +saludar);
}
}