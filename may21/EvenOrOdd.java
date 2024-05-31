package may21;

import jdk.nashorn.internal.parser.JSONParser;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = input.nextInt();


        if(num % 2 == 0 )
        {
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }


    }
}
