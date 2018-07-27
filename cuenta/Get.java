package cuenta;
import java.util.Scanner; 
public class Get {
	public static void main(String args[]) {
	      /* Cuentas */
		  int dor = 0;
		  double cantidadd = 0;
		  double cantidadr = 0;
	      Cuenta CTA1 = new Cuenta("Juan Perez", 111111, 599.10 );
	      Cuenta CTA2 = new Cuenta("John Doe", 222222, 699);

	
	      
	      // informacion de cuenta
	      System.out.println(CTA1.toString());
	     // System.out.println(CTA2.toString());
	     /* double cantidadd = 500.10;
	      System.out.println("Se deposito "+cantidadd);
	      CTA1.deposito(cantidadd);
	      System.out.println("-------------------------------------------------");
	      System.out.println(CTA1.toString());
	      System.out.println("-------------------------------------------------");
	      double cantidadr = 100.10;
	      System.out.println("Se retiro "+cantidadr);
	      CTA1.retiro(cantidadr);
	      System.out.println("-------------------------------------------------");
	      System.out.println(CTA1.toString());*/
	      
	      System.out.println ("Deposito o Retiro");

	      System.out.println ("Por favor introduzca "+"1"+" para depositar o "+"2"+" para retirar:");

	        Scanner entradaEscaner = new Scanner (System.in); 
	        dor = entradaEscaner.nextInt();
	        switch (dor){
	        case 1: 
	        
	        System.out.println("Deposito de dinero");
	        System.out.println("Introduzca la cantidad a depositar");
	        Scanner entradadep = new Scanner (System.in); 
	        cantidadd = entradadep.nextDouble();
	        System.out.println("Se deposito "+cantidadd);
		    CTA1.deposito(cantidadd);
		    System.out.println("-------------------------------------------------");
		    System.out.println(CTA1.toString());
	        break;
	        case 2: 

		        System.out.println("Retiro de dinero");
		        System.out.println("Introduzca la cantidad a retirar");
		        Scanner entradaret = new Scanner (System.in); 
		        cantidadr = entradaret.nextDouble();
		        System.out.println("Se retiro "+cantidadr);
			    CTA1.retiro(cantidadr);
			    System.out.println("-------------------------------------------------");
			    System.out.println(CTA1.toString());
	break;
	        
	      
	   }
}}