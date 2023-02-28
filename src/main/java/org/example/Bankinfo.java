package org.example;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Bankinfo {

        String name;
        long accno;
        double balance;
        Scanner bankinputobject =new Scanner(System.in);
        Logger l = Logger.getLogger("kawin");
        Bankinfo(String name,long accno)
        {
            this.name=name;
            this.accno=accno;
            balance=0;
        }

        void deposit()
        {
            l.info("Enter Deposit amount:");
            int deposit = bankinputobject.nextInt();
            this.balance = balance+deposit;
            curBal();
        }

        void withdrawl()
        {
            l.info("Enter withdrawl amount:");
            int withdrawl = bankinputobject.nextInt();
            if(withdrawl<=balance)
            {
                this.balance = balance-withdrawl;
            }
            else
            {
                l.log(Level.INFO,()-> "Access denied, current balance is "+ balance + "\nEnter less than balance amount..");
                if(balance>0)
                {
                    withdrawl();
                }

            }
            curBal();
        }
        void curBal()
        {

            l.log(Level.INFO, ()->"Current Balance :"+balance);
        }
        void display()
        {
            l.log(Level.INFO  , ()->"Name:"+name+"\nAccount number "+accno+ "\nBalance "+balance);
        }

    }
