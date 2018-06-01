/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author Ulacit
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //float n1;
       // float n2;
       // float res;
        int op = 0;
        Scanner num = new Scanner(System.in);
        System.out.print("Suma de numeros");
        System.out.print("Escriba el primer numero ");
        float n1 = num.nextFloat();
        System.out.print("Escriba el segundo numero ");
        float n2 = num.nextFloat();
        System.out.print("Escriba el numero de la operacion a realizar ");
        System.out.print("1=SUMA 2=RESTA 3=MULT 4=DIV");
        int p1 = num.nextInt();
        num.close();
        
        switch (p1){
            case 1: 
                    float res1 = n1+n2;
                    System.out.print("El resultado es : "+res1);
                    break;
            case 2: 
                    float res2 = n1-n2;
                    System.out.print("El resultado es : "+res2);
                    break;   
            case 3: 
                    float res3 = n1*n2;
                    System.out.print("El resultado es : "+res3);
                    break;        
            case 4: 
                    float res4 = n1/n2;
                    System.out.print("El resultado es : "+res4);
                    break;        
        }
    }
    
}
