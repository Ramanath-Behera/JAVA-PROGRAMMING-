// take n as input and print : 1,n,2,n-1,3,n-2,...


import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner nm = new Scanner(System.in);

        System.out.print("Enter a number :");
        int num = nm.nextInt();

        int x = num+1;
        for (int i=1;i<=num;i++){
            System.out.println(i);
            System.out.println(x-1);

            x--;

        }

    }
}
