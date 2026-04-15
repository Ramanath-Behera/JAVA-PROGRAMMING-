import java.util.Scanner;

public class SumElements {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter size of array :");
        int n = Sc.nextInt();

        int[] arr = new int[n];

        System.out.println("enter array ekements :");
        for (int i=0;i<n;i++){
            arr[i] = Sc.nextInt();
        }

        int sum=0;
        for (int i=0;i<n;i++){
            sum += arr[i];
        }

        System.out.println("Sum of elements of array is :"+sum);
    }
}
