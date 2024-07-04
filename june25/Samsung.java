package june25;

public class Samsung extends PlayStore implements Calculator, Camera, Computer,MusicPlayer, Phone, VideoGame {
    void androidApps(){
        System.out.println("Downloading.. apps ");
    }

    @Override
    public void calculate() {
        System.out.println("Beautiful looking UI for calculator ....");
    }

    @Override
    public void takePictures() {
        System.out.println("take pictures ");
    }

    @Override
    public void surfInternet() {
        System.out.println("surf internet ");
    }

    @Override
    public void play() {
        System.out.println("Play Music ");
    }

    @Override
    public void pause() {
        System.out.println("Pause Music ");
    }

    @Override
    public void stop() {
        System.out.println("Stop Music ");
    }

    @Override
    public void makeCalls() {
        System.out.println("Make calls ");
    }

    @Override
    public void playGames() {
        System.out.println("Play Games...");
    }

}
