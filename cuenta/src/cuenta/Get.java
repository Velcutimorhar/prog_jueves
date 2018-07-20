package cuenta;

public class Get {
	public static void main(String args[]) {
	      /* Create two objects using constructor */
	      Cuenta CTA1 = new Cuenta("Juan Perez", 00001, 599 );
	      Cuenta CTA2 = new Cuenta("John Doe", 00002, 699);

	      // Invoking methods for each object created
	      System.out.println(CTA1.toString());
	      System.out.println(CTA2.toString());
	   }
}