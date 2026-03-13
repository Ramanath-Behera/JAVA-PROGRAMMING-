import java.util.Scanner;

public class reverseNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        // Validate input
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            sc.close();
            return;
        }

        int num = sc.nextInt();
        int reversed = 0;

        // Reverse the number
        while (num != 0) {
            int rem = num % 10;         // Get last digit
            reversed = reversed * 10 + rem; // Append digit
            num /= 10;                  // Remove last digit
        }

        System.out.println("Reversed number: " + reversed);
        sc.close();
    }
}
