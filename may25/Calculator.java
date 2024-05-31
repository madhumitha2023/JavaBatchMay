package may25;

import java.util.Scanner;

public class Calculator {
    static double addition(double num1, double num2)
    {

        return num1 + num2;
    }
    static double subtraction(double num1, double num2)
    {

        return num1 - num2;
    }
    static double division(double num1, double num2)
    {

        if(num2 == 0)
        {
            System.out.println("Zero division Error");
        }
        else {
            return num1/num2;
        }
        return num1/num2;
    }
    static double modulus(double num1, double num2)
    {

        return num1 % num2;
    }
    public static void main(String[] args) {
        System.out.println("*****************************");
        System.out.println("Welcome to my Calculator");
        System.out.println("*****************************");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = scan.nextDouble();
        System.out.println("Enter the operators '+,-,/,%': ");
        char operator = scan.next().charAt(0);
        System.out.println("Enter the second number: ");
        double num2 = scan.nextDouble();

        switch(operator)
        {
            case '+':{
                double result = addition(num1,num2);
                System.out.println("Addition of " + num1+" and "+ num2 + " is: "+ result);
                break;
            }
            case '-':{
                double result = subtraction(num1,num2);
                System.out.println("Subtraction of " + num1+" and "+ num2 + " is: "+ result);
                break;
            }
            case '/':{
                double result = division(num1,num2);
                System.out.println("Division of " + num1+" and "+ num2 + " is: "+ result);
                break;
            }
            case '%':{
                double result = modulus(num1,num2);
                System.out.println("Modulus of " + num1+" and "+ num2 + " is: "+ result);
                break;
            }
            default:
                System.out.println("Enter the valid operator!");

        }


    }
}
