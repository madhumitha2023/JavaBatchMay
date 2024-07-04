package june22;

public class AudioPlayer extends MediaDevice{
   String songName;
   String artist;

    public AudioPlayer(String name, String songName, String artist) {
        super(name);
        this.songName = songName;
        this.artist = artist;
    }

    public void play()
    {
        System.out.println("Audio Playing..");

    }

    @Override
    public void displayDetails() {
        System.out.println("Song Name: " + songName);
        System.out.println("Artist: " + artist);
    }
}
