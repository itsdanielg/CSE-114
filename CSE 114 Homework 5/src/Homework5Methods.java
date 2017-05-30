// Daniel Garcia
// SBU ID: *********
// CSE 114
// Homework 5

public class Homework5Methods {
    // part 1
    public static String eliminateDuplicates(String str) {
        String end = "";
        for (int i = 0; i<str.length(); i++) {
            if (end.indexOf(str.charAt(i))<0) {
                end += str.charAt(i);
            }
        }
        return end;
    }

    // part 2
    public static String getDigits(String phoneNumber) {
        String end = "";
        for (int i = 0; i<phoneNumber.length(); i++) {
            char digit = Character.toUpperCase(phoneNumber.charAt(i));
            if (!(digit=='-')) {
                if (digit=='A' || digit=='B' || digit=='C')	end += '2';
                else if (digit=='D' || digit=='E' || digit=='F') end += '3';
                else if (digit=='G' || digit=='H' || digit=='I') end += '4';
                else if (digit=='J' || digit=='K' || digit=='L') end += '5';
                else if (digit=='M' || digit=='N' || digit=='O') end += '6';
                else if (digit=='P' || digit=='Q' || digit=='R' || digit=='S') end += '7';
                else if (digit=='T' || digit=='U' || digit=='V') end += '8';
                else if (digit=='W' || digit=='X' || digit=='Y' || digit=='Z') end += '9';
                else if (digit==' ') end += '0';
                else end += digit;
            }
        }
        return end;
    }

    // part 3
    public static int lowestBasePalindrome(int num) {
        int temp = num;
        int n = 0;
        int i = 0;
        for (i = 2; i<temp; i++) {
            int total = arrayL(temp, i);
            int[] count = new int[total];
            for (int j = total - 1; j>=0; j--) {
                count[j] = temp % i;
                temp /= i;
            }
            for (int  k = 0; k<total/2; k++) {
                if (count[k] == count[total-1-k]) n++;
            }
            temp = num;
            if (n == total/2) break;
            else n = 0;
        }
        return i;
    }

    public static int arrayL(int dividend, int divisor) {
        int count = 1;
        while (dividend>=divisor) {
            dividend /= divisor;
            count++;
        }
        return count;
    }

    // part 4
    public static int[] interleaveArrays(int[] array1, int[] array2, int stride, int maxElements) {
        if (stride > 0 && maxElements > 0) {
            int n = 0, i = 0, j = 0, a = 0, b = 0;
            int[] newArray;
            for (i = 0; i<array1.length; i++) {
                n++;
            }
            for (i = 0; i<array2.length; i++) {
                n++;
            }
            if (n > maxElements) newArray = new int[maxElements];
            else newArray = new int[n];
            i = 0;
            while (i < newArray.length) {
                while (j < stride) {
                    if (a < array1.length && i < newArray.length) {
                        newArray[i] = array1[a];
                        j++;
                        i++;
                        a++;
                    }
                    else j = stride;
                }
                j = 0;
                while (j < stride) {
                    if (b < array2.length && i < newArray.length) {
                        newArray[i] = array2[b];
                        j++;
                        i++;
                        b++;
                    }
                    else j = stride;
                }
                j = 0;
            }
            return newArray;
        }
        else return null;
    }

    // part 5
    public static void rotateRight(int[][] matrix, int numCols) {
        if (numCols>0) {
            int i = 0, shift = 0;
            int[][] temp = new int[matrix.length][];
            for (i = 0; i < matrix.length; i++)
                temp[i] = matrix[i].clone();
            int j = 0;
            for (i = 0; i<matrix.length; i++) {
                for (j = 0; j<matrix[i].length; j++) {
                    shift = j + numCols;
                    if (shift >= matrix[i].length) {
                        shift %= matrix[i].length;
                        matrix[i][shift] = temp[i][j];
                    }
                    else {
                        matrix[i][shift] = temp[i][j];
                    }
                }
            }
        }
    }

}
