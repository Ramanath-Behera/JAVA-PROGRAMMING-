import java.util.Scanner;

class factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number :");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        num_factorial(num);
    }
    public static long num_factorial(int num){

        if (num < 2){
            return 1;
        }

        long mult=1;
        int i =2;

        while(i <= num){
            mult *= i;
            i++;
        }

        System.out.println("The factorial is : "+mult);
        return 0;
    }

}
