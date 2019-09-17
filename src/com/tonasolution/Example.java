package com.tonasolution;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println(result);
            getInt();
        } catch(ArithmeticException | NoSuchElementException e){
            System.out.println(e.toString());
            System.out.println("Unable to perform division, autopilot shutting down");
        }
    }

    public static int divide(){
        int x, y;

        x = getInt();
        y = getInt();
        System.out.println(" X is " + x + " Y is " + y);
        return x / y;

    }

    public static int getInt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter an integer : ");
        while(true){
            try {
                return scanner.nextInt();
            } catch(InputMismatchException im ){
                scanner.nextLine();
                System.out.println("Please enter a number using only the digits 0 to 9");
            }
        }
    }
}
