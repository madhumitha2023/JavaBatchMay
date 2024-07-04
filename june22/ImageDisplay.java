package june22;

public class ImageDisplay extends MediaDevice{
    String imageName;
    int resolution;

    public ImageDisplay(String name, String imageName, int resolution) {
        super(name);
        this.imageName = imageName;
        this.resolution = resolution;
    }

    public void displayImage()
    {
        System.out.println("Image Displayed..");
    }

    @Override
    public void displayDetails() {
        System.out.println("Image Name: " + imageName);
        System.out.println("Image Resolution: " + resolution);
    }
}
