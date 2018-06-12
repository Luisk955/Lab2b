package biblioteca;
import java.time.LocalDate;

public class Profesor extends Usuario{
    private String tipoContrato;
    private LocalDate fechaContratacion;

    public Profesor() {
    }

    public Profesor(String tipoContrato, LocalDate fechaContratacion, String nombre, String apellido, int id) {
        super(nombre, apellido, id);
        this.tipoContrato = tipoContrato;
        this.fechaContratacion = fechaContratacion;
    }   

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }
}
