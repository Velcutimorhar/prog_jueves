/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4;
import java.util.Scanner;
/**
 *
 * @author GamingPC
 */
public class P4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int men = 0;
    int may = 0;
    int sumt = 0;
    int cont = 0;
    int sump = 0;
    int sumn = 0; 
    int med = 0;
    //int num;
    System.out.println("Introduzca un numero");//how many number you want to enter
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    if (num != -1) {
     
        //compara con el mayor
        if (num > may) {
            may = num;
        }
        //compara con el menor
        if (num < men) {
            men = num;
        }
        //suma positivo
        if (num >= 0) {
            sump = +num;
        }
        //suma negativos
        if (num < -1) {
            sumn = num;
        }
    sumt = sumt + num;  
    cont ++; 
    med = sumt/cont;
    else 
    System.out.println("el mayor es:" + may);
    System.out.println("el menor es : " + men);
    System.out.println("la suma total es " +sumt);
    System.out.println("la suma de los positivos es " + sump);
    System.out.println("la suma de los negativos es " + sumn);
    System.out.println("la media es " +med);
    }
    }
    
}
