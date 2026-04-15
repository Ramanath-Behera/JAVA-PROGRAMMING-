public class RotateArrayM2 {

    public static void reverse(int[] arr, int a, int b) {

        while (a < b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;

            a++;
            b--;
        }

    }

    public static void main(String[] args) {
        int[] arr = {3, 19, 56, 9, 83, 18, 24, 85, 14};
        int d = 5;
        int n = arr.length;

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);

        reverse(arr, 0, n - 1);


        for (int eek : arr) {
            System.out.print(eek + " ");
        }
    }
}
