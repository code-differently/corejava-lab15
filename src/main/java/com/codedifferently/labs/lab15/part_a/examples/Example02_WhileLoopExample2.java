package com.codedifferently.labs.lab15.part_a.examples;

import java.util.Scanner;

public class Example02_WhileLoopExample2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a number (-1 to quit): ");
        int num = console.nextInt();
        while (num != -1) {
            sum = sum + num;
            System.out.println("Enter a number (-1 to quit): ");
            num = console.nextInt();
        }
        System.out.println("The sum is " + sum);
    }
}