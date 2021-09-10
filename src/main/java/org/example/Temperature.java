package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Rosales
 */
public class Temperature
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        float result, temp;
        String choice;

        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.print("Press F to convert from Celsius to Fahrenheit. ");
        choice = input.next();
        choice = choice.toUpperCase();
        System.out.println("Your choice: " +choice);
        switch(choice) {
            case "C":
                System.out.print("Please enter the temperature in Fahrenheit: ");
                temp = input.nextFloat();
                result = (temp - 32) * 5 / 9;
                System.out.printf("The temperature in Celsius is %.0f.", result);
                break;
            case "F":
                System.out.print("Please enter the temperature in Celsius: ");
                temp = input.nextFloat();
                result = (temp * 9 / 5) + 32;
                System.out.printf("The temperature in Fahrenheit is %.0f.", result);
                break;
        }
    }
}
