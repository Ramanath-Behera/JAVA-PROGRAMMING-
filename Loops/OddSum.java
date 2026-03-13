import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any number :");
        int a = input.nextInt();
        oddSum(a);

    }

    public static void oddSum(int num) {
        int sum=0;


        int i =1;
        while(i<num){
            if (i%2 != 0){
                sum+=i;
            }
            i++;
        }

        System.out.println("sum");
    }

}
