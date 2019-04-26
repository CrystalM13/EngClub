package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java .util.Scanner;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
	// write your code here
        Selection();
        Choose();

    }
    public static String[] Selection()
    {
        String[] Category = {"Music", "Tech", "History", "Art"};
        for (var item: Category)
        {
            System.out.println(item.toString());
        }
        return Category;
    }
    public static String Choose()
    {      Scanner read = new Scanner(System.in);
            System.out.println("please choose a category: ");
            String choose = read.nextLine();

        switch (choose)
        {
            case "Music":
                System.out.println("you choose Music");
                Music();
                break;
            case "Tech":
                System.out.println("you choose Tech");
                break;
            case "Art":
                System.out.println("you choose History");
                break;
            case "History":
                System.out.println("you choose History");
                break;
        }


        return choose;

    }

    public static String[] Music()
    {
        Random rand = new Random();

        System.out.println("Please guess one of these  artist: ");
        String[] artist = {"jcole","Nickleback","MJ","Elvis"};
        for (var items:artist)
        {
                System.out.println(items.toString());
        }
        String select =  artist[rand.nextInt(artist.length)];
        Scanner read = new Scanner(System.in);
        String Guess = read.nextLine();

        if (Guess.equals(select))
        {
            System.out.println("you guess the right word for the music Category");
        }
        else
            {
                System.out.println("Sorry the correct answer was: " + select);
            }
        return  artist;
    }



}
