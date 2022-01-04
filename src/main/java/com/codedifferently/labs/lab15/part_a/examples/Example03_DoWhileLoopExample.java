package com.codedifferently.labs.lab15.part_a.examples;

public class Example03_DoWhileLoopExample {
    public static void main(String[] args) {
        int i=1;
        do
        {
            if(i%2==1)
                System.out.print(" "+i);
            i++;
        }while(i<21);
    }
}
