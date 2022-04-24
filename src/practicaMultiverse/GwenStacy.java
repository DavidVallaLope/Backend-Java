package practicaMultiverse;

public class GwenStacy extends Spiderman implements Habilidades{

    GwenStacy(){
        super(
                "f4f9fd",
                "e80887",
                "Spider-Woman",
                "Femenino",
                "Gwen Stacy"
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
