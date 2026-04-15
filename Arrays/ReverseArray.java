public class ReverseArray {
    public static void Reverse(int[] arr) {
        int n = arr.length;
        int i = 0, j = n - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

//        for (int i=0;i<n/2;i++){
//            int temp = arr[i];
//            arr[i]=arr[n-1-i];
//            arr[n-1-i]=temp;
//        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 4, 8};

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        Reverse(arr);
    }
}
