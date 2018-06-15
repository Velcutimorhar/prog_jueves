

import java.util.Scanner;
public class p1 {
	public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Calculo de precio");
        System.out.print("Escriba el precio del producto ");
        float n1 = num.nextFloat();
        double res = n1*1.21;
        System.out.print("El precio a pagar es "+res);
        
        num.close();
        
        
}
}
