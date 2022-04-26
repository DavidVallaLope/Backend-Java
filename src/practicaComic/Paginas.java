package practicaComic;

import imonsh.Screen;

public class Paginas implements Runnable{
    private Screen s;
    private int timePerPage ;

    public Paginas(Screen s, int timePerPage) {
        this.s = s;
        this.timePerPage = timePerPage;
    }

    @Override
    public void run() {
        for (int i = 1; i < 54; i++) {
            s.cls();
            String path = "./imgs/E1d4DnDLdOb-" + i + ".png";
            s.showImage(path,450,600);
            try {
                Thread.sleep(timePerPage);
            }catch(InterruptedException e){
                s.out("Couldn't read the file specified");
            }
        }
    }
}
