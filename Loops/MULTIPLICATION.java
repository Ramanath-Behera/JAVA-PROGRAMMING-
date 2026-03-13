import java.util.Scanner;

public class MULTIPLICATION {
    public static void main(String[] args) {

        System.out.print("Enter the number you want to print table :");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        multiplication_table(num);

        }

    public static void multiplication_table(int num) {
        int i =1;
        while (i<=10){
            System.out.println(num+"x"+i+"="+(num*i));

            i++;
        }

    }
    }




