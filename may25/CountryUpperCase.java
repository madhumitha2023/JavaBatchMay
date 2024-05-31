package may25;

import java.util.Scanner;

public class CountryUpperCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Country name: ");
        String country = scan.next();

        switch(country)
        {
            case "India":
                System.out.println(country.toUpperCase());
                break;
            case "Canada":
                System.out.println(country.toUpperCase());
                break;
            case "North America":
                System.out.println(country.toUpperCase());
                break;
            default:
                System.out.println("Enter valid input");
        }
    }
}
