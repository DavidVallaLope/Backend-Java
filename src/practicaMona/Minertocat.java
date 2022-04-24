package practicaMona;

public class Minertocat extends Mona{
    public Minertocat(){
        super(1.85,"1d1a25","f6caa7");
        System.out.println("Tipo de Mona invocado: Minertocat");
    }
    @Override
    public void vestirse() {
        System.out.println("Poniendome la ropa de Minero");
    }

}
