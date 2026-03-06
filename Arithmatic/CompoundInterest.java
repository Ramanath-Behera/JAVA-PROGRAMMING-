package JAVA_one.Arithmatic;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the principal :");
        int ppl = input.nextInt();

        System.out.println("Enter the rate :");
        float rt = input.nextFloat();

        System.out.println("Enter the time :");
        int time = input.nextInt();

        float ci = ppl*(1+rt/100)*time;

        System.out.println("The compound interest is "+ci);

    }
}
