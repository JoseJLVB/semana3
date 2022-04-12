/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana3;

import java.util.Scanner; //importamos clase java util para utilizar con metodo scanner

/**
 *
 * @author Jose Valcarcel Bravo
 */
public class Semana3 { //nombre de la clase
    
public static void main (String[] args){ //esto permite que la clase sea ejecutable

Scanner teclado = new Scanner (System.in); //declaramos el objeto tecladol para leer lo que se escribe en el teclado

System.out.println("Ingrese Marca del Vehiculo: "); // se pide ingresar marca y se captura lo ingresado en el teclado

String marca = teclado.next(); //se asigna a variable marca lo que se escribio en el teclado

System.out.println("Ingrese Modelo del Vehiculo: "); //se pide ingresar modelo y se captura lo ingresado en el teclado

String modelo = teclado.next(); //se asigna a variable modelo lo que se escribio en el teclado

System.out.println("Ingrese Cilindrada del Vehiculo: "); //se pide ingresar cilindrada y se captura lo ingresado en el teclado

int cilindrada = teclado.nextInt(); //se asigna a variable cilindrada lo que se escribio en el teclado

System.out.println("Ingrese Tipo de Combustible del Vehiculo: "); //se pide ingresar Tipo de combustible y se captura lo ingresado en el teclado

String tipo = teclado.next(); //se asigna a variable tipo lo que se escribio en el teclado

System.out.println("Ingrese Cant. Pasajeros del Vehiculo: "); //se pide ingresar cantidad de pasajeros y se captura lo ingresado en el teclado

int pasajeros = teclado.nextInt(); //se asigna a variable pasajeros lo que se escribio en el teclado


System.out.println("La Marca que ha ingresado es: " + marca +
        "\nEl Modelo que ha ingresado es: " + modelo+ 
        "\nLa Cilindrada que ha ingresado es: " + cilindrada +
        "\nEl tipo de combustrible es: " + tipo +
        "\nTiene una capacidad de " + pasajeros + " pasajeros."); // se imprimen en pantalla las variables y se muestra mensaje con la informacion ingresada.

}//cierra método main

}//cierra clase Semana3
    

