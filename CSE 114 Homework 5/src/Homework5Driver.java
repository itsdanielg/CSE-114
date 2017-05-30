public class Homework5Driver {
    public static void main(String[] args) {

        // Below are the test cases from the homework assignment PDF.
        // You should add your own additional code to check the return values
        // to see if they are correct.

        System.out.println("Part 1:");
        String result;
        result = Homework5Methods.eliminateDuplicates("abracadabra");
        result = Homework5Methods.eliminateDuplicates("What's a Seawolf? I'm a Seawolf!");
        result = Homework5Methods.eliminateDuplicates("Stony Brook University");
        result = Homework5Methods.eliminateDuplicates("AaBbCcDd");
        result = Homework5Methods.eliminateDuplicates("");
        System.out.print(result);

        System.out.println("Part 2:");
        result = Homework5Methods.getDigits("1-800-Flowers");
        result = Homework5Methods.getDigits("1800FLOWERS");
        result = Homework5Methods.getDigits("1-CSE-114-JAVA");
        result = Homework5Methods.getDigits("Seawolf-SBU-1");

        System.out.println("Part 3:");
        int base;
        base = Homework5Methods.lowestBasePalindrome(100);
        base = Homework5Methods.lowestBasePalindrome(917);
        base = Homework5Methods.lowestBasePalindrome(977);
        base = Homework5Methods.lowestBasePalindrome(271928172);

        System.out.println("Part 4:");
        int[] nums;
        nums = Homework5Methods.interleaveArrays(new int[]{2,2,5,4},new int[]{6,2,1,8,4,4},2,10);
        nums = Homework5Methods.interleaveArrays(new int[]{10,9,8},new int[]{1,2,3},5,20);
        nums = Homework5Methods.interleaveArrays(new int[]{2,5,1,4}, new int[]{10,5,2},1,8);
        nums = Homework5Methods.interleaveArrays(new int[]{2,4,6,8},new int[]{9,7,5,3,1},0,6);
        nums = Homework5Methods.interleaveArrays(new int[]{1,2},new int[]{2,3,4,5},4,-3);

        System.out.println("Part 5:");
        int[][] nums2D = new int[][]{ {1,2,3}, {-1,-2,-3,-4,-5}, {6,7,8,9}, {10, 11} };
        Homework5Methods.rotateRight(nums2D, 2);
        nums2D = new int[][]{ {1,2,3}, {-1,-2,-3,-4,-5}, {6,7,8,9}, {10, 11} };
        Homework5Methods.rotateRight(nums2D, 7);
        nums2D = new int[][]{ {1,2,3}, {-1,-2,-3,-4,-5}, {6,7,8,9}, {10, 11} };
        Homework5Methods.rotateRight(nums2D, -1);
    }
}
