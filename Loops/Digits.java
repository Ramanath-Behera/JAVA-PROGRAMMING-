import java.util.Scanner;

public class Digits { // Sum of digits
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter a number :");
        int num = sc.nextInt();

        int sum = 0;

        while(num!=0){
            int re = num%10;
            num /= 10;
            sum = sum+re;
        }

        System.out.println(sum);
    }
}
