package cuenta;
//import java.lang.Object; 
public class Cuenta {

 
  private String titular;
  private int numcta;
  private double cantidad;

 //metodos  
   public Cuenta (String titular) {
      this.titular = titular;
   }

   
   public void numCta(int numCta) {
      numcta = numCta;
   }


   public void Cantidad(double cantidad) {
      cantidad = cantidad;
   }

 
   public String toString(String mensaje) {
      return  mensaje= "El empleado se llama "+titular+" "+"con la cuenta "+numcta+"y su saldo es "+cantidad;
   }
public Cuenta(){
	this.titular="";
	this.numcta=0;
	this.cantidad=0;
}
//cosntructor
public Cuenta(String titular, int numcta, double cantidad){
this.titular=titular;
this.numcta=numcta;
this.cantidad=cantidad;


}}
