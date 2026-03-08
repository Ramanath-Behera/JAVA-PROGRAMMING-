package JAVA_one.Bitwise;

import java.util.Scanner;

public class Bitwise_EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a = input.nextInt();

        if ((a & 1) == 1){
            System.out.println("Number is odd.");
        }else {
            System.out.println("Number is even.");
        }
    }
}
