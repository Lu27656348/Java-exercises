/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arearectangulo;

import java.util.Scanner;

/**
 *
 * @author Lucho
 */
public class AreaRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Proporcione el ancho: ");
        int ancho = sc.nextInt();
        System.out.println("Proporcione el alto: ");
        int alto = sc.nextInt();
        
        int perimetro = (ancho + alto) * 2;
        int area = ancho * alto;
        
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }
    
}
