package src;

import java.util.Scanner;

public class Cuadrado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la medida del lado: ");
        int lado = scanner.nextInt();
        Cuadrado c = new Cuadrado(lado);
        c.calcularArea();
        c.calcularPerimetro();
        c.mostrarRespuestas();
    }

    private int lado;
    private int area;
    private int perimetro;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    public Cuadrado() {

    }

    public void calcularArea() {
        area = lado * lado;
    }

    public void calcularPerimetro() {
        perimetro = 4 * lado;
    }

    public void mostrarRespuestas() {
        System.out.println("El area es: " + area);
        System.out.println("");
        System.out.println("El perimetro es: " + perimetro);
    }

}
