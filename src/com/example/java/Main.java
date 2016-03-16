package com.example.java;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a numeric value: ");
        String input1 = scanner.nextLine();
        double firstValue = Double.parseDouble(input1);

        System.out.print("Enter second numeric value: ");
        String input2 = scanner.nextLine();
        double secondValue = Double.parseDouble(input2);

        double sum = firstValue + secondValue;

        System.out.println("Sum: " + sum);
    }
}