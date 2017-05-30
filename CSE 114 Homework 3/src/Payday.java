// Daniel Garcia
// SBU ID: *********
// CSE 114
// Homework 3, Problem 3

import java.util.Scanner;

public class Payday {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Choose employee type: (m) manager (h) hourly (c) commission (p) pieceworker: ");
        String employee = input.next().toLowerCase();
        switch (employee) {
            case "m": {
                System.out.print("Enter weekly salary: ");
                double salary = input.nextDouble();
                System.out.printf("Gross pay: " + "$%.2f", salary);
                double taxes = salary * .125;
                System.out.printf("\nTaxes: " + "$%.2f", taxes);
                System.out.printf("\nNet pay: " + "$%.2f", (salary - taxes));
                break;
            }
            case "h": {
                System.out.print("Enter hourly wage: ");
                double hourwage = input.nextDouble();
                System.out.print("Enter hours worked: ");
                double hours = input.nextDouble();
                double gross = 0;
                if (hours>35) {
                    double extra = (hours - 35) * (hourwage * 2);
                    gross = (35 * hourwage) + extra;
                }
                else gross = (hours + hourwage);
                System.out.printf("Gross pay: " + "$%.2f", gross);
                double taxes = gross * .125;
                System.out.printf("\nTaxes: " + "$%.2f", taxes);
                System.out.printf("\nNet pay: " + "$%.2f", (gross - taxes));
                break;
            }
            case "c": {
                System.out.print("Enter weekly sales: ");
                double sales = input.nextDouble();
                double gross = 250 + (0.057 * sales);
                System.out.printf("Gross pay: " + "$%.2f", gross);
                double taxes = gross * .125;
                System.out.printf("\nTaxes: " + "$%.2f", taxes);
                System.out.printf("\nNet pay: " + "$%.2f", (gross - taxes));
                break;
            }
            case "p": {
                System.out.print("Enter pieces produced: ");
                double pieces = input.nextDouble();
                System.out.print("Enter pay per piece: ");
                double price = input.nextDouble();
                double gross = pieces * price;
                System.out.printf("Gross pay: " + "$%.2f", gross);
                double taxes = gross * .125;
                System.out.printf("\nTaxes: " + "$%.2f", taxes);
                System.out.printf("\nNet pay: " + "$%.2f", (gross - taxes));
                break;
            }
        }

    }

}
