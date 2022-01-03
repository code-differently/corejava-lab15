package com.codedifferently.labs.lab15.part_a.examples;

public class Example01_WhileLoopExample {
    public static void main(String[] args) {
        int num = 0;
        System.out.println("Let's count to 10!");
        while(num > 10){
            num = num + 1;
            System.out.println("Number: " + num);
        }
        System.out.println("We have counted to 10! Hurrah!");
    }
}
