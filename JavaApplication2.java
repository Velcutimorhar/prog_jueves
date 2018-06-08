/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Ulacit
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
// caracterisiticas faciales e iluminacion
        //ojos, nariz, boca, 
        int i, c=0;
        int cont=0;
        //int bord=0;
        String cadena, palabra="", mostrar = null;
        
        System.out.print("Reconocimiento facial"); //Si reconoce 3=ok, else check ilu 
        System.out.print("Rostro");
        cadena=br.readLine();
        cadena+="";
        Scanner num = new Scanner(System.in);
        System.out.print("Borde");
        int bord=num.nextInt();
        cadena+="";
        
        
         for(i=0;i<cadena.length();i++){
            palabra=palabra+cadena.charAt(i);
            if((cadena.charAt(i)=='o') || (cadena.charAt(i)=='b') || (cadena.charAt(i)=='n')){
                
                cont++;
                    mostrar=palabra.trim();
                }
                palabra="";
            } 
        
         switch (cont){
            case 3:         
                   System.out.println("Rostro reconocido");
                   System.out.println("caracteristcas: "+cont);
                    switch (bord){
                    case 1: 
                    
                    System.out.print("///"+cadena+"///");
                    break;
                    case 2: 
                    
                    System.out.print("/*/"+cadena+"/*/");
                    break;   
                    case 3: 
                    System.out.print("/--/"+cadena+"/--/");
                    break;        
                    case 4: 
                    System.out.print(cadena);
                    break; 
                    }
                   break;
             default: 
                   System.out.println("No detecto suficienes rasgos");
                   break;
         
         }
    }
    
}
