package com.company;

import java.util.Scanner;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    public static void main(String[] args) {

        System.out.println("Enter the max N");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("The decimal number " +
                ANSI_PURPLE + Lambda.maxOneBinary(n) + ANSI_RESET +
                " : " + "The binary number " +
                ANSI_PURPLE + Integer.toBinaryString(Lambda.maxOneBinary(n)) + ANSI_RESET);
    }
}
