package june22;

public class Book {
    private String name;
    private String author;
    private int numOfPages;

    public Book(String name, String author, int numOfPages) {
        this.name = name;
        this.author = author;
        this.numOfPages = numOfPages;
    }

    public void displayBookInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + numOfPages);
    }
}
