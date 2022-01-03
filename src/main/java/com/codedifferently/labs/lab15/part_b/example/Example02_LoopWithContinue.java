package com.codedifferently.labs.lab15.part_b.example;

public class Example02_LoopWithContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.print(i + "\t");
        }
    }
}
