/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Diego Santiago
 */


package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        String s1 = x.nextLine();
        Double num1 = null;
        try {
            num1 = Double.valueOf(s1);

        } catch (NumberFormatException exception) {
            System.out.print("Input only integers or doubles please.");
            System.exit(0);
        }
        System.out.print("What is the width of the room in feet? ");
        String s2 = x.nextLine();
        Double num2 = null;
        try {
            num2 = Double.valueOf(s2);

        } catch (NumberFormatException exception) {
            System.out.print("Input only integers or doubles please.");
            System.exit(0);
        }

        double n1 = num1;
        double n2 = num2;
        double ara = n1 * n2;
        double ftm = 0.09290304;
        double arm = ara * ftm;

        System.out.println("The area is\r\n" + ara + " square feet\r\n" + arm + " square meters");

    }
}
