import java.util.Scanner;

public class Rhombus {
   public static void main(String[] args) {
      Scanner dc = new Scanner(System.in);
      System.out.println("Enter a number :");
      int len = dc.nextInt();

      for(int i = 1; i <= len; ++i) {
         int k;
         for(k = 1; k <= len - i; ++k) {
            System.out.print("  ");
         }

         for(k = 1; k <= len; ++k) {
            System.out.print("* ");
         }

         System.out.println();
      }

   }
}
