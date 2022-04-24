package practicaMultiverse;

import java.awt.*;

public class PeterParker extends Spiderman implements Habilidades{

    PeterParker(){
        super(
                "20597e",
                "ce3029",
                "Spider-man",
                "Masculino",
                "Peter Parker"
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
