
package src;


public class Fraccion {
    public static void main(String[] args) {
        Fraccion f = new Fraccion(1,2,1,3);
        f.recibirDatos();
        f.sumar();
        f.restar();
        f.multiplicar();
        f.dividir();
        System.out.println("La fraccion 1 es: "+f.getFraccion1());
        System.out.println("La fraccion 2 es: "+f.getFraccion2());
        System.out.println("");
        System.out.println("La el resultado de la suma es: "+f.getSuma());
        System.out.println("La el resultado de la rsta es: "+f.getResta());
        System.out.println("La el resultado de la multipilicacion es: "+f.getMultiplicacion());
        System.out.println("La el resultado de la division es: "+f.getDivision());
        System.out.println("");
        
    }
    
    private int numerador1;
    private int denominador1;
    private int numerador2;
    private int denominador2;
    private String fraccion1=numerador1+"/"+denominador1;
    private String fraccion2=numerador2+"/"+denominador2;
    private int numResul;
    private int denResul;
    private String suma;
    private String resta;
    private String multiplicacion;
    private String division;
  

    public Fraccion(int numerador1, int denominador1, int numerador2, int denominador2) {
        this.numerador1 = numerador1;
        this.denominador1 = denominador1;
        this.numerador2 = numerador2;
        this.denominador2 = denominador2;
    }
    public Fraccion(){
        
    }

    public int getNumerador1() {
        return numerador1;
    }

    public void setNumerador1(int numerador1) {
        this.numerador1 = numerador1;
    }

    public int getDenominador1() {
        return denominador1;
    }

    public void setDenominador1(int denominador1) {
        this.denominador1 = denominador1;
    }

    public int getNumerador2() {
        return numerador2;
    }

    public void setNumerador2(int numerador2) {
        this.numerador2 = numerador2;
    }

    public int getDenominador2() {
        return denominador2;
    }

    public void setDenominador2(int denominador2) {
        this.denominador2 = denominador2;
    }

    public String getFraccion1() {
        return fraccion1;
    }

    public void setFraccion1(String fraccion1) {
        this.fraccion1 = fraccion1;
    }

    public String getFraccion2() {
        return fraccion2;
    }

    public void setFraccion2(String fraccion2) {
        this.fraccion2 = fraccion2;
    }

    public String getSuma() {
        return suma;
    }

    public void setSuma(String suma) {
        this.suma = suma;
    }

    public String getResta() {
        return resta;
    }

    public void setResta(String resta) {
        this.resta = resta;
    }

    public String getMultiplicacion() {
        return multiplicacion;
    }

    public void setMultiplicacion(String multiplicacion) {
        this.multiplicacion = multiplicacion;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }
    public void recibirDatos(){
        fraccion1=numerador1+"/"+denominador1;
        fraccion2=numerador2+"/"+denominador2;
    }
    
    public void sumar(){
        if (denominador1==denominador2) {
            int sumaNum=numerador1+numerador2;
            numResul=sumaNum;
            denResul=denominador1;
            
        } else {
           numResul=denominador2*numerador1+denominador1*numerador2;
           denResul=denominador1*denominador2;
        }
        suma=numResul+"/"+denResul;
    }
    
    public void restar(){
        if (denominador1==denominador2) {
            int sumaNum=numerador1-numerador2;
            numResul=sumaNum;
            denResul=denominador1;
            
        } else {
           numResul=denominador2*numerador1-denominador1*numerador2;
           denResul=denominador1*denominador2;
        }
        resta=numResul+"/"+denResul;
    }
    
    public void multiplicar(){
        numResul=numerador1*numerador2;
        denResul=denominador1*denominador2;
        multiplicacion=numResul+"/"+denResul;
    }
     public void dividir(){
         numResul=numerador1*denominador2;
         denResul=denominador1*numerador2;
         division=numResul+"/"+denResul;
     }
}
