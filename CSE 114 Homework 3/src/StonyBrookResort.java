// Daniel Garcia
// SBU ID: *********
// CSE 114
// Homework 3, Problem 2

import java.util.Scanner;

public class StonyBrookResort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int adults, children, group, days;
        double discount, adultPrice, childPrice, total, serviceCharge;
        System.out.print("Enter number of adults: ");
        adults = input.nextInt();
        System.out.print("Enter number of children: ");
        children = input.nextInt();
        System.out.print("Enter length of vacation in days: ");
        days = input.nextInt();
        System.out.print("Enter day of week that vacation starts: ");
        String start = input.next().toLowerCase();
        group = adults + children;
        discount = 0;
        serviceCharge = 0;
        childPrice = days * children * 75;
        if (days>5) discount += ((days-5) * adults * 125) * 0.25;
        adultPrice = (days * adults * 125);
        total = adultPrice + childPrice;
        System.out.printf("Total before discounts: " + "$%.2f", total);
        if (start.equals("monday") && days<=4) discount += 150;
        if (group>=6) serviceCharge = 0.05 * total;
        System.out.printf("\nDiscounts: " + "$%.2f", discount);
        System.out.printf("\nService charges: " + "$%.2f", serviceCharge);
        System.out.printf("\nGrand total: " + "$%.2f", (total - discount + serviceCharge));

    }

}
