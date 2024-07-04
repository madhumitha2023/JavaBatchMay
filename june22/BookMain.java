package june22;

public class BookMain {
    public static void main(String[] args) {
        Fiction fict = new Fiction("The Palace of Illusions", "Chitra Banerjee", 200);
        NonFiction nFict = new NonFiction("Knife", "Salmaan", 120);
        Audio au = new Audio("Magic Tree House", "Mary Pope", 100, 120);
        Ebook ebook = new Ebook("The Secret Garden", "Burnett", 100, 200);

        fict.displayBookInfo();
        fict.setFict("Kids");
        System.out.println(fict);
        nFict.displayBookInfo();
        au.setStory("Bed Time");
        System.out.println(au);
        System.out.println(ebook);

    }

}
