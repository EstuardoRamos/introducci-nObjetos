package src;

import java.util.Scanner;

//Ejercicio4
public class Rectangulo {

    public static void main(String[] args) {
        Rectangulo r = new Rectangulo();
        r.pedirDatosYVerificar();
        r.calcularArea();
        r.calcularPerimetro();
        r.mostrarResultado();

    }
    private int ancho, largo, perimetro, area;
    Scanner scanner = new Scanner(System.in);

    public Rectangulo(int ancho, int largo) {
        this.ancho = ancho;
        this.largo = largo;
    }

    public Rectangulo() {
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void calcularArea() {
        area = ancho * largo;
    }

    public void calcularPerimetro() {
        perimetro = 2 * ancho + 2 * largo;
    }

    public void mostrarResultado() {
        System.out.println("");
        System.out.println("El area del rectangulo es: " + area);
        System.out.println("El perimetro del rectangulo es " + perimetro);
    }

    public void pedirDatosYVerificar() {
        do {
            System.out.print("Ingrese Ancho: ");
            ancho = scanner.nextInt();
            System.out.print("Ingrese largo: ");
            largo = scanner.nextInt();
            if (ancho == largo) {
                System.out.println("Error numeros iguales");

            }
        } while (largo == ancho);

        Rectangulo r = new Rectangulo(ancho, largo);
    }
}

