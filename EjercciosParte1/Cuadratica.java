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
public class Cuadratica {
    public static void main(String [] args)
    {
        double a,b,c;
        double d, x1, x2;
        Scanner miscanner = new Scanner(System.in);
        
        System.out.println("Ingrese un valor para a: ");
        a = miscanner.nextDouble();
        System.out.println("Ingrese un valor para b: ");
        b = miscanner.nextDouble();
        System.out.println("Ingrese un valor para c: ");
        c = miscanner.nextDouble();
        d = (b*b) - (-4*a*c);
        if(d<=0)
        {
            System.out.println("No existen soluciones reales.");
        }
        else
        {
            x1 = d / (2*a);
            System.out.println("La solucion es " + x1);
        }
    }
}
