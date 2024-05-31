package may25;

import java.util.Scanner;

public class LeapYear {
    static boolean isLeapYear(int year)
    {
        if(year % 4 == 0 && year % 100 !=0 || year % 400 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = scan.nextInt();
        System.out.println(isLeapYear(year));
    }
}
