package may25;

import java.util.Scanner;

public class StudentReport {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Student's marks: ");
        int score = scan.nextInt();
        if(score>=90 && score <=100)
        {
            System.out.println("Grade: A");
        }
        else if(score>=80 && score <90)
        {
            System.out.println("Grade: B");
        }
        else if(score>=70 && score <80)
        {
            System.out.println("Grade: C");
        }
        else if(score>=60 && score <70)
        {
            System.out.println("Grade: D");
        }
        else
        {
            System.out.println("Grade: F");
        }

    }
}
