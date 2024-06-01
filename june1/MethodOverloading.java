package june1;

import java.util.Scanner;

public class MethodOverloading {
    public static void student(String name)
    {
        System.out.println("Hello " +name);
    }

    public static void student(String name, String email)
    {
        System.out.println("Hello " +name + " your email is " + email);
    }

    public static void student(String name, String email, String password)
    {
        System.out.println("Hello " +name + " your email is " + email+ " and your password is: "+password);
    }

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.next();
        System.out.println("Enter your email: ");
        String email = scan.next();
        System.out.println("Enter your password: ");
        String pass = scan.next();

        student(name);
        System.out.println("Do you need your email info: press y/n");
        char op1 = scan.next().charAt(0);
        if(op1 == 'y')
        {
            student(name,email);

        }
        else {
            student(name);
        }
        System.out.println("Do you need both email info and password: press y/n");
        char op2 = scan.next().charAt(0);
        if(op2 == 'y')
        {
            student(name,email,pass);

        }
        else {
            student(name);
        }
    }
}
