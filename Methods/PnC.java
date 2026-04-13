package JAVA_one.Methods;

import java.util.Scanner;

public class PnC {
    static int factorial(int a) {
        int temp = 1;
        for (int i = 1; i <= a; i++) {
            temp = temp * i;
        }
        return temp;
    }

    static int comb(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    static int perm(int n, int r) {
        return factorial(n) / factorial(n - r);

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n :");
        int n = sc.nextInt();
        System.out.print("Enter r :");
        int r = sc.nextInt();


        System.out.println("Permutation");
        System.out.println(perm(n, r));

        System.out.println("CombinationL̥");
        System.out.println(comb(n, r));


    }
}
