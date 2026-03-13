import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("enter second number : ");
        int num2 = sc.nextInt();

        int lcm = lcmof(num1,num2);
        System.out.println("LCM is "+lcm);

    }

    public static int lcmof(int num1,int num2) {

        if (num1==0 || num2==0) {
            return 0;
        }

        int small = (num1<num2)?num1:num2;
        int large = (num1 > num2)?num1:num2;

        int i = 1;
        while (i<=num2) {
            int factor = small * i;
            if (factor % large == 0) {
                return factor;
            }
            i++;

        }

        return 0;
    }
}
