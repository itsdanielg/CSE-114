// Daniel Garcia
// SBU ID: *********
// CSE 114
// Homework 4, Problem 1

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        int total=1, user=1, count=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers: ");
        while (user>0 && input.hasNextInt()) {
            user=input.nextInt();
            if (user>0) total*=user;
        }
        if (total==1) System.out.println("Bad input.");
        else System.out.println("Product: " + total);
        for (int i=2; i<=(total); i++) {
            count=0;
            while (total%i==0) {
                total/=i;
                count++;
            }
            if (!(count==0)) System.out.print(i+ "^" + count + " ");
        }
    }
}
