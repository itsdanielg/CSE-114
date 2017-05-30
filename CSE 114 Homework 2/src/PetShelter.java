// Daniel Garcia
// SBU ID: *********
// CSE 114
// Homework 2, Problem 2

import java.util.Scanner;

public class PetShelter {
    public static void main(String[] args) {
        int cats, dogs, budget, price;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of cats: ");
        cats = input.nextInt();
        System.out.print("Enter number of dogs: ");
        dogs = input.nextInt();
        System.out.print("Enter weekly budget: ");
        budget = input.nextInt();
        price = budget/(cats+2*dogs);
        System.out.println("Amount to spend per dog: $" + 2*price);

    }

}
