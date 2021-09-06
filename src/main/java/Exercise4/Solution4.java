/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Ihosvany Marquez
 */


package Exercise4;

import java.util.Scanner;


public class Solution4
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner (System.in);
        System.out.print("Mad Libs! \n");

        System.out.print("Enter a noun: ");
        String noun = scan.nextLine();

        System.out.print("Enter a verb: ");
        String verb = scan.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = scan.nextLine();

        System.out.print("Enter an adverb: ");
        String adverb = scan.next();

        String madLib = "The %s %s %s %s. That's hilarious!";
        System.out.printf(madLib, adjective, noun, verb, adverb);
    }
}
