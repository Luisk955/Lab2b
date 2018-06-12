package biblioteca;

public class MaterialTexto extends Material{
    private String titulo;
    private String nombreAutor;
    private String fechaPublicacion;
    private int numPaginas;
    private String idioma;

    public MaterialTexto() {
    }

    public MaterialTexto(String titulo, String nombreAutor, String fechaPublicacion, int numPaginas, String idioma, int signatura, String fechaCompra, boolean restringido, String tema) {
        super(signatura, fechaCompra, restringido, tema);
        this.titulo = titulo;
        this.nombreAutor = nombreAutor;
        this.fechaPublicacion = fechaPublicacion;
        this.numPaginas = numPaginas;
        this.idioma = idioma;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    
    
    
}
