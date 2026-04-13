package JAVA_one.Methods;

import java.util.Scanner;

public class MaxOf3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the numbers :");
        int a = sc.nextInt();
        int b =sc.nextInt();
        int c = sc.nextInt();

        System.out.println("The max number is :"+Math.max(Math.max(a,b),c));
    }
}
