import java.util.Arrays;

public class SortArrayBuiltin {

    public static void print(int[] arr) {
        int x = arr.length;
        for (int i = 0; i < x; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /// Ascending sort
        int[] arr = {4, 8, 2, 6, 3, 7, 9};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
}
