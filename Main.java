import java.util.*;

/**
 * Permite al usuario interactuar con el sistema de turnos
 * mediante un menú en consola.
 * 
 * @author Tadeo Reinante
 * @version 24/01/26
 */
public class Main
{
    /**
     * Constructor de objetos de la clase Main
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        SistemaTurnos sistema = new SistemaTurnos();
        int opcion = 0;
        
        while (opcion != 4) {
            System.out.println("");
            System.out.println("Bienvenido a la clinica! A continuacion, les dejamos el menu de opciones");
            System.out.println("");
            System.out.println("1. Crear turno");
            System.out.println("2. Mostrar turnos");
            System.out.println("3. Cancelar turno");
            System.out.println("4. Salir");
            
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch (opcion) {
                case 1:
                try {
                    System.out.println("Le vamos a solicitar los datos de paciente...");
                    System.out.println("Ingrese nombre del paciente");
                    String nombre = sc.nextLine();
                    
                    System.out.println("Ingresa tu DNI");
                    int dni = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println("Ingrese un numero de telefono");
                    String telefono = sc.nextLine();
                    
                    Paciente persona = new Paciente(nombre, dni, telefono);
                    
                    System.out.println("Que fecha quisiera agendar su turno?");
                    String fechaTurno = sc.nextLine();
                    
                    System.out.println("A que hora desea agendar su turno?");
                    String horaTurno = sc.nextLine();
                    
                    System.out.println("Cual es el motivo?");
                    String motivo = sc.nextLine();
                    
                    Turno turno = new Turno(persona, fechaTurno, horaTurno, motivo);
                    
                    sistema.crearTurno(turno);
                    System.out.println("Turno creado correctamente! Nos vemos pronto");
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                    break;
                case 2:
                    sistema.mostrarTurnos();
                    break;
                    
                case 3: 
                    System.out.println("Para cancelar su turno, le vamos a pedir la fecha");
                    String fecha1 = sc.nextLine();
                    
                    System.out.println("Tambien la hora...");
                    String hora1 = sc.nextLine();
                    
                    Paciente pacienteDummy = new Paciente("Tadeo", 46296499, "3425512435");
                    Turno turnoDummy = new Turno(pacienteDummy, fecha1, hora1, "x");
                    
                    sistema.cancelarTurno(turnoDummy);
                    break;
                    
                case 4:
                    System.out.println("Gracias por visitar!");
                    break;
                default: 
                    System.out.println("Opcion invalida!");
            }
        }
    }
}
