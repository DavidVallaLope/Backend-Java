package practicaMona;

public class Surftocat extends Mona{
    public Surftocat(){
        super(1.75,"1d1a25","f6caa7");
        System.out.println("Tipo de Mona invocado: Surtfocat");
    }
    @Override
    public void vestirse() {
        System.out.println("Poniendome la ropa de Surfista");
    }

}
