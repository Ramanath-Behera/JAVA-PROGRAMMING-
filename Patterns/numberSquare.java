import java.util.Scanner;

public class numberSquare {
   public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
      System.out.print("Enter a number :");
      int num = inp.nextInt();

      for(int i = 1; i <= num; ++i) {
         for(int j = 1; j <= num; ++j) {
            System.out.print(j + " ");
         }

         System.out.println();
      }

   }
}
