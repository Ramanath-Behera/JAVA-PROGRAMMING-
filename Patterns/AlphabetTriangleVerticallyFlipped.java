import java.util.Scanner;

public class AlphabetTriangleVerticallyFlipped {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number :");
      int alp = sc.nextInt();

      for(int i = 1; i <= alp; ++i) {
         int k;
         for(k = 1; k <= alp - i; ++k) {
            System.out.print("  ");
         }

         for(k = 65; k < 65 + i; ++k) {
            System.out.print((char)k + " ");
         }

         System.out.println();
      }

   }
}
