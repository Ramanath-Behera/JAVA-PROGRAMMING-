import java.util.Scanner;

public class Name_n {
    public static void main(String[] args) {
        Scanner nm = new Scanner(System.in);


        System.out.print("Enter a number :");
        int num = nm.nextInt();

        System.out.print("Enter your name :");
        String name = nm.next();

        for (int i = 1;i<=num;i++){
            System.out.println(i+" "+name);
        }
    }
}
