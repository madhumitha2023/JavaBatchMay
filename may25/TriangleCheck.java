package may25;

import java.util.Scanner;

public class TriangleCheck {
    static void checkTriangle(int side1, int side2, int side3)
    {
        if(side1==side2 && side2==side3)
        {
            System.out.println("Equilateral Triangle");
        }
        else if (side1 == side2 || side2 == side3 || side3 == side1 )
            System.out.println("Isosceles Triangle");
        else
            System.out.println("Scalene Triangle");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of Triangle side1: ");
        int side1 = scan.nextInt();
        System.out.println("Enter length of Triangle side2: ");
        int side2 = scan.nextInt();
        System.out.println("Enter length of Triangle side3: ");
        int side3 = scan.nextInt();
        checkTriangle(side1, side2, side3);
    }
}
