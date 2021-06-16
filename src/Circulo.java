package src;

import java.util.Scanner;

//Ejercico3
public class Circulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio: ");
        int radio = scanner.nextInt();

        Circulo cir = new Circulo(radio);
        cir.calcularArea();
        cir.calcularPerimetro();
        System.out.println("El area del circulo es " + cir.getArea());
        System.out.println("El perimetro del ciculo es " + cir.getPerimetro());
    }

    private int radio;
    private float area;
    private double perimetro;

    public Circulo(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public void calcularArea() {
        area = (float) ((Math.pow(radio, 2)) * (Math.PI));
    }

    public void calcularPerimetro() {
        perimetro = 2 * (Math.PI) * radio;
    }

}

