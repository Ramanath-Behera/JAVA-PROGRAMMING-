public class soln {

    //two pass soln
    public static void segregete0n1(int[] arr) {

        int n = arr.length;

        int num0 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) num0++;
        }

        for (int i = 0; i < num0; i++) {
            arr[i] = 0;
        }
        for (int i = n - num0; i < n; i++) {
            arr[i] = 1;
        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    // 2 pointer technique
    public static void segregeteM2(int[] arr) {
        int n = arr.length;

        int i = 0, j = n - 1;

        while (i < j) {
            if (arr[i] == 0) i++;
            else if (arr[j] == 1) j--;
            else if (arr[i] == 0 && arr[j] == 1) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }

        }
    }
}

public static void main(String[] args) {
    int[] arr = {0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1};
    soln.segregete0n1(arr);
    soln.segregeteM2(arr);
}
