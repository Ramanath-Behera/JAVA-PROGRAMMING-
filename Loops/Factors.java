import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner nm = new Scanner(System.in);

        System.out.print("Enter a number :");
        int num = nm.nextInt();


        for (int i=1;i<=num;i++){
            if (num%i==0){
                System.out.println(i);
            }
        }
    }
}
