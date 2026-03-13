import java.util.Scanner;

class Armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int org = num;
        int dig = 0;
        int arm = 0;

        while (num !=0){
            dig = num%10;
            arm = arm + (dig*dig*dig);
            num /= 10;
        }

        if (org == arm){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
    }
}
