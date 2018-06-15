


import java.util.Scanner;
public class p33 {
	public static void main(String[] args) {
        int cont = 0;
		Scanner num = new Scanner(System.in);
        System.out.println("Ver si un numero es primo");
        System.out.println("Escriba el numero ");
        float n1 = num.nextFloat();
        
        for(int i=1;i<n1+1;i++){
            
            if(n1%i==0){
      
                cont++;
                    
                }
              
} 
        switch (cont){
        case 2: 
        
        System.out.print("Es primo");
        break;
        default: 
            System.out.println("No es primo");
        break;
        
}
}
}