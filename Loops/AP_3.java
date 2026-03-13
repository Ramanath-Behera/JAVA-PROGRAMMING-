import java.util.Scanner;

public class AP_3 {
    public static void main(String[] args) {
        Scanner nm = new Scanner(System.in);

        System.out.print("Enter a number :");
        int num = nm.nextInt();

        int n = 2+(num-1)*3;

        for (int i=2;i<=n;i+=3){
            System.out.println(i);
        }
    }
}
