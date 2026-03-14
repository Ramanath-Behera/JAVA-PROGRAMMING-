import java.util.Scanner;

public class StarPyramid {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number :");
      int num = sc.nextInt();
      int nsp = num - 1;
      int nst = 1;

      for(int i = 1; i <= num; ++i) {
         int j;
         for(j = 1; j <= nsp; ++j) {
            System.out.print(" ");
         }

         for(j = 1; j <= nst; ++j) {
            System.out.print("*");
         }

         --nsp;
         nst += 2;
         System.out.println();
      }

   }
}
