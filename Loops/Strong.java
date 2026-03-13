// A strong number is defined as a number whose value equals the sum of the factorials of its digits.
// For example, the number 145 is a strong number
import java.util.Scanner;

public class Strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int number = sc.nextInt();

        if (Strong(number)){
            System.out.println(number + " is strong");
        }
        else {
            System.out.println(number + " is not strong");
        }
    }

    public static int factorial(int a){
        int fact =1;

        for (int i=1; i <= a;i++){
            fact *= i;
        }

        return fact;
    }

    public static boolean Strong (int num){
        if (num<0) return false;

        int OrgNum = num;
        int sum = 0;

        while(num > 0){
            int digit = num%10;

            sum += factorial(digit);
            num /= 10;
        }
        return sum == OrgNum;
    }
}
