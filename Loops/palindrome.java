import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        System.out.print("Enter a number :");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();


        int org = num;
        int rev = 0;
        int emp = 0;

        while(num != 0){
            emp = num%10;
            rev = (rev*10)+emp;
            num = num/10;
        }

        if (rev == org) System.out.println("palindrome");
        else System.out.println("not palindrome");
    }
}
