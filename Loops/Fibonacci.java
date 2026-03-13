import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner fc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int num = fc.nextInt();

        int first_num=0;
        int second_num=1;
        int next;

        int i=1;
        while(i<=num){
            System.out.print(first_num+" ");

            next = first_num+second_num;
            first_num = second_num;
            second_num = next;

            i++;

        }
    }
}
