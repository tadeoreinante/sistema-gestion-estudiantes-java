import java.util.ArrayList;
/**
 * Clase Sistema encargada de gestionar los turnos de la clinica,
 * permitiendo crear, listar y eliminar turnos.
 * 
 * @author Tadeo Reinante
 * @version 21/04/26
 */
public class SistemaTurnos
{
    // instance variables 
    private ArrayList<Turno> turnos;

    /**
     * Constructor de objetos de la clase Sistema
     */
    public SistemaTurnos()
    {
        // initialise instance variables
        turnos = new ArrayList<>();
    }
    
    /**
     * Agrega un nuevo turno al sistema.
     * 
     * @param t el turno a agregar
     * @throws IllegalArgumentException si el turno es null o si ya existe
     *         un turno en la misma fecha y hora
     */
    public void crearTurno(Turno t) {
        if (t == null) {
            throw new IllegalArgumentException("El turno no puede ser null");
        }
        for (Turno existente : turnos) {
        if (existente.getFechaTurno().equals(t.getFechaTurno()) &&
            existente.getHoraTurno().equals(t.getHoraTurno())) {
            throw new IllegalArgumentException("Ya existe un turno en ese horario");
        }
        }
        turnos.add(t);
    }
    
    /**
     * Muestra por consola todos los turnos registrados en el sistema.
     * 
     * Si no hay turnos cargados, informa que la lista está vacía.
     */
    public void mostrarTurnos() {
        if (turnos.isEmpty()) {
            System.out.println("No hay turnos cargados");
        } else {
            for (Turno t : turnos) {
                System.out.println(t);
                System.out.println(); // (estetica)
            }
        }
    }
    
    /**
     * Elimina un turno del sistema según la fecha y hora del turno recibido.
     * 
     * @param x el turno a cancelar
     * 
     * Si no existen turnos cargados o no se encuentra coincidencia,
     * se informa por consola.
     */
    public void cancelarTurno(Turno x) {
        if (turnos.isEmpty()) {
            System.out.println("No hay turnos cargados");
            return;
        } else {
            for (int i = 0; i < turnos.size(); i++) {
                Turno t = turnos.get(i);
                if (t.getFechaTurno().equals(x.getFechaTurno()) &&
                    t.getHoraTurno().equals(x.getHoraTurno())) {
                    turnos.remove(i);
                    System.out.println("Se elimino correctamente");
                    return;
                } 
            }
        }
    }
}
    
