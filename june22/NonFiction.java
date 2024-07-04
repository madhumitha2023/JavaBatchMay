package june22;

public class NonFiction extends Novel{
    public NonFiction(String name, String author, int numOfPages) {
        super(name, author, numOfPages);
    }

    @Override
    public void displayBookInfo() {
        System.out.println("This is NonFiction Book");
    }
}
