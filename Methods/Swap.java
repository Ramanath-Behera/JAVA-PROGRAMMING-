package JAVA_one.Methods;

import java.util.Scanner;

public class Swap {
    static void Swapping(int x,int y){
        int temp=x;
        x=y;
        y=temp;

        System.out.println("After swapping a = "+x+" and b = "+y);

    }
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number :");
        int a = sc.nextInt();
        System.out.println("Enter second number :");
        int b = sc.nextInt();


        Swapping(a,b);
    }
}
