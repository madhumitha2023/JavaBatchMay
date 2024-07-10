package july6;

public class BoxMain {
    public static void main(String[] args) {
        Box<Integer, String> box = new Box(102,"Madhu");

        System.out.println(box.item1);
        System.out.println(box.item2);
    }
}
