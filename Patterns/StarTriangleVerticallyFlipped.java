import java.util.Scanner;

public class StarTriangleVerticallyFlipped {
   public static void main(String[] args) {
      Scanner ac = new Scanner(System.in);
      System.out.println("Enter a number :");
      int num = ac.nextInt();

      for(int i = 1; i <= num; ++i) {
         for(int j = 1; j <= num; ++j) {
            if (i + j <= num) {
               System.out.print(" ");
            } else {
               System.out.print("*");
            }
         }

         System.out.println();
      }

   }
}
