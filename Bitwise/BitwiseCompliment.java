package JAVA_one.Bitwise;

import java.util.Scanner;

public class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a = input.nextInt();

        int result = ~a;

        System.out.println("Result is :"+result);
    }
}
