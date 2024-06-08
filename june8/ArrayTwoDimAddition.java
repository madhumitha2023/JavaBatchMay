package june8;

import java.util.Scanner;

public class ArrayTwoDimAddition {
    public static void main(String[] args) {
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        int[][] arr3 = new int[3][3];
        Scanner scan = new Scanner(System.in);

        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                arr1[i][j] = scan.nextInt();
            }
        }
        System.out.println("First Array: ");
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                arr2[i][j] = scan.nextInt();
            }
        }
        System.out.println("Second Array: ");
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                System.out.print(arr2[i][j]+ " ");
            }
            System.out.println();
        }

        for(int i=0;i<arr3.length;i++)
        {
            for(int j=0;j<arr3.length;j++)
            {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
            System.out.println();
        }
        System.out.println("Addition Array: ");

        for(int i=0;i<arr3.length;i++)
        {
            for(int j=0;j<arr3.length;j++)
            {
                System.out.print(arr3[i][j]+ " ");
            }
            System.out.println();
        }


    }
}
