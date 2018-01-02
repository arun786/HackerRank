package JavaOutPutFormatting;

import java.util.Scanner;

public class JavaOutputFormatting {

    /**
     *
     * @param args
     *
     * Requirement was input will be a string an integer,
     * we need to format the input in such a way that String is
     * left justified with 15 characters and int will be
     * expressed in exactly 3 digits if it is less than or equal to
     * 3 digits.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-14s %03d", s1, x);
            System.out.println();
        }
        System.out.println("================================");
    }
}
