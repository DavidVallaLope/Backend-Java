package practicaHarry;

public class Hechicero {
    private String casa,genero,nombre,boggart,patronus;

    public Hechicero(){
        this.casa = "Sin casa";
        this.genero = "";
        this.nombre = "";
        this.boggart = "";
        this.patronus = "";
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBoggart() {
        return boggart;
    }

    public void setBoggart(String boggart) {
        this.boggart = boggart;
    }

    public String getPatronus() {
        return patronus;
    }

    public void setPatronus(String patronus) {
        this.patronus = patronus;
    }

    @Override
    public String toString() {
        return "Hechicero{" +
                "casa='" + casa + '\'' +
                ", genero='" + genero + '\'' +
                ", nombre='" + nombre + '\'' +
                ", boggart='" + boggart + '\'' +
                ", patronus='" + patronus + '\'' +
                '}';
    }
}
