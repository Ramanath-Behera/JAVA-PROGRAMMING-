package JAVA_one.Arithmatic;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value for a :");
        int a = input.nextInt();

        System.out.print("Enter value for b :");
        int b = input.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Value for A is "+a+" and Value for B is "+b);

    }
}
