/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Carter I. Walker
 */

package org.example;
import java.util.Scanner;
public class App 
{
    public static final int paintCoverage = 350;

    public static void main( String[] args )
    {
        //Necessary Variables
        Scanner input = new Scanner(System.in);
        int length, width, area, gallons;

        //Query for length and width
        System.out.println( "What is the length of the ceiling? (in feet)" );
        length = input.nextInt();

        System.out.println("What is the width of the ceiling? (Also in feet)");
        width = input.nextInt();

        //Calculations
        area = length * width;
        if ((area % paintCoverage) > 0)
        {
            gallons = area / paintCoverage + 1;
        }
        else
        {
            gallons = area / paintCoverage;
        }

        System.out.println("You will need to purchase " + gallons + " gallons of paint to cover " + area + " square feet");

    }
}
