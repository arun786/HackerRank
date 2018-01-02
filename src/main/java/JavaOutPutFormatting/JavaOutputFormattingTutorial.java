package JavaOutPutFormatting;

public class JavaOutputFormattingTutorial {
    public static void main(String[] args) {
        /*String formatting*/

        String str = "arun";
        System.out.printf("%s", str); //It will be printed as arun with no spaces
        System.out.println();
        System.out.printf("%10s", str); //right justified with 10 characters max, if less than 10 characters left will be padded with space
        System.out.println();
        System.out.printf("%-10s", str);//left justified with 10 characters max, if less right will be padded with spaces
        System.out.println();

        /*Integer formatting*/
        int number = 100;
        System.out.printf("%5d", number);//right justified with 5 characters
        System.out.println();
        System.out.printf("%-5d", number);//left justified with 5 characters
        System.out.println();
        System.out.printf("%05d", number); //right justified with leading spaces as 0
    }
}


