package org.example;

import java.util.Scanner;
public class bank {
    static String name;
    static long accNo;
    static double balance=0;
    Scanner dep =new Scanner(System.in);
    Scanner i = new Scanner(System.in);
    Scanner s = new Scanner(System.in);
    bank()
    {
        System.out.println("Enter name:");
        name=i.nextLine();
        System.out.println("Enter Account number:");
        accNo=s.nextLong();
    }

    void deposit()
    {
        System.out.println("Enter Deposit amount:");
        int deposit = dep.nextInt();
        balance = balance+deposit;
        curBal();
    }

    void withdrawl()
    {
        System.out.println("Enter withdrawl amount:");
        int withdrawl = dep.nextInt();
        if(withdrawl<=balance)
        {
            balance = balance-withdrawl;
        }
        else
        {
            System.out.println("Access denied, current balance is "+ balance + "\nEnter less than balance amount..");
            withdrawl();
        }
        curBal();
    }
    void curBal()
    {
        System.out.println("Current Balance :"+balance);
    }
    void display()
    {
        System.out.println("Name:"+name+"\nAccount number "+accNo+ "\nBalance "+balance);
    }
    public static void main(String [] args)
    {
        bank kawin = new bank();

        Scanner a = new Scanner(System.in);
        boolean inc = true;
        while(inc)
        {
            System.out.println(" 1 Deposit \n 2 Withdrawl \n 3 Balance \n 4 Exit");
            int choice = a.nextInt();
            switch (choice) {
                case 1 -> kawin.deposit();
                case 2 -> kawin.withdrawl();
                case 3 -> kawin.display();
                case 4 -> inc = false;
            }

        }
    }
}
