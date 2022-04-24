package practicaMultiverse;

public class PeterPorker extends Spiderman implements Habilidades{

    PeterPorker(){
        super(
                "167df5",
                "e11225",
                "Spider-Ham",
                "Masculino (Puerquito)",
                "Peter Porker"
        );
    }

    @Override
    public String treparMuro() {
        return "Trepando un muro con vello aracnido";
    }

    @Override
    public String dispararTelarana() {
        return "Dispara telarana desde su muneca";
    }

    @Override
    public String sentidoAracnido() {
        return "Alerta de peligro";
    }

    @Override
    public String Golpe() {
        return "Da un golpe con las manos";
    }

    @Override
    public String Patada() {
        return "Lanza una patada";
    }

    @Override
    public String Empujar() {
        return "Empuja con combo";
    }
}
