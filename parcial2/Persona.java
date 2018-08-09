package parcial2;

import java.util.Random;

public class Persona //Nombre de la clase
{
    private final static char SEXO_DEF = 'H';
    public static final int SUBPESO = -1;// Nombre de cada objeto persona
    public static final int IDPESO = 0;
    public static final int SOBPESO = 1;
    
    private String nombre;
    private int edad;
    private String DNI;// Apellidos de cada objeto persona
    private char sexo;
    private double peso;
    private double altura;
   

    //Constructor
  public Persona() {
        this("", 0, SEXO_DEF, 0, 0);
    }
 
    /**
     * Constructor con 3 parametroe
     *
     * @param nombre de la persona
     * @param edad de la persona
     * @param sexo de la persona
     */
    public Persona(String nombre, int edad, char sexo) {
        this(nombre, edad, sexo, 0, 0);
    }
 
    /**
     * Constructor con 5 parametros
     *
     * @param nombre de la persona
     * @param edad de la persona
     * @param sexo de la persona
     * @param peso de la persona
     * @param altura de la persona
     */
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        generarDni();
        this.sexo = sexo;
        comprobarSexo();
    }
private void comprobarSexo() {
 
        //Si el sexo no es una H o una M, por defecto es H
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = SEXO_DEF;
        }
    }

private void generarDni() {
      
        int provincia = (int) Math.floor(Math.random()*(13-1+1)+1); 
        int tomo = (int) Math.floor(Math.random()*(9999-1+1)+1);
        int asiento = (int) Math.floor(Math.random()*(99999-1+1)+1);
     
        //Pasamos el DNI a String
        DNI = Integer.toString(provincia) + Integer.toString(tomo)+ Integer.toString(asiento) ;
    }
 
    //Método para establecer el nombre de una persona
    public void setNombre (String valornombre){
        nombre = "nombre" + valornombre; 
    }//cierre del método
    public void setPeso (double valorpeso){
        peso = valorpeso;
    }
    //Método para establecer los edad de una persona
    public void setEdad (int valoredad){
        edad = valoredad;//la edad del objeto persona adquiere el valor que contenga valoredad
    }//Cierre del método
   
    public void setAltura(double valoraltura){
        altura = valoraltura;
    }//Cierre del método
   
    public void setnumeroDNI (String valornumeroDNI){
        DNI= valornumeroDNI;
    }//Cierre del método
   public void setSexo(char sexo) {
        this.sexo = sexo;
    }
     public int calcularIMC() {
        //Calculamos el peso de la persona
        double pesoActual = peso / (Math.pow(altura, 2));
        //Segun el peso, devuelve un codigo
        if (pesoActual >= 20 && pesoActual <= 25) {
            return IDPESO;
        } else if (pesoActual < 20) {
            return SUBPESO;
        } else {
            return SOBPESO;
        }
    }
     
     public boolean esMayorDeEdad() {
        boolean mayor = false;
        if (edad >= 18) {
            mayor = true;
        }
        return mayor;
    }
    //Método para obtener el nombre del objeto persona
    @Override
    public String toString() {
        String sexo;
        if (this.sexo == 'H') {
            sexo = "hombre";
        } else {
            sexo = "mujer";
        }
        return "Informacion de la persona:\n"
                + "Nombre: " + nombre + "\n"
                + "Sexo: " + sexo + "\n"
                + "Edad: " + edad + " años\n"
                + "DNI: " + DNI + "\n"
                + "Peso: " + peso + " kg\n"
                + "Altura: " + altura + " metros\n";
    } //Cierre del método
}//Cierre de la clase
