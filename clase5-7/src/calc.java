
public class calc {
    //Propiedades
    static int add;
    static int sub;
    static int mb;
    static int dv;
    
 
    //Constructor
    public calc(int sum, int res, int mul, int div) {
       add = sum;
       sub = res;
       mb = mul;
       dv = div;
    }
    
    //Métodos - getters&setters
 
    public void setAdd(int suma) {
    	add = suma;
    }
 
    public int getAdd() {
        return add;
    }
    public void setSub(int resta) {
    	sub = resta;
    }
 
    public int getSub() {
        return sub;
    }
    public void setMb(int mult) {
    	mb = mult;
    }
 
    public int getMb() {
        return mb;
    }
    public void setDv(int div) {
    	dv = div;
    }
 
    public int getDv() {
        return dv;
    }
}

