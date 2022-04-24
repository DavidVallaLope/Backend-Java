package practicaMona;

public class Sentrytocat extends Mona{

    public Sentrytocat(){
        super(1.90,"1d1a25","f6caa7");
        System.out.println("Tipo de Mona invocado: Sentrytocat");
    }

    public void apagarFuego(){
        System.out.println("Apagando el fuego");
    }

    public void tomarManguera(){
        System.out.println("Agarrar la manguera");
    }

    @Override
    public void vestirse() {
        System.out.println("Poniendome la ropa de bombero");
    }

}
