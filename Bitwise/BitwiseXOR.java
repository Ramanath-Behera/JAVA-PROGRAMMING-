package JAVA_one.Bitwise;

import java.util.Scanner;

public class BitwiseXOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a = input.nextInt();

        System.out.print("Enter the second number :");
        int b = input.nextInt();

        int result = a ^ b;

        System.out.println("Result is :"+result);
    }
}
