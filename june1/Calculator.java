package june1;

import java.util.Scanner;

public class Calculator {

    public void sum()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = scan.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = scan.nextDouble();

        double result = num1 + num2;
        System.out.println("Sum of "+ num1 + " and " + num2 + " is: "+ result);

    }
    public void diff()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = scan.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = scan.nextDouble();

        double result = num1 - num2;
        System.out.println("Difference of "+ num1 + " and " + num2 + " is: "+ result);

    }
    public void mul()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = scan.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = scan.nextDouble();

        double result = num1 * num2;
        System.out.println("Multiplication of "+ num1 + " and " + num2 + " is: "+ result);

    }
    public void div()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = scan.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = scan.nextDouble();

        double result = num1 / num2;
        System.out.println("Division of "+ num1 + " and " + num2 + " is: "+ result);

    }
}
