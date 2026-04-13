package JAVA_one.Methods;

import java.util.Scanner;

public class PassByValueANDPassByReference {
    static void change(int x) { // change method recieves 6 as the value not the variable x

        x=10;
    }
    static void main() {

        Scanner sc = new Scanner(System.in);

        int x= sc.nextInt();
        System.out.println(x);

        change(x);    // here the value contained by x is passed in the change method
        System.out.println(x);
    }
}
