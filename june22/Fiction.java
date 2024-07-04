package june22;

public class Fiction extends Novel{
    private String fict;
    public Fiction(String name, String author, int numOfPages) {
        super(name, author, numOfPages);
    }

    public String getFict() {
        return fict;
    }

    public void setFict(String fict) {
        this.fict = fict;
    }

    @Override
    public String toString() {
        return "Fiction{" +
                "fict='" + fict + '\'' +
                '}';
    }
}
