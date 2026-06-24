package exercicointerfaces.atividademusic;

public class main {
    static void main(String[] args) {
        MusicPlayer musicPlayer = new Smartphone();
        VideoPlayer videoPlayer = new Smartphone();


        musicPlayer.playMusic();
        musicPlayer.pauseMusic();
        musicPlayer.stopMusic();
        System.out.println("---------------------------------------------------");
        videoPlayer.playVideo();
        videoPlayer.pauseVideo();
        videoPlayer.stopVideo();

    }
}
