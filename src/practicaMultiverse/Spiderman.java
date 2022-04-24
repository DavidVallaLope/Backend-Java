package practicaMultiverse;


public class Spiderman {
    private String trajeColorPrimario;
    private String trajeColorSecundario;
    private String nombre;
    private String genero;
    private String identidad;

    public Spiderman(){

    }

    public Spiderman(String trajeColorPrimario, String trajeColorSecundario, String nombre, String genero, String identidad) {
        this.trajeColorPrimario = trajeColorPrimario;
        this.trajeColorSecundario = trajeColorSecundario;
        this.nombre = nombre;
        this.genero = genero;
        this.identidad = identidad;
    }

    public String getTrajeColorPrimario() { return trajeColorPrimario; }
    public String getTrajeColorSecundario() { return trajeColorSecundario; }
    public String getNombre() { return nombre; }
    public String getGenero() { return genero; }
    public String getIdentidad() { return identidad; }

    public void setTrajeColorPrimario(String trajeColorPrimario) {
        this.trajeColorPrimario = trajeColorPrimario;
    }
    public void setTrajeColorSecundario(String trajeColorSecundario) {
        this.trajeColorSecundario = trajeColorSecundario;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    @Override
    public String toString() {
        return "Spiderman:\n" +
                "trajeColorPrimario='" + trajeColorPrimario + '\'' +
                "\n, trajeColorSecundario='" + trajeColorSecundario + '\'' +
                "\n, nombre='" + nombre + '\'' +
                "\n, genero='" + genero + '\'' +
                "\n, identidad='" + identidad + '\'' +
                '\n';
    }
}
