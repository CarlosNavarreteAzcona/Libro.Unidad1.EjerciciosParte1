/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.Unidad1.EjercciosParte1;

import java.util.Scanner;

/**
 *
 * @author Carlos Navarrete
 */
public class Circunferencia {
    public static void main(String [] args)
    {
        double circunferencia, radio;
        Scanner miscanner = new Scanner(System.in);
        System.out.println("Ingrese un valor para el radio: ");
        radio = miscanner.nextDouble();
        
        //area = 3.1416 * (radio * radio);
        circunferencia = 2 * Math.PI * radio;
        
        System.out.println("El area es " + circunferencia); 
    }
}
