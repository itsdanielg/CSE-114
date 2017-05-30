// Daniel Garcia
// SBU ID: *********
// CSE 114
// Homework 4, Problem 3

import java.util.Scanner;

public class RunLengthEncoding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int check = 0, count = 0, i;
        System.out.print("Enter input string: ");
        String str = input.nextLine();
        for (i=0; i<str.length();i++) {
            char letter = str.charAt(i);
            if (!(Character.isAlphabetic(letter) && Character.isUpperCase(letter))) {
                System.out.println("Bad input.");
                check++;
                break;
            }
        }
        if (check == 0) {
            System.out.print("Enter flag character: ");
            String flag = input.next();
            if (!(flag.equals("#") || flag.equals("$") || flag.equals("&") || flag.equals("*"))) {
                System.out.println("Bad input.");
            }
            else {
                System.out.print("Encoded: ");
                for (i=0; i<str.length();i++) {
                    char letter = str.charAt(i);
                    if (i == str.length()-1) {
                        count++;
                        if (count > 3) {
                            System.out.print(flag);
                            System.out.print(letter);
                            System.out.print(count);
                            break;
                        }
                        else {
                            for (int j = 0; j<count; j++) {
                                System.out.print(letter);
                            }
                            break;
                        }
                    }
                    if (letter == str.charAt(i+1)) {
                        count++;
                    }
                    else {
                        count++;
                        if (count > 3) {
                            System.out.print(flag);
                            System.out.print(letter);
                            System.out.print(count);
                            count = 0;
                        }
                        else {
                            for (int j = 0; j<count; j++) {
                                System.out.print(letter);
                            }
                            count = 0;
                        }
                    }
                }
            }
        }
    }

}
