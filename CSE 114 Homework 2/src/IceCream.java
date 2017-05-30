// Daniel Garcia
// SBU ID: *********
// CSE 114
// Homework 2, Problem 1

import java.util.Scanner;

public class IceCream{
    public static void main(String[] args) {
        int radius, height;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of ice cream and cone (in inches): ");
        radius = input.nextInt();
        System.out.print("Enter height of cone (in inches): ");
        height = input.nextInt();
        double volume = (3.14*radius*radius*height)/3 + (2*3.14*radius*radius*radius)/3;
        System.out.println("Volume of ice cream (in cubic inches): " + volume);
    }
}
