package practicaMona;

public class Main {
    public static void main(String[] args) {
        NUXtocat NUXtocat = new NUXtocat();
        Sentrytocat Sentrytocat = new Sentrytocat();
        Boxertocat Boxertocat = new Boxertocat();
        Hulatocat Hulatocat = new Hulatocat();
        Surftocat Surftocat = new Surftocat();
        Minertocat Minertocat = new Minertocat();
        System.out.println("===========================");
        NUXtocat.vestirse();
        NUXtocat.saludar();
        NUXtocat.caminar();
        System.out.println("===========================");
        Sentrytocat.vestirse();
        Sentrytocat.saludar();
        Sentrytocat.caminar();
        Sentrytocat.apagarFuego();
        System.out.println("===========================");
        Boxertocat.vestirse();
        Boxertocat.saludar();
        Boxertocat.caminar();
        System.out.println("===========================");
        Hulatocat.vestirse();
        Hulatocat.caminar();
        Hulatocat.caminar();
        System.out.println("===========================");
        Surftocat.vestirse();
        Surftocat.caminar();
        Surftocat.saludar();
        Surftocat.saltar();
        System.out.println("===========================");
        Minertocat.vestirse();
        Minertocat.caminar();
        Minertocat.saludar();
        Minertocat.saltar();
        System.out.println("===========================");
    }
}
