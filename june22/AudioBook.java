package june22;

public class AudioBook extends Book{

    int length;

    public AudioBook(String name, String author, int numOfPages, int length) {
        super(name, author, numOfPages);
        this.length = length;
    }


    @Override
    public void displayBookInfo() {
        super.displayBookInfo();
        System.out.println("This is an Audio Book");
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "length=" + length +
                '}';
    }
}
