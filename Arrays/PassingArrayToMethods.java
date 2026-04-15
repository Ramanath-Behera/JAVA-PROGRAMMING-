public class PassingArrayToMethods {
    public static void change(int[] x) {
        x[2]=3;
    }

    public static void main(String[] args) {
        int[] arr = {7,8,9,45};

        System.out.println(arr[2]);
        change(arr);
        System.out.println(arr[2]);
    }
}
