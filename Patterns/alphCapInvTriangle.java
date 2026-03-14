import java.util.Scanner;

public class alphCapInvTriangle {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a numnber :");
      int v = sc.nextInt();
      int a = 0;

      for(int i = v; i > 0; --i) {
         for(int j = 1; j <= i; ++j) {
            System.out.print((char)(a + 65));
         }

         System.out.println();
         ++a;
      }

   }
}
