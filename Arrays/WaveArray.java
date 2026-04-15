public class WaveArray {
    static void main() {
        int[] arr = {2, 4, 7, 8, 9, 10};

        convertToWave(arr);
    }

    static void convertToWave(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            if (i == arr.length) break;

            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
