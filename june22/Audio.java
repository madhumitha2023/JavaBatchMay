package june22;

public class Audio extends AudioBook{

    private String story;

    public Audio(String name, String author, int numOfPages, int length) {
        super(name, author, numOfPages, length);
    }

    @Override
    public void displayBookInfo() {
        System.out.println("This is an Audio Book");
    }

    public void setStory(String story) {
        this.story = story;
    }

    @Override
    public String toString() {
        return "Audio{" +
                "story='" + story + '\'' +
                '}';
    }
}
