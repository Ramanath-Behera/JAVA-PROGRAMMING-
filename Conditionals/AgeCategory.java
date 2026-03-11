package JAVA_one.Conditionals;

import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age.");
        int age = input.nextInt();

        if(age>60){
            System.out.println("CATEGORY  Senior.");
        } else if (age>=20 && age<40) {
            System.out.println("CATEGORY Young Adult");
        } else if (age>=40 && age<60) {
                System.out.println("CATEGORY Adult");
        } else if (age>=13 && age<20) {
            System.out.println("CATEGORY Teen");
        }else{
            System.out.println("CATEGORY Child");
        }
    }
}
