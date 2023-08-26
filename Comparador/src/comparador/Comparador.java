/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparador;

import java.util.Scanner;

/**
 *
 * @author Lucho
 */
public class Comparador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        var primer_numero = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        var segundo_numero = sc.nextInt();
        
        if(primer_numero > segundo_numero){
            System.out.println("El numero mayor es: " + primer_numero);
        }else{
            System.out.println("El numero mayor es: " + segundo_numero);
        }
    }
    
}
