package practicaMona;

import java.sql.SQLOutput;

public class Mona {

    private double altura;
    private static final int numeroDeBrazos = 3;
    private static final int numeroDePiernas = 2;
    private String colorPrimario, colorSecunario;


    public Mona(double _altura,String _colorPrimario, String _colorSecunario){
        System.out.println("Has invocado a un tipo de Mona");
        this.altura = _altura;
        this.colorSecunario = _colorSecunario;
        this.colorPrimario = _colorPrimario;
    }

    public Mona(){
        System.out.println("Has invocado a un tipo de Mona");
    }

    public int getNumeroDeBrazos(){
        return numeroDeBrazos;
    }

    public int getNumeroDePiernas(){
        return numeroDePiernas;
    }

    public void vestirse(){
        System.out.println("Poniendome ropa");
    }

    public void caminar(){
        System.out.println("Yo puedo caminar");
    }

    public void saltar(){
        System.out.println("Puedo brincar");
    }

    public void saludar(){
        System.out.println("Hola mi amigo de Innovaccion Virtual");
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecunario() {
        return colorSecunario;
    }

    public void setColorSecunario(String colorSecunario) {
        this.colorSecunario = colorSecunario;
    }
}
