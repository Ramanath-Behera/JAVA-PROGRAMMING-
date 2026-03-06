package JAVA_one.Arithmatic;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter base of the triangle :");
        int b = input.nextInt();

        System.out.println("Enter height of the rectangle :");
        int h = input.nextInt();

        float area = (b*h)/2;

        System.out.println("The area of the triangle is : "+area);

    }
}
