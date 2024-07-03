package june11;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String orgString = scan.nextLine();
        String revString = "";
        int len = orgString.length();

        for(int i=0;i<len;i++)
        {
            revString = revString + orgString.charAt(len-1-i);
        }


        if(orgString.equals(revString))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
