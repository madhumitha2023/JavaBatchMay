package june11;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
//        String name = "pragra";
//
//        char ch;
//        String rev_name = "";
//
//        for(int i=0; i<name.length();i++)
//        {
//            ch = name.charAt(i);
//            rev_name = ch+rev_name;
//        }
//
//        System.out.println(rev_name);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = scan.nextLine();
        int len = name.length();

        char[] rev_name = new char[len];

        for(int i=0;i<len;i++)
        {
            rev_name[i] = name.charAt(len-1-i);
        }
        System.out.println(rev_name);

    }
}
