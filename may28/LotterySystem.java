package may28;

import java.util.Scanner;

public class LotterySystem {
    public static void main(String[] args) {
        int lottery = 55;
        Scanner scan = new Scanner(System.in);
        int chances = 3;
        while(chances!=0)
        {
            System.out.println("Enter the number from 1-100: ");
            int num = scan.nextInt();
            if(lottery == num)
            {
                System.out.println("Congrats! you Won!");
                break;
            }
            else
            {
                chances--;
                System.out.println("You have got " + chances+ " chances");
            }
        }
        System.out.println("you lose!");


    }
}
