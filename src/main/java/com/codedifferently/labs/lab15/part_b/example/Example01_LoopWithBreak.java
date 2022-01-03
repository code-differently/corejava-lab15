package com.codedifferently.labs.lab15.part_b.example;

import java.util.Scanner;

public class Example01_LoopWithBreak {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numInputs = 10;
        int input = 0;
        int sum = 0;
        int stopLoop = 999;
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < numInputs; i++) {
            input = in.nextInt();
            if (input == stopLoop) {
                break;
            } else {
                sum += input;
            }
        }
        System.out.println("The sum of the numbers: " + sum);
    }
}
