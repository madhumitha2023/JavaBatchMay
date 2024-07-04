package july2;

public class ArrayException {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            arr[6] = 89;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        System.out.println("Exception is handled");
    }
}

