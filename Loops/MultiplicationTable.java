import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the numner you want table of");
        int a = input.nextInt();
        table(a);
    }

    public static void table(int num) {
        int i=1;
        while (i<11){
            System.out.println(num +" x"+i +" ="+num*i);
            i++;
        }
    }
}
