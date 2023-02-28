package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.*;

public class Bank {

    public static void main(String [] args)
    {
        Scanner inputobject = new Scanner(System.in );
        Logger l = Logger.getLogger("kawin");
        l.info("Enter name:");
        String name=inputobject.nextLine();
        long accno=0;
        try
        {
            l.info("Enter Account number:");
            accno=inputobject.nextLong();
        }
        catch (InputMismatchException ex) {
            l.info(String.valueOf(ex));
        }
        Bankinfo inputobj = new Bankinfo(name,accno);

        boolean inc = true;

        while(inc)
        {
            l.info(" 1 Deposit \n 2 Withdrawl \n 3 Balance \n 4 Exit");
            int choice = inputobject.nextInt();
            switch (choice) {
                case 1 -> inputobj.deposit();
                case 2 -> inputobj.withdrawl();
                case 3 -> inputobj.display();
                case 4 -> inc = false;
                default -> l.info("invalid choice");
            }

        }
    }
}
