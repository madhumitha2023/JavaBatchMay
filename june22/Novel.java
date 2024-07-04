package june22;

public class Novel extends Book {

    public Novel(String name, String author, int numOfPages) {
        super(name, author, numOfPages);
    }


    @Override
    public void displayBookInfo() {
        System.out.println("This is a Novel");
    }


}
