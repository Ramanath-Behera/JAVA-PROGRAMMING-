package JAVA_one.Conditionals;

import java.util.Scanner;

public class pstvNgtvZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number");
        int num = input.nextInt();

        if(num>0){
            System.out.println("Number is positive.");
        }
        else if(num<0){
            System.out.println("Number is negattive.");
        }
        else{
            System.out.println("Number is zero.");
        }
    }
}
