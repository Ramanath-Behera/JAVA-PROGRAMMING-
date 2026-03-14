import java.util.Scanner;

public class InvertedFlipTriangle {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number :");
      int num = sc.nextInt();

      for(int i = 1; i <= num; ++i) {
         int j;
         for(j = 1; j <= i - 1; ++j) {
            System.out.print(" ");
         }

         for(j = num; j >= i; --j) {
            System.out.print("*");
         }

         System.out.println();
      }

   }
}
