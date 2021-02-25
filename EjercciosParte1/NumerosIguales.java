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
public class NumerosIguales {
    public static void main(String [] args)
    {
        double a,b;
        Scanner miscanner = new Scanner(System.in);
        System.out.println("Ingrese un valor para a: ");
        a = miscanner.nextDouble();
        System.out.println("Ingrese un valor para b: ");
        b = miscanner.nextDouble();
        
        String Message = (a == b )? "Los numeros son iguales" : "Los numeros son desiguales";
        System.out.println(Message);
    }
}
