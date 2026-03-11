package JAVA_one.Conditionals;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = input.nextInt();

        System.out.println("Enter second number");
        int b = input.nextInt();

        System.out.println("Enter third number");
        int c = input.nextInt();



        if (a>b && a>c){
            System.out.println(a+" is the greatest");
        }
        else if(b>a && b>c){
            System.out.println(b+ " is the greatest");
        }
        else{
            System.out.println(c +" is the greatest");
        }
    }
}
