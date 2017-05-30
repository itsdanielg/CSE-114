// Daniel Garcia
// SBU ID: *********
// CSE 114
// Homework 3, Problem 4

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        int year, q, m, j, k, d;
        String day="";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year (e.g., 1918): ");
        year = input.nextInt();
        System.out.print("Enter month (1-12): ");
        m = input.nextInt();
        if (m==1) {
            m = 13;
            year--;
        }
        else if (m==2) {
            m = 14;
            year--;
        }
        j = year/100;
        k = year%100;
        System.out.print("Enter the day of the month (1-31): ");
        q = input.nextInt();
        d = (q + (13*(m+1))/5 + k + (k/4) + (j/4) + (5*j))%7;
        switch (d) {
            case 0: day += "Saturday"; break;
            case 1: day += "Sunday"; break;
            case 2: day += "Monday"; break;
            case 3: day += "Tuesday"; break;
            case 4: day += "Wednesday"; break;
            case 5: day += "Thursday"; break;
            case 6: day += "Friday"; break;
        }
        System.out.println("The day of the week is " + day);
    }

}
