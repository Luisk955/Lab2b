package biblioteca;

public class Estudiante extends Usuario{
    private String carrera;
    private int cantidadCreditos;

    public Estudiante() {
    }


    public Estudiante(String carrera, int cantidadCreditos, String nombre, String apellido, int id) {
        super(nombre, apellido, id);
        this.carrera = carrera;
        this.cantidadCreditos = cantidadCreditos;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getCantidadCreditos() {
        return cantidadCreditos;
    }

    public void setCantidadCreditos(int cantidadCreditos) {
        this.cantidadCreditos = cantidadCreditos;
    }
    
    
}
