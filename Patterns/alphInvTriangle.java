import java.util.Scanner;

public class alphInvTriangle {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number :");
      int x = sc.nextInt();

      for(int i = x; i > 0; --i) {
         for(int j = 1; j <= i; ++j) {
            System.out.print((char)(j + 96) + " ");
         }

         System.out.println();
      }

   }
}
