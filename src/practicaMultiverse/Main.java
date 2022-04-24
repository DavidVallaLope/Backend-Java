package practicaMultiverse;


public class Main {
    public static void main(String[] args) {
        PeterParker peterParker = new PeterParker();
        PeterPorker peterPorker = new PeterPorker();
        GwenStacy gwenStacy = new GwenStacy();

        System.out.println("Presentando al spiderverse: " );
        System.out.println(peterParker.toString());
        System.out.println("======================================");
        System.out.println(peterPorker.toString());
        System.out.println("======================================");
        System.out.println(gwenStacy.toString());
        System.out.println("======================================");

        System.out.println("Se han encontrado con un enemigo!!!");
        System.out.println(peterParker.getNombre()+": "+peterParker.Golpe());
        System.out.println(peterPorker.getNombre()+": "+peterPorker.Patada());
        System.out.println(gwenStacy.getNombre()+": "+gwenStacy.Empujar());
    }
}

