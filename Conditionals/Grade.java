import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your percentage");
        float per = input.nextFloat();

        if(per>90.00f){
            System.out.println("grade A.");
        } else if (per>75.00f && per<90.00f) {
            System.out.println("Grade B");
        } else if (per>60.00f && per<75.00f) {
            System.out.println("Grade C");
        } else if (per>30.00f && per<60.00f) {
            System.out.println("Grade D");
        }else{
            System.out.println("Grade F");
        }
    }
}
