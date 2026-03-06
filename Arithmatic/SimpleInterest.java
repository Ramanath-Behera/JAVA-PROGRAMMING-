package JAVA_one.Arithmatic;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the principal :");
        int ppl = input.nextInt();

        System.out.println("Enter the rate :");
        float rt = input.nextFloat();

        System.out.println("Enter the time :");
        int time = input.nextInt();

        float si = (ppl*rt*time)/100;

        System.out.println("The simple interest is "+si);

    }
}
