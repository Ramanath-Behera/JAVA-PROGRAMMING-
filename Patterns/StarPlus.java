import java.util.Scanner;

public class StarPlus {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter row (odd):");
      int row = sc.nextInt();
      System.out.println("enter column (odd)");
      int col = sc.nextInt();

      for(int i = 1; i <= row; ++i) {
         for(int j = 1; j <= col; ++j) {
            if (i != row / 2 + 1 && j != col / 2 + 1) {
               System.out.print(" ");
            } else {
               System.out.print("*");
            }
         }

         System.out.println();
      }

   }
}
