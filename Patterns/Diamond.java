import java.util.Scanner;

public class Diamond {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number :");
      int n = sc.nextInt();
      int nsp = n - 1;
      int nst = 1;

      int i;
      int j;
      for(i = 1; i <= n; ++i) {
         for(j = 1; j <= nsp; ++j) {
            System.out.print("  ");
         }

         for(j = 1; j <= nst; ++j) {
            System.out.print("* ");
         }

         --nsp;
         nst += 2;
         System.out.println();
      }

      nsp = 1;
      nst = 2 * n - 3;

      for(i = 1; i <= n - 1; ++i) {
         for(j = 1; j <= nsp; ++j) {
            System.out.print("  ");
         }

         for(j = 1; j <= nst; ++j) {
            System.out.print("* ");
         }

         System.out.println();
         ++nsp;
         nst -= 2;
      }

   }
}
