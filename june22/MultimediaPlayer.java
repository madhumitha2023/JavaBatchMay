package june22;

import java.util.Locale;
import java.util.Scanner;

public class MultimediaPlayer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a device you want to play: ");
        String device = scan.nextLine().toLowerCase();

        if(device.equals("audio"))
        {
            AudioPlayer ap = new AudioPlayer(device, "Bartier Cardi", "Cardi B");
            ap.play();
            ap.displayDetails();
        }

        else if(device.equals("video"))
        {
            VideoPlayer vp = new VideoPlayer(device, "abcd video", 2);
            vp.play();
            vp.displayDetails();
        }

        else if(device.equals("image"))
        {
            ImageDisplay ip = new ImageDisplay(device, "xyz image", 20);
            ip.displayImage();
            ip.displayDetails();
        }

        else
        {
            System.out.println("Enter valid device");
        }
    }
}
