package com.codejd;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random ran = new Random(500);
        int secretNumber = ran.nextInt(500);
        int myNumber;
        int i = 0;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("What is your guess");
            myNumber = in.nextInt();
            if (myNumber > secretNumber) {
                System.out.println(myNumber + " is too big");
                i++;
            } else if (myNumber < secretNumber) {
                System.out.println(myNumber + " is too small");
                i++;
            }
        } while (myNumber != secretNumber);
        System.out.println("You win in "+i+" tries. Congratulation!!!");
    }
}