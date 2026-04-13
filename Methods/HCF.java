package JAVA_one.Methods;

import java.util.Scanner;

public class HCF {

    static void hcf(int a, int b) {
        int small = Math.max(a, b);

        int gcd = 1;

        int i = 2;
        while (i <= small) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
            i++;
        }
        System.out.println("Hcf is "+gcd);
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number :");
        int one = sc.nextInt();

        System.out.println("Enter second number :");
        int two = sc.nextInt();

        for (int i = Math.max(one, two); i > 0; i--) {

        }

        hcf(one, two);
    }
}
