package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String trash = "";

        // input prompt
        System.out.print("Enter your birth month [1-12]: ");

        // safe input
        if(in.hasNextInt()){
            int birthMonth = in.nextInt();
            in.nextLine();
            // correct month checking
            if(birthMonth >= 1 && birthMonth <= 12){
                System.out.print("Enter your birth month is: " + birthMonth);
            }else {
                System.out.println("You said your birth month was: " + birthMonth);
                System.out.println("Run the program again and enter a valid birth month in the range of 1 - 12!");
            }

        } else {
            trash = in.nextLine();
            System.out.println("You said your birth month was: " + trash);
            System.out.println("Run the program again and enter a valid birth month!");
        }
    }
}