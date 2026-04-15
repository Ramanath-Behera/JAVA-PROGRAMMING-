import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int sz  =sc.nextInt();

        int[] arr = new int[sz];

        System.out.println("Enter elements of array :");
        for (int i=0;i<sz;i++){
            arr[i]=sc.nextInt();
        }

        int min = Integer.MAX_VALUE;

        for (int i=0;i<sz;i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }

        System.out.println("Minimum element of array is : "+min);
    }
}
