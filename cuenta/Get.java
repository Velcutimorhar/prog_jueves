package cuenta;

public class Get {
	public static void main(String args[]) {
	      /* Cuentas */
	      Cuenta CTA1 = new Cuenta("Juan Perez", 111111, 599.10 );
	      Cuenta CTA2 = new Cuenta("John Doe", 222222, 699);

	
	      
	      // informacion de cuenta
	      System.out.println(CTA1.toString());
	     // System.out.println(CTA2.toString());
	      
	      double cantidadd = 500.10;
	      System.out.println("Se deposito "+cantidadd);
	      CTA1.deposito(cantidadd);
	      System.out.println("-------------------------------------------------");
	      System.out.println(CTA1.toString());
	      System.out.println("-------------------------------------------------");
	      double cantidadr = 100.10;
	      System.out.println("Se retiro "+cantidadr);
	      CTA1.retiro(cantidadr);
	      System.out.println("-------------------------------------------------");
	      System.out.println(CTA1.toString());
	   }
}