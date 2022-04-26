package practicaComic;

import imonsh.*;

public class Main {
    private static final int timePerPage = 3000;

    public static void main(String[] args) {
        Screen comicScreen = new Screen("Comic: Attack on Titan");
        comicScreen.setVisible(true);
        comicScreen.setBounds(50,50,475,650);

        Thread img = new Thread(new Paginas(comicScreen,timePerPage));
        Thread sound = new Thread(new Musica(comicScreen));


        img.start();
        sound.start();
        //dialog.start();
    }
}
