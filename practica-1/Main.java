import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import EstablecimientoDeportivo.Cancha;
import EstablecimientoDeportivo.CanchaFutbol;
import EstablecimientoDeportivo.CanchaPadel;
import EstablecimientoDeportivo.EstablecimientoDeportivo;
import EstablecimientoDeportivo.Horario;
import EstablecimientoDeportivo.Usuario;

public class Main {
    public static void main(String[] args) {
        Cancha[] canchas = new Cancha[6];
        Cancha futbol1 = new CanchaFutbol("Diego Maradona");
        Cancha futbol2 = new CanchaFutbol("Viva El futbo");
        Cancha padel1 = new CanchaFutbol("Padel 1");
        Cancha padel2 = new CanchaFutbol("Padel 2");
        Cancha padel3 = new CanchaFutbol("Padel 3");
        Cancha padel4 = new CanchaFutbol("Padel 4");
        canchas[0] = futbol1;
        canchas[1] = futbol2;
        canchas[2] = padel1;
        canchas[3] = padel2;
        canchas[4] = padel3;
        canchas[5] = padel4;
        EstablecimientoDeportivo establecimiento = new EstablecimientoDeportivo("Maradona", canchas);
        Menu(establecimiento);
    }

    public static void Menu(EstablecimientoDeportivo establecimiento){
    Scanner sc = new Scanner(System.in);
     System.out.println("Menu:");
     System.out.println("1. Solicitar Turno");
     System.out.println("2. Hacer Socio");
     System.out.println("3. Agregar Horarios");
     int opcion = sc.nextInt();
     switch (opcion) {
        case 1:
            System.out.println("SolicitarTurno");
            solicitarTurno(establecimiento);
            break;
        case 2:
            System.out.println("Hacer Socio");
            hacerSocio(establecimiento);
            break;
        case 3:
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
        System.out.println("Solicitar Turno");
        Usuario usuario = ingresarUsuario(establecimiento, scanner);
        System.out.println("Seleccione la cancha: ");
        establecimiento.mostrarCanchas();
        System.out.println("Ingrese el numero de la cancha: ");
        int indexCancha = scanner.nextInt();
        System.out.println("Ingrese una fecha");
        LocalDate fecha = ingresarFecha();
        establecimiento.getCancha(indexCancha).mostrarHorarios(fecha);
        System.out.println("Seleccione un horario: ");
        LocalTime hora = ingresarHora();
        Horario horario = establecimiento.buscarHorario(indexCancha, fecha, hora);
        establecimiento.solicitarTurno(usuario, establecimiento.getCancha(indexCancha), horario);
        Menu(establecimiento);
    }

    public static void hacerSocio(EstablecimientoDeportivo establecimiento){}

    public static void agregarHorarios(EstablecimientoDeportivo establecimiento){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione la cancha: ");
        establecimiento.mostrarCanchas();
        int indexCancha = scanner.nextInt();
        LocalDate fecha = ingresarFecha();
        LocalTime hora = ingresarHora();
        establecimiento.getCancha(indexCancha).agregarHorario(fecha, hora);
        Menu(establecimiento);
    }

    public static Usuario ingresarUsuario(EstablecimientoDeportivo establecimiento, Scanner scanner){
        System.out.println("Usuarios");
        establecimiento.mostrarUsuarios();
        System.out.println("Ingrese el nombre del usuario: ");
        String nombre = scanner.nextLine();
        Usuario usuario = establecimiento.buscarUsuario(nombre);
        if(usuario == null){
           System.out.println("El usuario no existia, se creo un nuevo usuario"); 
           return usuario = new Usuario(nombre);
        }
        else{
            return usuario;
        }

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