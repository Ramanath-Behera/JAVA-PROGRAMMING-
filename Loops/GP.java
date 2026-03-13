import java.util.Scanner;
import java.math.*;
public class GP {
    public static void main(String[] args) {
        Scanner nm = new Scanner(System.in);

        System.out.print("Enter a number :");
        int num = nm.nextInt();

        int r = (int) (1*Math.pow(2,num-1));

        for (int i=1;i<=r;i*=2){
            System.out.println(i);
        }
    }
}
