package JAVA_one.Arithmatic;

import java.util.Scanner;

public class ArithOprt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = input.nextInt();

        System.out.println("Enter second number");
        int b = input.nextInt();

        int sum = a+b;
        int diff = a-b;
        int prod = a*b;
        int div = a/b;
        float rem = a%b;

        System.out.println("Addition of first and second number "+ sum);
        System.out.println("Subtraction of first and second number "+ diff);
        System.out.println("Multiplication of first and second number "+ prod);
        System.out.println("Division of first and second number "+ div);
        System.out.println("Remainder of first and second number "+ rem);

    }
}
