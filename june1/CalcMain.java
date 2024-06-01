package june1;

import java.util.Scanner;

public class CalcMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean running = true;


        while(running)
        {
            System.out.println("************************************************");
            System.out.println("********Welcome to My Calculator****************");
            System.out.println("************************************************");
            System.out.println("Please Select your options: ");
            System.out.println("Press 1: Addition ");
            System.out.println("Press 2: Subtraction ");
            System.out.println("Press 3: Multiplication ");
            System.out.println("Press 4: Division ");
            System.out.println("Press 5: Exit ");
            int option = scan.nextInt();
            Calculator obj = new Calculator();

            switch(option)
            {
                case 1: obj.sum();
                break;
                case 2: obj.diff();
                break;
                case 3: obj.mul();
                break;
                case 4: obj.div();
                break;
                case 5:
                    System.out.println("Exited");
                    running = false;
                    break;
                default:
                    System.out.println("Enter valid input");
            }
        }

    }
}
