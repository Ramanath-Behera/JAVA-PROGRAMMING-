import java.util.Scanner;
import java.math.*;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner nm = new Scanner(System.in);

        System.out.print("Enter a number :");
        int num = nm.nextInt();

        boolean flag = true;

        for (int i=2;i<=Math.sqrt(num);i++){
            if (num%i==0){
                flag = false;
                break;
            }
        }


        if (num==1){
            System.out.println("The number is neither prime nor composite");
        }
        else if (flag==true){
            System.out.println("The number is prime");
        }
        else {
            System.out.println("The number is composite");
        }


    }
}
