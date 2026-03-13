import java.util.Scanner;

public class sum_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n :");
        int num = sc.nextInt();

        odd_sum(num);
    }

    public static int odd_sum(int num) {
        int i=1;
        int sum=0;
        while(i<=num){
            if(i%2!=0){
                sum+=i;
            }

         i++;
        }

        System.out.println("The sum is "+sum);
        return 0;
    }
}
