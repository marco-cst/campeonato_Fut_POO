import java.util.Scanner;

public class Jugador extends Persona {
    // Atributos
    private int numeroCamisa;
    private int faltas;
    private int numeroGoles;
    private int partidosJugados;
    private String dni;


    // Constructor
    public Jugador(String nombre, String DNI, String fechaNacimiento, int numeroCamisa) {
        super(nombre, DNI, fechaNacimiento);
        this.numeroCamisa = numeroCamisa;
        this.faltas = 0;
        this.numeroGoles = 0;
        this.partidosJugados = 0;
        this.dni = dni;
    }

    public static Jugador crearJugador(Scanner scanner) {
        System.out.println("\n\t\tCOMPLETE LOS DATOS DEL JUGADOR!");
        System.out.print("Nombre y apellido: ");
        String nombreCompleto = scanner.nextLine();
        System.out.print("DNI: ");
        String DNI = scanner.nextLine();
        System.out.print("Fecha de nacimiento (AAAA-MM-DD): ");
        String fechaNacimiento = scanner.nextLine();
        System.out.print("Número de camisa: ");
        int numeroCamisa = scanner.nextInt();
        scanner.nextLine();
        return new Jugador(nombreCompleto, DNI, fechaNacimiento, numeroCamisa);
    }


    public void imprimirEstadisticas() {
        System.out.println("Nombre y apellido: " + nombre);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
        System.out.println("DNI: " + DNI);
        System.out.println("Número de camisa: " + numeroCamisa);
    }

    // Métodos
    public void anotarGol() {
        this.numeroGoles++;
    }


    // Getters y Setters
    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public int getNumeroGoles() {
        return numeroGoles;
    }

    public void setNumeroGoles(int numeroGoles) {
        this.numeroGoles = numeroGoles;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }
}
