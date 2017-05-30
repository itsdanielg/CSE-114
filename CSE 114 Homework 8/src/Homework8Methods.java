// Daniel Garcia
// SBU ID: *********
// CSE 114
// Homework 8

import java.util.ArrayList;

public class Homework8Methods {
    // part 1
    public static int findTimes10(int[] nums) {
        return findTimes10Helper(nums, 0);
    }

    public static int findTimes10Helper(int[] nums, int x) {
        if (x != nums.length-1) {
            if (nums[x+1]==(nums[x]*10)) {
                return (x);
            }
            else {
                return findTimes10Helper(nums, x+1);
            }
        }
        else return -1;
    }

    // part 2
    public static void replaceMult5(int[] nums, int newVal) {
        replaceMult5Helper(nums, newVal, 0);
    }

    public static void replaceMult5Helper(int[] nums, int newVal, int x) {
        if (x != nums.length) {
            if (nums[x]%5==0) {
                nums[x]=newVal;
            }
            replaceMult5Helper(nums, newVal, x+1);
        }
    }

    // part 3
    public static ArrayList<int[]> permuteArray(int[] array) {
        int counter = 0;
        return permuteArrayHelper(array, counter);
    }

    public static ArrayList<int[]> permuteArrayHelper(int[] array, int counter) {
        if (counter == array.length) {
            ArrayList<int[]> result = new ArrayList<>();
            int[] temp = new int[0];
            result.add(temp);
            return result;
        }

        ArrayList<int[]> permutations = new ArrayList<>();

        int firstElement = removeFirstElement(array, counter);
        counter++;

        ArrayList<int[]> finalArray = permuteArrayHelper(array, counter);
        for (int[] li : finalArray) {
            for (int j = 0; j <= li.length; j++) {
                int[] tempArray = new int[li.length + 1];
                copyArray(li, tempArray, 0);
                int index = tempArray.length - 1;
                shift(tempArray, j, index);
                tempArray[j] = firstElement;
                permutations.add(tempArray);
            }
        }
        return permutations;
    }

    public static int removeFirstElement(int[] array, int counter) {
        if (counter == array.length - 1) {
            return array[counter];
        }
        int temp = array[counter];
        array[counter] = 0;
        return temp;
    }

    public static void copyArray(int[] array, int[]tempArray, int index) {
        if (tempArray.length == 1) return;
        else if (array.length == index) return;
        else {
            tempArray[index] = array[index];
            copyArray(array, tempArray, index + 1);
        }
    }

    public static void shift(int[] tempArray, int j, int index) {
        if (index == j) return;
        else {
            tempArray[index] = tempArray[index - 1];
            shift(tempArray, j, --index);
        }
    }


    // part 4
    public static String[] mobius(String s1, String s2) {
        String[] strings = new String[s1.length() + s2.length()];
        return mobiusHelper(s1, s2, s1, s2, 0, 0, strings, 0);
    }

    public static String[] mobiusHelper(String s1, String s2, String s1o, String s2o, int l1, int l2, String[] strings, int index) {
        if (l1 == s1o.length() && l2 == s2o.length()) {
            return strings;
        }
        else {
            if (l1 < s1o.length()) {
                strings[index] = (s1 + s2 + s1o.substring(0,l1));
                return mobiusHelper(s1.substring(1), s2, s1o, s2o, ++l1, l2, strings, ++index);
            }
            else {
                if (s1.length()==0) s1 = s1o;
                strings[index] = (s2 + s1 + s2o.substring(0,l2));
                return mobiusHelper(s1, s2.substring(1), s1o, s2o, l1, ++l2, strings, ++index);
            }
        }
    }

    // part 5
    public static int teddy(int initial, int goal, int increment) {
        return teddyHelper(initial, goal, increment, 0);
    }

    public static int teddyHelper(int initial, int goal, int increment, int n) {
        if (n==10) return -11;
        else {
            if (goal == initial + increment) return 1;
            else if (goal == initial - increment) return 1;
            else if (initial % 2 == 0) {
                if (goal == initial/2) return 1;
                else if (goal == initial + initial/goal) return 1;
            }
        }
        if (goal < initial) {
            if (initial % 2 == 0) {
                if ((initial - goal) % increment == 0) {
                    initial -= increment;
                    return 1 + teddyHelper(initial, goal, increment, ++n);
                }
                else if (((initial - increment) / 2 - goal) % increment == 0 && ((initial - increment) / 2 - goal) / increment == 1) {
                    initial -= increment;
                    return 1 + teddyHelper(initial, goal, increment, ++n);
                }
                else {
                    return 1 + teddyHelper(initial / 2, goal, increment, ++n);
                }
            }
            else {
                initial -= increment;
                return 1 + teddyHelper(initial, goal, increment, ++n);
            }
        }
        else {
            if (initial % 2 == 0) {
                if ((goal - initial) % increment == 0) {
                    initial += increment;
                    return 1 + teddyHelper(initial, goal, increment, ++n);
                }
                else if ((goal - ((initial + increment) * 1.5)) % increment == 0 && (goal - ((initial + increment) * 1.5)) / increment == 1) {
                    initial += increment;
                    return 1 + teddyHelper(initial, goal, increment, ++n);
                }
                else {
                    return 1 + teddyHelper(initial + (initial / 2), goal, increment, ++n);
                }
            }
            else {
                initial += increment;
                return 1 + teddyHelper(initial, goal, increment, ++n);
            }
        }
    }

}
