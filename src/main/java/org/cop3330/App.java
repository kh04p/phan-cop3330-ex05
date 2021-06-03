package org.cop3330;

import java.util.Scanner;

//program to take 2 numbers greater than 0 and perform simple calculations
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int num1 = -1;
        int num2 = -1;

        while (num1 < 0 || num2 < 0) { //loop to make sure user enters number greater than 0
            System.out.print("What is the first number? ");
            num1 = (int) input.nextInt();
            System.out.print("What is the second number? ");
            num2 = (int) input.nextInt();
        }

        int add = math.add(num1, num2);
        int subtract = math.subtract(num1, num2);
        int multiply = math.multiply(num1, num2);
        int divide = math.divide(num1, num2);

        System.out.printf("%d + %d = %d%n%d - %d = %d%n%d * %d = %d%n%d / %d = %d%n",
                num1, num2, add, num1, num2, subtract, num1, num2, multiply, num1, num2, divide);
    }
}
