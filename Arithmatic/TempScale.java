package JAVA_one.Arithmatic;

import java.util.Scanner;

public class TempScale {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter fahrenheit");
        float fr = input.nextFloat();

        float cl = 5 *(fr - 32) /9;

        System.out.println(fr +" fahrenheit in celsius is " +cl );
    }
}
