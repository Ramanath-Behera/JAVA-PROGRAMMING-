import java.util.Scanner;

public class Bridge {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number : ");
      int num = sc.nextInt();

      int nsp;
      for(nsp = 1; nsp <= 2 * num - 1; ++nsp) {
         System.out.print("* ");
      }

      System.out.println();
      nsp = 1;

      for(int i = 1; i <= num - 1; ++i) {
         int j;
         for(j = num - 1; j >= i; --j) {
            System.out.print("* ");
         }

         for(j = 1; j <= nsp; ++j) {
            System.out.print("  ");
         }

         for(j = num - 1; j >= i; --j) {
            System.out.print("* ");
         }

         nsp += 2;
         System.out.println();
      }

   }
}
