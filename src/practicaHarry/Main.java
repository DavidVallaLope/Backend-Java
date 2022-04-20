package practicaHarry;

public class Main {
    public static void main(String[] args) {
        Hechicero h1 = new Hechicero();
        Hechicero h2 = new Hechicero();
        Hechicero h3 = new Hechicero();
        Hechicero h4 = new Hechicero();
        Hechicero h5 = new Hechicero();

        h1.setNombre("Severus Snape");
        h1.setBoggart("Lord Voldemort");
        h1.setGenero("Masculino");
        h1.setCasa("Slytherin");
        h1.setPatronus("Ciervo");

        System.out.println(h1.toString());

        h2.setNombre("Albus Dumbledore");
        h2.setBoggart("El cuerpo de Ariana (su hermana)");
        h2.setGenero("Masculino");
        h2.setCasa("Gryffindor");
        h2.setPatronus("Fenix");

        System.out.println(h2.toString());

        h3.setNombre("Harry Potter");
        h3.setBoggart("Dementores");
        h3.setGenero("Masculino");
        h3.setCasa("Gryffindor");
        h3.setPatronus("Ciervo");

        System.out.println(h3.toString());

        h4.setNombre("Tom Riddle");
        h4.setBoggart("Su propio cuerpo");
        h4.setGenero("Masculino");
        h4.setCasa("Slytherin");
        h4.setPatronus("No tiene");

        System.out.println(h4.toString());

        h5.setNombre("Hermione Granger");
        h5.setBoggart("El Fracaso");
        h5.setGenero("Femenino");
        h5.setCasa("Gryffindor");
        h5.setPatronus("Nutria");

        System.out.println(h5.toString());
    }
}
