// Daniel Garcia
// SBU ID: *********
// CSE 114
// Homework 4, Problem 2

import java.util.Scanner;

public class BaseToBase {
    public static void main(String[] args) {
        int start, end, temp = 0, power = 0, powerResult = 1, tempcount = 0, a = 0, numcount = 0;
        String tempResult = "", finalResult = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        String number = input.next().toUpperCase();
        System.out.print("Enter starting base: ");
        start = input.nextInt();
        System.out.print("Enter ending base: ");
        end = input.nextInt();
        if (start < 10) {
            int num = Integer.parseInt(number);
            for (int i = 0; i < number.length(); i++) {
                int first = num % 10;
                if (power == 0) {
                    temp += first;
                    power++;
                }
                else {
                    for (int j = 0; j<power; j++) {
                        powerResult *= start;
                    }
                    temp = temp + (first * powerResult);
                    powerResult = 1;
                    power++;
                }
                num /= 10;
            }
            if (end == 10) {
                finalResult = Integer.toString(temp);
            }
            else {
                while (temp != 0) {
                    int first = temp % end;
                    if (first < 10) {
                        tempResult += Integer.toString(first);
                    }
                    else {
                        tempResult += (char)(55+first);
                    }
                    temp /= end;
                }
                tempcount = tempResult.length();
            }
        }
        else {
            numcount = number.length();
            for (int i = 0; i < numcount; i++) {
                char first = number.charAt(number.length()-1);
                if (Character.isAlphabetic(first)) {
                    a = Character.getNumericValue(first);
                }
                else {
                    a = Character.getNumericValue(first);
                }
                if (power == 0) {
                    temp += a;
                    power++;
                }
                else {
                    for (int j = 0; j<power; j++) {
                        powerResult *= start;
                    }
                    temp = temp + (a * powerResult);
                    powerResult = 1;
                    power++;
                }
                number = number.substring(0, number.length()-1);
            }
            if (end == 10) {
                finalResult = Integer.toString(temp);
            }
            else {
                while (temp != 0) {
                    int first = temp % end;
                    if (first < 10) {
                        tempResult += Integer.toString(first);
                    }
                    else {
                        tempResult += (char)(55+first);
                    }
                    temp /= end;
                }
                tempcount = tempResult.length();
            }
        }
        for (int i = tempcount - 1; i>=0; i--)
            finalResult += tempResult.charAt(i) + "";
        System.out.print("Result: " + finalResult);
    }

}
