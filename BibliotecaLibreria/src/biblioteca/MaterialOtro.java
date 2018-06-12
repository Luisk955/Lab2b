package biblioteca;
public class MaterialOtro extends Material{
    private String descripcion;

    public MaterialOtro() {
    }

    public MaterialOtro(String descripcion, int signatura, String fechaCompra, boolean restringido, String tema) {
        super(signatura, fechaCompra, restringido, tema);
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
