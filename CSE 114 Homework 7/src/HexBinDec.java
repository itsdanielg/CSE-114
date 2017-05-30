// Daniel Garcia
// SBU ID: *********
// CSE 114
// Homework 7, Problem 2

public class HexBinDec {

    public static int hex2Dec(String hexString) throws HexFormatException {
        String all = "0123456789ABCDEF";
        int i = 0;
        hexString = hexString.toUpperCase();
        for (i = 0; i < hexString.length(); i++) {
            int ascii = (int)hexString.charAt(i);
            if (ascii<48 || ascii>70) throw new HexFormatException();
        }
        int hex = 0;
        for (i = 0; i < hexString.length(); i++) {
            char c = hexString.charAt(i);
            int d = all.indexOf(c);
            hex = 16*hex + d;
        }
        return hex;
    }

    public static int bin2Dec(String binString) throws BinaryFormatException {
        int n = Integer.parseInt(binString);
        int temp = n;
        while (temp!=0) {
            if (temp%10>1) {
                throw new BinaryFormatException();
            }
            temp /= 10;
        }
        int decimal = 0, i = 0;
        while(n!=0) {
            temp = n%10;
            decimal += temp*Math.pow(2, i);
            i++;
            n /= 10;
        }
        return decimal;
    }

    public static void main(String[] args) {
        try {
            System.out.println(bin2Dec("101101010"));
        }
        catch (BinaryFormatException e) {
        }
        try {
            System.out.println(bin2Dec("102101210"));
        }
        catch (BinaryFormatException e) {
        }
        try {
            System.out.println(hex2Dec("1242DF2"));
        }
        catch (HexFormatException e) {
        }
        try {
            System.out.println(hex2Dec("1X8DTF7"));
        }
        catch (HexFormatException e) {
        }
    }
}

class BinaryFormatException extends Exception {

    public BinaryFormatException() {
        System.out.println("Invalid input. Number is not binary.");
    }

}

class HexFormatException extends Exception {

    public HexFormatException() {
        System.out.println("Invalid input. Number is not a hexadecimal.");
    }
}
