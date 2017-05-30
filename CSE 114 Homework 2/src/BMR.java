// Daniel Garcia
// SBU ID: *********
// CSE 114
// Homework 2, Problem 4

import java.util.Scanner;

public class BMR {
    public static void main(String[] args) {
        double weight, height, age, maleBMR, femaleBMR;
        final double man = 5, woman = -161;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the person's weight in pounds: ");
        weight = input.nextDouble();
        System.out.print("Enter the person's height in inches: ");
        height = input.nextDouble();
        System.out.print("Enter the person's age: ");
        age = input.nextDouble();
        maleBMR = 10*(weight/2.2046226218) + 6.25*(height*2.54) - 5*age + man;
        femaleBMR = 10*(weight/2.2046226218) + 6.25*(height*2.54) - 5*age + woman;
        System.out.printf("BMR for a man: " + "%.6f\n", maleBMR);
        System.out.printf("BMR for a woman: " + "%.6f", femaleBMR);
    }

}
