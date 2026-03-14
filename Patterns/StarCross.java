import java.util.Scanner;

public class StarCross {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter no of rows and column (odd) :");
      int no = sc.nextInt();

      for(int i = 1; i <= no; ++i) {
         int k;
         for(k = 1; k <= no - i; ++k) {
            System.out.print("  ");
         }

         for(k = 1; k <= i; ++k) {
            System.out.print("* ");
         }

         System.out.println();
      }

   }
}
