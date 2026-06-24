package exercicointerfaces.atividademusic;

public class Smartphone implements VideoPlayer, MusicPlayer{
    @Override
    public void playVideo() {
        System.out.println("--> o smartphone esta reproduzindo o video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("--> o smartphone esta pausando o video");
    }

    @Override
    public void stopVideo() {
        System.out.println("--> o smartphone esta parando o video");
    }

    @Override
    public void playMusic() {
        System.out.println("--> o smartphone esta tocando a musica");
    }

    @Override
    public void pauseMusic() {
        System.out.println("--> o smartphone esta pausando a musica");
    }

    @Override
    public void stopMusic() {
        System.out.println("--> o smartphone esta parando a musica");
    }
}
