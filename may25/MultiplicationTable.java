package may25;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of which you need a multiplication table: ");
        int num = scan.nextInt();
        int count = 1;
        System.out.println("The Multiplication table of "+ num + " is as below: ");

        while(count<=10)
        {
            int result = num * count;
            System.out.println(num +" * "+count+" = "+result);
            count++;
        }
    }
}
