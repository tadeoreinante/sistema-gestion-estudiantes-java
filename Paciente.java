
/**
 * Clase Paciente, representa a un paciente de clinica.
 * 
 * @author Tadeo Reinante
 * @version 21/04/26
 */
public class Paciente
{
    // instance variables 
    private String nombre;
    private int dni;
    private String telefono;
    
    /**
     * Constructor de objetos de la clase Paciente
     */
    public Paciente(String nombre, int dni, String telefono)
    {
        // initialise instance variables
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("Nombre invalido");
        }
        if (dni <= 0) {
            throw new IllegalArgumentException("el DNI debe ser mayor a 0");
        } 
        this.nombre = nombre.trim();
        this.dni = dni;
        this.telefono = telefono;
    }
    
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("Nombre invalido");
        }
        this.nombre = nombre.trim();
    }
    public void setDni(int dni) {
        if (dni <= 0) {
            throw new IllegalArgumentException("el DNI debe ser mayor a 0");
        } 
        this.dni = dni;
    }
    public void setTelefono (String telefono) {
        this.telefono = telefono;
    }
    
    public String getNombre () {
        return nombre;
    }
    public int getDni () {
        return dni;
    }
    public String getTelefono () {
        return telefono;
    }
    
    @Override
    public String toString() {
        return "Paciente: " + nombre + " | DNI: " + dni + " | Tel: " + telefono;
    }
}