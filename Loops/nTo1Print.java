import java.util.Scanner;

public class nTo1Print {
    public static void main(String[] args) {
        Scanner nm = new Scanner(System.in);

        System.out.print("Enter a number :");
        int num = nm.nextInt();

        for (int i=num;i>0;i--){
            System.out.println(i);
        }
    }
}
