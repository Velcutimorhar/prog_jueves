package cuenta;
//import java.lang.Object; 
public class Cuenta {

 
  private String titular;
  private int numcta;
  private double saldo;
  
//Constructor
public Cuenta(String titular, int numcta, double saldo){
this.titular=titular;
this.numcta=numcta;
this.saldo=saldo;

}

 //metodos  
   public Cuenta (String titular) {
      this.titular = titular;
   }

   
   public void numCta(int numCta) {
      numcta = numCta;
   }


   public void Saldo(double Saldo) {
     saldo = Saldo;
   }

 
  public String toString() {
     return  "El empleado se llama "+titular+" "+"con la cuenta "+numcta+" y su saldo es "+saldo;
  }
   
public Cuenta(){
	this.titular="";
	this.numcta=0;
	this.saldo=0;
}


public void deposito (double cantidadd){
	if (cantidadd < 0){
		cantidadd=0;
	}else{this.saldo=saldo;}
	saldo = saldo + cantidadd;
}
public void retiro (double cantidadr){
	if (cantidadr > saldo){
		this.saldo=0;
	}else{saldo = saldo - cantidadr;}
	;
}
}


	
