package may21;

import java.util.Scanner;

public class LargerNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the Second Number: ");
        int num2 = input.nextInt();
        System.out.println("Enter the Third Number: ");
        int num3 = input.nextInt();

        if((num1>num2) && (num1>num3))
        {
            System.out.println(num1+" is greater");
        }
        else if((num2>num1) && (num2>num3))
        {
            System.out.println(num2+" is greater");
        }
        else {
            System.out.println(num3+" is greater");
        }
    }
}
