package june22;

public class Ebook extends AudioBook{
    public Ebook(String name, String author, int numOfPages, int length) {
        super(name, author, numOfPages, length);
    }

    @Override
    public void displayBookInfo() {
        System.out.println("This is an EBook");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
