// Daniel Garcia
// SBU ID: *********
// CSE 114
// Homework 3, Problem 1

import java.util.Scanner;

public class PalindromicDate {
    public static void main(String[] args) {
        int day, year;
        String month, monthNum, daystring, yearstring, date;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month: ");
        month = input.next().toLowerCase();
        System.out.print("Enter day: ");
        day = input.nextInt();
        daystring = day + "";
        if (daystring.length()==1) daystring = "0" + daystring;
        System.out.print("Enter year: ");
        year = input.nextInt()%100;
        yearstring = year + "";
        if (yearstring.length()==1) yearstring = "0" + yearstring;
        monthNum = "0";
        date="";
        if (year>=1) {
            switch (month) {
                case "january": {
                    monthNum = "01";
                    if (day<=31) {
                        date = "Reformatted date: ";
                        System.out.println(date + monthNum + "/" + daystring + "/" + yearstring);
                    }
                    else System.out.println("Bad input.");
                    break;
                }
                case "february": {
                    monthNum = "02";
                    if (year%4==0 && day<=29) {
                        date = "Reformatted date: ";
                        System.out.println(date + monthNum + "/" + daystring + "/" + yearstring);
                    }
                    else if (year%4!=0 && day<=28) {
                        date = "Reformatted date: ";
                        System.out.println(date + monthNum + "/" + daystring + "/" + yearstring);
                    }
                    else System.out.println("Bad input.");
                    break;
                }
                case "march": {
                    monthNum = "03";
                    if (day<=31) {
                        date = "Reformatted date: ";
                        System.out.println(date + monthNum + "/" + daystring + "/" + yearstring);
                    }
                    else System.out.println("Bad input.");
                    break;
                }
                case "april": {
                    monthNum = "04";
                    if (day<=30) {
                        date = "Reformatted date: ";
                        System.out.println(date + monthNum + "/" + daystring + "/" + yearstring);
                    }
                    else System.out.println("Bad input.");
                    break;
                }
                case "may": {
                    monthNum = "05";
                    if (day<=31) {
                        date = "Reformatted date: ";
                        System.out.println(date + monthNum + "/" + daystring + "/" + yearstring);
                    }
                    else System.out.println("Bad input.");
                    break;
                }
                case "june": {
                    monthNum = "06";
                    if (day<=30) {
                        date = "Reformatted date: ";
                        System.out.println(date + monthNum + "/" + daystring + "/" + yearstring);
                    }
                    else System.out.println("Bad input.");
                    break;
                }
                case "july": {
                    monthNum = "07";
                    if (day<=31) {
                        date = "Reformatted date: ";
                        System.out.println(date + monthNum + "/" + daystring + "/" + yearstring);
                    }
                    else System.out.println("Bad input.");
                    break;
                }
                case "august": {
                    monthNum = "08";
                    if (day<=31) {
                        date = "Reformatted date: ";
                        System.out.println(date + monthNum + "/" + daystring + "/" + yearstring);
                    }
                    else System.out.println("Bad input.");
                    break;
                }
                case "september": {
                    monthNum = "09";
                    if (day<=30) {
                        date = "Reformatted date: ";
                        System.out.println(date + monthNum + "/" + daystring + "/" + yearstring);
                    }
                    else System.out.println("Bad input.");
                    break;
                }
                case "october": {
                    monthNum = "10";
                    if (day<=31) {
                        date = "Reformatted date: ";
                        System.out.println(date + monthNum + "/" + daystring + "/" + yearstring);
                    }
                    else System.out.println("Bad input.");
                    break;
                }
                case "november": {
                    monthNum = "11";
                    if (day<=30) {
                        date = "Reformatted date: ";
                        System.out.println(date + monthNum + "/" + daystring + "/" + yearstring);
                    }
                    else System.out.println("Bad input.");
                    break;
                }
                case "december": {
                    monthNum = "12";
                    if (day<=31) {
                        date = "Reformatted date: ";
                        System.out.println(date + monthNum + "/" + daystring + "/" + yearstring);
                    }
                    else System.out.println("Bad input.");
                    break;
                }
                default: System.out.println("Bad input."); break;
            }
        }
        else System.out.println("Bad input.");
        if (date.length()==18) {
            if ((monthNum.charAt(0)==yearstring.charAt(1)) && (monthNum.charAt(1)==yearstring.charAt(0)) && (daystring.charAt(0)==daystring.charAt(1)))
                System.out.println("Palindrome? yes");
            else System.out.println("Palindrome? no");
        }
    }
}
