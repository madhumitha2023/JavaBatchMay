package june8;

import java.util.Scanner;

public class Studentarray {
    public static void main(String[] args) {
        String[] students = new String[5];
        Scanner scan = new Scanner(System.in);


        for(int i=0; i< students.length; i++)
        {
            System.out.println("Enter the Student Name: ");
            students[i] = scan.next();
        }
        for(int i=0; i< students.length; i++)
        {
            System.out.println("student name: "+ students[i]);
        }
    }
}
