import java.io.PrintStream;
import java.util.Scanner;

public class Spiral {
   public static void main() {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number :");
      int n = sc.nextInt();

      for(int i = 1; i <= 2 * n - 1; ++i) {
         for(int j = 1; j <= 2 * n - 1; ++j) {
            int a = i;
            int b = j;
            if (i > n) {
               a = 2 * n - i;
            }

            if (j > n) {
               b = 2 * n - j;
            }

            PrintStream var10000 = System.out;
            int var10001 = Math.min(a, b);
            var10000.print(var10001 + " ");
         }

         System.out.println();
      }

   }
}
