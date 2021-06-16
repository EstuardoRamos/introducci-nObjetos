package src;

import java.util.Scanner;

public class Libro {

    public static void main(String[] args) {
        Libro l = new Libro("El principito", "Mario", 2000);
        l.mostrarInformacion();

    }
    private String nombreLibro;
    private boolean disponible = false;
    private String cliente;
    private int anio;
    Scanner scanner = new Scanner(System.in);

    public Libro(String nombreLibro, String cliente, int anio) {
        this.nombreLibro = nombreLibro;
        this.cliente = cliente;
        this.anio = anio;
    }

    public Libro() {

    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void prestamo() {
        System.out.println("Ingrese el numbre del libro que desea prestar: ");
        nombreLibro = scanner.next();
        System.out.println("Ingrese nombre cliente: ");
        cliente = scanner.next();
        disponible = false;
    }

    public void devolucion() {
        System.out.println("Ingrese el numbre del libro que desea devolver: ");
        nombreLibro = scanner.next();
        System.out.println("Ingrese nombre cliente: ");
        cliente = scanner.next();
        disponible = true;

    }

    public void mostrarInformacion() {
        System.out.println("Libro prestado: " + nombreLibro);
        System.out.println("Por el cliente: " + cliente);
        System.out.println("disponible: " + disponible);

    }
}
