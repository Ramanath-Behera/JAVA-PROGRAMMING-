import java.util.Scanner;

public class TwoSum {
    public static void Result(int[] arr, int target) {
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j] == target){
                    System.out.println(i +" and "+j);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thye size of the array :");
        int size=sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements :");
        for (int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target :");
        int target = sc.nextInt();

        Result(arr,target);
    }
}
