package src;


public class Principal {
    public static void main(String[] args) {
        Principal principal = new Principal();
        
    }
    
    public Principal(){
        Contador c = new Contador(10,10);
        Contador c2=c;
        c2.setFinalContador(5);
        c2.setInicioContador(5);
        c2.crecimiento();
        c2.deCrecimiento();
        System.out.println("El contador llegara hasta  "+c2.getFinalContador());
        
        Cuadrado cua = new  Cuadrado(3);
        Cuadrado cua2=cua;
        cua2.setLado(5);
        cua2.calcularArea();
        cua.calcularPerimetro();
        System.out.println("El lado del cuadrado es "+cua2.getLado());
        System.out.println("Area cuadrado: "+cua.getArea());
        System.out.println("perimetro cuadrado "+cua2.getPerimetro());
        
        Circulo cir = new Circulo(3);
        Circulo cir2=cir;
        cir2.setRadio(4);
        cir.calcularArea();
        cir.calcularPerimetro();
        System.out.println("El area circulo es "+cir.getArea()+" y el perimetro es "+cir.getPerimetro());
        System.out.println("");
        
        Rectangulo r = new Rectangulo(4,3);
        Rectangulo r2=r;
        System.out.println("primeros datos ancho "+r2.getAncho()+" largo "+r2.getLargo());
        r2.setLargo(5);
        r2.setAncho(6);
        System.out.println("nuevos datos ancho "+r2.getAncho()+" largo "+r2.getLargo());
        r.calcularArea();
        r.calcularPerimetro();
        r2.mostrarResultado();
        
        Libro l1 = new Libro("El principito","Estuardo",2001);
        Libro l2=l1;
        System.out.println("Primeros datos. Libro  "+l2.getNombreLibro()+" Cliente "+l2.getCliente());
        l1.setCliente("Laura");
        l1.setNombreLibro("SEñor presidente");
        System.out.println("Cambio datos. Libro  "+l2.getNombreLibro()+" Cliente "+l2.getCliente());
        
        Fraccion f = new Fraccion(1,2,1,3);
        Fraccion f2=f;
        f2.setDenominador1(4);
        f.recibirDatos();
        f.sumar();
        f2.restar();
        f.multiplicar();
        f.dividir();
        System.out.println("");
        System.out.println("La fraccion 1 es: "+f.getFraccion1());
        System.out.println("La fraccion 2 es: "+f.getFraccion2());
        System.out.println("La el resultado de la suma es: "+f.getSuma());
        System.out.println("La el resultado de la rsta es: "+f.getResta());
        System.out.println("La el resultado de la multipilicacion es: "+f.getMultiplicacion());
        System.out.println("La el resultado de la division es: "+f.getDivision());
        System.out.println("");
        
    } 
    
}
