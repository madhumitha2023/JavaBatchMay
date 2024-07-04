package june22;

public class VideoPlayer extends MediaDevice {
    String videoTitle;
    int duration;

    public VideoPlayer(String name, String videoTitle, int duration) {
        super(name);
        this.videoTitle = videoTitle;
        this.duration = duration;
    }

    public void play()
    {
        System.out.println("Video Playing..");
    }

    @Override
    public void displayDetails() {
        System.out.println("Video Title: " + videoTitle);
        System.out.println("Video Duration: " + duration + "hrs");
    }
}
