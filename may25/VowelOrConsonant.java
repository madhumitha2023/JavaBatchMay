package may25;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char character = scan.next().charAt(0);

        if(character=='A' ||character == 'a'|| character=='E' ||character == 'e'|| character=='I' ||character == 'i'
                || character=='O' ||character == 'o'|| character=='U' ||character == 'u')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}
