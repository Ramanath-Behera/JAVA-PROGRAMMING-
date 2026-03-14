import java.util.Scanner;

public class NumberTriangleVerticallyFlipped {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number :");
      int num = sc.nextInt();

      for(int i = 1; i <= num; ++i) {
         int k;
         for(k = 1; k <= num - i; ++k) {
            System.out.print(" ");
         }

         for(k = 1; k <= i; ++k) {
            System.out.print(k);
         }

         System.out.println();
      }

   }
}
