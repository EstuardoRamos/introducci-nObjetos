package src;

//Ejercicio1
public class Contador {

    private int inicioContador;
    private int finalContador;

    public static void main(String[] args) {
        Contador c = new Contador(10, 10);
        Contador d = new Contador();
        c.crecimiento();
        c.deCrecimiento();
        d.setInicioContador(30);
        d.deCrecimiento();
    }

    public Contador(int inicioContador, int finalContador) {
        this.inicioContador = inicioContador;
        this.finalContador = finalContador;
    }

    public Contador() {

    }

    public Contador(final Contador c) {

    }

    public int getInicioContador() {
        return inicioContador;
    }

    public void setInicioContador(int inicioContador) {
        this.inicioContador = inicioContador;
    }

    public int getFinalContador() {
        return finalContador;
    }

    public void setFinalContador(int finalContador) {
        this.finalContador = finalContador;
    }

    public void crecimiento() {
        int cont = 0;
        System.out.println("Creciminto");
        for (int i = 0; i < finalContador; i++) {
            cont += 1;
            System.out.println(cont);
        }
    }

    public void deCrecimiento() {
        System.out.println("Decrecimiento");
        int cont = inicioContador;
        for (int i = 0; i < inicioContador; i++) {
            cont -= 1;
            System.out.println(cont);
        }
    }

}
