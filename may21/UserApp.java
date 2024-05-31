package may21;

import java.util.Scanner;

public class UserApp {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First Name: ");
        String firstname = input.next();
        System.out.println("Enter the Last Name: ");
        String lastname = input.next();
        System.out.println("Enter the  Email: ");
        String email = input.next();
        System.out.println("Enter the Registration Number: ");
        int regNum = input.nextInt();

        System.out.println("User" + firstname + "is registered successfully! Check the details below:");
        System.out.println("First Name: " + firstname);
        System.out.println("Last Name: " + lastname);
        System.out.println("Email: " + email);
        System.out.println("Registration Number: " + regNum);


    }
}
