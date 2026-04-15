import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of the array :");
        int s = sc.nextInt();

        int[] arr = new int[s];

        System.out.println("Enter elements of array :");
        for (int i=0;i<s;i++){
            arr[i] = sc.nextInt();
        }

        int max= arr[0];

        for (int i=0;i<s;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println("Maximum ekement of the array is : "+max );
    }
}
