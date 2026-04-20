package JAVA_one.Sorting;

public class descBubbleSort {
    public static void print(int[] arr){
        for (int ele : arr){
            System.out.print(ele);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5, -2, 6, 7, 2, 0, 7, 3, 2};
        int n = arr.length;
        print(arr);

        for (int i = 0; i < n - 1; i++) {   // outer loop (passes)
            int swap = 0;

            for (int j = 0; j < n - 1 - i; j++) {  // inner loop (comparisons)
                if (arr[j] < arr[j + 1]) { // descending
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }

            if (swap == 0) break;
        }

        print(arr);
    }
}
