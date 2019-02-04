package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner read = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = read.nextInt();
        fizzbuzz(num);
    }
        public static String fizzbuzz(int number)
        {
            if(number % 15 == 0)
            {
                System.out.println("Fizzbuzz");
            }
            else if (number % 5 == 0)
            {
                System.out.println("Fizz");
            }
            else if (number % 3 == 0)
            {
                System.out.println("Buzz");
            }
            return String.valueOf(number);
        }
}
