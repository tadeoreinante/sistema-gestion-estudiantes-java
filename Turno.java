
/**
 * Clase Turno, representa un turno dentro del sistema de clinica
 * relacionando un paciente con una fecha y horario.
 * 
 * @author Tadeo Reinante
 * @version 21/04/26
 */
public class Turno
{
    // instance variables 
    private Paciente paciente;
    private String fechaTurno;
    private String horaTurno;
    private String motivoTurno;
    
    /**
     * Constructor de objetos de la clase Turno
     */
    public Turno(Paciente paciente, String fechaTurno, String horaTurno, String motivoTurno)
    {
        // initialise instance variables
        if (paciente == null) {
            throw new IllegalArgumentException("El paciente no puede ser null");
        }
        if (fechaTurno == null || fechaTurno.trim().isEmpty()) {
            throw new IllegalArgumentException("Fecha invalida");
        }
        if (horaTurno == null || horaTurno.trim().isEmpty()) {
            throw new IllegalArgumentException("Hora invalida");
        }
        if (motivoTurno == null || motivoTurno.trim().isEmpty()) {
            throw new IllegalArgumentException("Motivo invalido");
        }
        this.paciente = paciente;
        this.fechaTurno = fechaTurno.trim();
        this.horaTurno = horaTurno.trim();
        this.motivoTurno = motivoTurno.trim();
    }
    
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        if (paciente == null) {
            throw new IllegalArgumentException("El paciente no puede ser null");
        }
        this.paciente = paciente;
    }
    
    public String getFechaTurno() {
        return fechaTurno;
    }
    public void setFechaTurno(String fechaTurno) {
        if (fechaTurno == null || fechaTurno.trim().isEmpty()) {
            throw new IllegalArgumentException("Fecha inválida");
        }
        this.fechaTurno = fechaTurno.trim();
    }
    
    public String getHoraTurno() {
        return horaTurno;
    }
    public void setHoraTurno(String horaTurno) {
        if (horaTurno == null || horaTurno.trim().isEmpty()) {
            throw new IllegalArgumentException("Hora inválida");
        }
        this.horaTurno = horaTurno.trim();
    }
    
    public String getMotivoTurno() {
        return motivoTurno;
    }
    public void setMotivoTurno(String motivoTurno) {
        if (motivoTurno == null || motivoTurno.trim().isEmpty()) {
            throw new IllegalArgumentException("Motivo inválido");
        }
        this.motivoTurno = motivoTurno.trim();
    }
    
    @Override
    public String toString() {
        return "----- TURNO -----\n" +
           paciente + "\n" +
           "Fecha: " + fechaTurno + "\n" +
           "Hora: " + horaTurno + "\n" +
           "Motivo: " + motivoTurno;
    }
}