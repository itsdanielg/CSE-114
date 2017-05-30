// Daniel Garcia
// SBU ID: *********
// CSE 114
// Homework 2, Problem 3

import java.util.Scanner;

public class GreekMoney {
    public static void main(String[] args) {
        int obolus;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of oboloi: ");
        obolus = input.nextInt();
        System.out.println("That number of oboloi is equal to: ");
        System.out.println(obolus/(60*70*6) + " talents");
        obolus %= (60*70*6);
        System.out.println(obolus/(70*6) + " minae");
        obolus %= (70*6);
        System.out.println(obolus/6 + " drachmae");
        System.out.println(obolus%6 + " oboloi");

    }

}
