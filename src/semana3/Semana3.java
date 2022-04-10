/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana3;

import java.util.Scanner;

/**
 *
 * @author Jose Valcarcel Bravo
 */
public class Semana3 {
    
public static void main (String[] args){

Scanner teclado = new Scanner (System.in);

System.out.println("Ingrese Marca del Vehiculo: ");

String marca = teclado.next();

System.out.println("Ingrese Modelo del Vehiculo: ");

String modelo = teclado.next();

System.out.println("Ingrese Cilindrada del Vehiculo: ");

int cilindrada = teclado.nextInt();

System.out.println("Ingrese Tipo de Combustible del Vehiculo: ");

String tipo = teclado.next();

System.out.println("Ingrese Cant. Pasajeros del Vehiculo: ");

int pasajeros = teclado.nextInt();


System.out.println("La Marca que ha ingresado es: " + marca +
        "\nEl Modelo que ha ingresado es: " + modelo+ 
        "\nLa Cilindrada que ha ingresado es: " + cilindrada +
        "\nEl tipo de combustrible es: " + tipo +
        "\nTiene una capacidad de " + pasajeros + " pasajeros.");

}//cierra método main

}//cierra class
    

