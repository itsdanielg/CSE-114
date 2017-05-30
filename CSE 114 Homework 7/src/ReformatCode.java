// Daniel Garcia
// SBU ID: *********
// CSE 114
// Homework 7, Problem 3

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ReformatCode {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File(args[0]));
        PrintWriter output = new PrintWriter(new File(args[1]));
        ArrayList<String> lines = new ArrayList<String>();
        int i = 0, temp = 0;
        while(i<1) {
            if (input.hasNextLine()) {
                lines.add(temp, input.nextLine());
                temp++;
            }
            else i++;
        }
        int count = temp;
        while (count>0) {
            if (lines.get(count-1).contains("{")) {
                lines.set(count-2, lines.get(count-2) + " {");
                lines.set(count-1, null);
                count -= 2;
            }
            else count -=1;
        }
        for (i = 0; i<temp; i++) {
            if (lines.get(i)!=null) {
                output.println(lines.get(i));
            }
        }
        output.close();
    }

}
