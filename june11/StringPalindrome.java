package june11;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String original_str = scan.nextLine();

        int len = original_str.length();
        char[] org_str = new char[len];
        char[] rev_str = new char[len];
        for(int i=0; i<len;i++)
        {
            org_str[i] = original_str.charAt(i);
        }
        for(int i=0; i<len;i++)
        {
           rev_str[i] = original_str.charAt(len-1-i);
        }
        boolean flag = false;
        for(int i=0;i<len;i++)
        {
            if(org_str[i] == rev_str[i])
            {
                flag = true;
            }
        }

        if(flag == true);
        {
            System.out.println("Palindrome");
        }
        if(flag == false)
        {
            System.out.println("Not a Palindrome");
        }


    }
}
