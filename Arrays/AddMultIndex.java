import java.util.Scanner;

/// Ques: Multiply odd indexed elements by
/// 2 and add 10 to even indexed elements


public class AddMultIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int sx = sc.nextInt();

        int[] arr = new int[sx];

        System.out.println("Enter array elements ");
        for (int i = 0; i < sx; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < sx; i++) {
            if (i % 2 == 0) arr[i] = 2 * arr[i];
            else arr[i] = 10 + arr[i];

            System.out.print(arr[i]+" ");
        }


    }
}
