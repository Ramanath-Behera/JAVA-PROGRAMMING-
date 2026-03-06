package JAVA_one.Arithmatic;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1st side of the rectangle :");
        int a = input.nextInt();

        System.out.println("Enter 2nd side of the rectangle :");
        int b = input.nextInt();

        System.out.println("Enter 3rd side of the rectangle :");
        int c = input.nextInt();

        System.out.println("Enter 4th side of the rectangle :");
        int d = input.nextInt();

        int per = a+b+c+d;

        System.out.println("The perimeter of the rectangle : " +per);

    }
}
