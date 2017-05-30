// Daniel Garcia
// SBU ID: *********
// CSE 114
// Homework 8

import java.util.*;

public class Homework8Driver {
    public static void main(String[] args) {

        // Below are the test cases from the homework assignment PDF.
        // You should add your own additional code to check the return values
        // to see if they are correct.

        System.out.println("Part 1:");
        int result;
        result = Homework8Methods.findTimes10(new int[]{1,5,3,5,50,2,4,6,60});
        System.out.println("findTimes10(new int[]{1,5,3,5,50,2,4,6,60}) = "+result);
        result = Homework8Methods.findTimes10(new int[]{1,5,3,5,15,2,4,6,60});
        System.out.println("findTimes10(new int[]{1,5,3,5,15,2,4,6,5}) = " + result);
        result = Homework8Methods.findTimes10(new int[]{1,5,3,5,15,2,4,6,5});
        System.out.println("findTimes10(new int[]{1,5,3,5,15,2,4,6,5}) = " + result);

        System.out.println("\nPart 2:");
        int[] nums;
        nums = new int[]{5,3,5,50,2,4,6,60};
        System.out.print("replaceMult5({5,3,5,50,2,4,6,60}, 77) -> nums: ");
        Homework8Methods.replaceMult5(nums, 77);
        printArray(nums);

        nums = new int[]{5,3,-5,50,2,4,6,-60};
        System.out.print("replaceMult5({5,3,-5,50,2,4,6,-60}, 99) -> nums: ");
        Homework8Methods.replaceMult5(nums, 99);
        printArray(nums);

        nums = new int[]{4,3,-8,33,2,4,6,-61};
        System.out.print("replaceMult5({4,3,-8,33,2,4,6,-61}, 44) -> nums: ");
        Homework8Methods.replaceMult5(nums, 44);
        printArray(nums);

        System.out.println("\nPart 3:");
        nums = new int[]{4, 7, 1, 2};
        ArrayList<int[]> perms = Homework8Methods.permuteArray(nums);
        System.out.println("permuteArray({4, 7, 1, 2}):");
        for (int[] array: perms) {
            for (int i = 0; i < array.length; i++)
                System.out.print(array[i] + " ");
            System.out.println();
        }

        System.out.println("\nPart 4:");
        String s1 = "Hello", s2 = "Java";
        String[] strs = Homework8Methods.mobius(s1, s2);
        for (String s : strs)
            System.out.println(s);

        System.out.println("\nPart 5: ");
        System.out.println("teddy(10,4,2) = " + Homework8Methods.teddy(10,4,2));
        System.out.println("teddy(9,5,3) = " + Homework8Methods.teddy(9,5,3));
        System.out.println("teddy(15,4,2) = " + Homework8Methods.teddy(15,4,2));
        System.out.println("teddy(20,3,5) = " + Homework8Methods.teddy(20,3,5));
        System.out.println("teddy(40,5,6) = " + Homework8Methods.teddy(40,5,6));
        System.out.println("teddy(30,56,5) = " + Homework8Methods.teddy(30,56,5));
        System.out.println("teddy(30,55,4) = " + Homework8Methods.teddy(30,55,4));
    }

    public static void printArray(int[] digits) {
        for (int i : digits)
            System.out.print(i + " ");
        System.out.println();
    }

}
