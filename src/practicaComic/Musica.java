package practicaComic;

import imonsh.Screen;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Musica implements Runnable{
    private Screen s;
    private MP3Player music;

    public Musica(Screen s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            MP3Player mp3Player = new MP3Player("src\\practicaComic\\AOT.mp3");
            mp3Player.play();
            System.out.printf("Now playing the music");
        }catch(Exception e){
            System.err.println(e);
        }
    }
}
