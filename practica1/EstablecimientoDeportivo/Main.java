

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


public class Main {
    public static void main(String[] args) {
        Cancha[]canchas = new Cancha[3];
        Cancha cancha1 = new Cancha("Maradona", "1", 1000);
        Cancha cancha2 = new Cancha("Maradona", "2", 1000);
        Cancha cancha3 = new Cancha("Maradona", "3", 1000);
        canchas[0] = cancha1;
        canchas[1] = cancha2;
        canchas[2] = cancha3;
        EstablecimientoDeportivo establecimiento = new EstablecimientoDeportivo("Maradona", canchas, 10);
        Menu(establecimiento);
    }

    public static void Menu(EstablecimientoDeportivo establecimiento){
     Scanner sc = new Scanner(System.in);
     System.out.println("Menu:");
     System.out.println("1. Solicitar Turno");
     System.out.println("2. Agregar Horarios");
     int opcion = sc.nextInt();
     switch (opcion) {
        case 1:
            System.out.println("SolicitarTurno");
            solicitarTurno(establecimiento);
            break;
        case 2:
            System.out.println("Agregar Horarios");
            agregarHorarios(establecimiento);
        break;

        default:
            System.out.println("Saliendo");
            break;
     }
    }

    public static void solicitarTurno(EstablecimientoDeportivo establecimiento){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Nombre Usuario");
        String usuario = scanner.nextLine();
        System.out.println("Seleccione la cancha: ");
        establecimiento.mostrarCanchas();
        System.out.println("Ingrese el numero de la cancha: ");
        int indexCancha = scanner.nextInt();
        System.out.println("Ingrese una fecha");
        LocalDate fecha = ingresarFecha();
        establecimiento.getCancha(indexCancha).mostrarHorarios(fecha);
        System.out.println("Seleccione un horario: ");
        LocalTime hora = ingresarHora();
        establecimiento.sacarTurno(indexCancha, fecha, hora, usuario);
        Menu(establecimiento);
    }

    public static void agregarHorarios(EstablecimientoDeportivo establecimiento){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione la cancha: ");
        establecimiento.mostrarCanchas();
        int indexCancha = scanner.nextInt();
        LocalDate fecha = ingresarFecha();
        System.out.println("Seleccione un Rango Horario: ");
        int horaInicio = scanner.nextInt();
        int horaFin = scanner.nextInt();
        establecimiento.agregarHorario(indexCancha, horaInicio, horaFin, fecha);
        Menu(establecimiento);
    }

   

    public static LocalDate ingresarFecha() {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy"); // Define el formato esperado
        LocalDate fecha = null;

        while (fecha == null) {
            System.out.print("Ingrese una fecha (dd/MM/yyyy): ");
            String input = scanner.nextLine();

            try {
                fecha = LocalDate.parse(input, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Formato inválido. Intente de nuevo.");
            }
        }

        return fecha;
    }

    public static LocalTime ingresarHora() {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:m"); // Formato de 24 horas
        LocalTime hora = null;

        while (hora == null) {
            System.out.print("Ingrese una hora (HH:mm): ");
            String input = scanner.nextLine();

            try {
                hora = LocalTime.parse(input, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Formato inválido. Intente de nuevo.");
            }
        }

        return hora;
    }
}
