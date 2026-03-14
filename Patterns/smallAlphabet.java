import java.util.Scanner;

public class smallAlphabet {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number :");
      int n = sc.nextInt();

      for(int i = 0; i < n; ++i) {
         for(int j = 0; j < n; ++j) {
            System.out.print((char)(97 + j) + " ");
         }

         System.out.println();
      }

   }
}
