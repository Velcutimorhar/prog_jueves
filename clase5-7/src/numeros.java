import java.util.Scanner;
public class numeros {
	public static void main(String[] args) {
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
                    calc.add = (int) (n1+n2);
                    break;
            case 2: 
            	    calc.sub = (int) (n1-n2);
                    break;   
            case 3: 
            	    calc.mb = (int) (n1*n2);
                    break;        
            case 4: 
            	    calc.dv = (int) (n1/n2);
                    break;        
}	
}
}