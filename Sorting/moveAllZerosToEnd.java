package JAVA_one.Sorting;

public class moveAllZerosToEnd {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, -2, 6, -1, 0, -3, 0, 8, 2, 0, 7, 3, 2};
        int n = arr.length;
        print(arr);

        for (int i = 1; i <= n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] == 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println();
        print(arr);
    }
}
