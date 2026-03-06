package JAVA_one.Arithmatic;

import java.util.Scanner;

public class AddTwoNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = input.nextInt();

        System.out.println("Enter second number");
        int b = input.nextInt();

        int sum = a+b;

        System.out.println("The sum of the two numbers :"+sum);

    }
}
