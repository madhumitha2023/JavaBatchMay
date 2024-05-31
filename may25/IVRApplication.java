package may25;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class IVRApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("************************************");
        System.out.println("         Welcome to Rogers!");
        System.out.println("************************************");
        boolean running = true;
        boolean exit;


        while (running) {
            System.out.println("Please select an option for Language:");
            System.out.println("Press 1. English");
            System.out.println("Press 2. Spanish");
            int language = scan.nextInt();


            if (language == 1) {
                System.out.println("Please select the below options:");
                System.out.println("1. Customer Support");
                System.out.println("2. Cancellation");
                System.out.println("3. Escalation");
                System.out.println("4. Billing");
                System.out.println("5. Exit");
                int option = scan.nextInt();
                switch (option)
                {
                    case 1:
                        System.out.println("You selected Customer Support. Please select a sub-option:");
                        System.out.println("1. Connect online");
                        System.out.println("2. Automatic response");
                        System.out.println("3. Return to Main Menu");
                        int subop1 = scan.nextInt();
                        switch (subop1) {
                            case 1:
                                System.out.println("You selected Connecting Online. Please wait while we transfer your call.");
                                break;
                            case 2:
                                System.out.println("You selected Automatic response. Kindly check your registered email for the response.");
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Invalid selection. Returning to main menu.");
                                break;
                        }
                    case 2:
                        System.out.println("You selected Cancellation. Please select a sub-option:");
                        System.out.println("1. Confirm Cancellation");
                        System.out.println("2. Return to Main Menu");
                        int subop2 = scan.nextInt();
                        if(subop2 == 1)
                        {
                            System.out.println("Thanks for Confirming the Cancellation!");
                            System.out.println("Successfully Cancelled!");
                            break;
                        }
                        else if(subop2 == 2)
                        {
                            break;
                        }
                        else {
                        System.out.println("Select valid option. Going to main menu.");
                            break;
                        }

                    case 3:
                        System.out.println("You selected Escalation. Please select a sub-option:");
                        System.out.println("1. Escalation Online");
                        System.out.println("2. Return to Main Menu");
                        int subop3 = scan.nextInt();
                        if(subop3 == 1)
                        {
                            System.out.println("Sorry for any inconvenience. Please wait while we transfer your call.");
                            System.out.println("Call Connected!");
                            break;
                        }
                        else if(subop3 == 2)
                        {
                            break;
                        }
                        else {
                            System.out.println("Select valid option. Going to main menu.");
                            break;
                        }

                    case 4:
                        System.out.println("You selected Billing. Please select a sub-option:");
                        System.out.println("1. Current Bill");
                        System.out.println("2. Previous Bill");
                        System.out.println("3. Return to Main Menu");
                        int subop4 = scan.nextInt();
                        if(subop4 == 1)
                        {
                            System.out.println("Here is your Current Bill Status!");
                            break;
                        }
                        else if(subop4 == 2)
                        {
                            System.out.println("Here is your Previous Bill Status!");
                            break;
                        }
                        else if(subop4 == 3)
                        {
                           break;
                        }
                        else {
                            System.out.println("Select valid option. Going to main menu.");
                            break;
                        }

                    case 5:
                        do{
                            System.out.println("Do you want to continue Exit? press y/n");
                            char subop5 = scan.next().charAt(0);

                            if (subop5 == 'y')
                            {
                                exit = true;
                                running = false;
                                System.out.println("Thanks For calling Rogers! Have a great day!");
                                break;

                            }
                            else
                            {
                                exit = false;
                                break;
                            }
                        } while(exit);

                        break;



                    default:
                        System.out.println("Please select valid input!");
                }

            }
            else if(language == 2)
            {
                System.out.println("The communication will be in Spanish!");
            }
            else
            {
                System.out.println("Please enter valid option!");
            }
        }
    }
}



