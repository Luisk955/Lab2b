package biblioteca;
public class MaterialAudio extends Material{
    private String formato = "";
    private int duracion = 0;
    private String idioma = "";

    public MaterialAudio() {
    }

    public MaterialAudio(int signatura, String fechaCompra, boolean restringido, String tema, String formato, int duracion, String idioma) {
        super(signatura, fechaCompra, restringido, tema);
        this.formato = formato;
        this.duracion = duracion;
        this.idioma = idioma;
        
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    
    
    
}
