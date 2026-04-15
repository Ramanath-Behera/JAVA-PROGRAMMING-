public class SecondMaxElement {
    public static void SecondMax(int[] arr) {
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        int second = Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if (arr[i]>second && arr[i]!=max) {
                second=arr[i];
            }
        }


        System.out.println("Second max element is "+second);
    }
    public static void main(String[] args) {
        int[] arr = {5,4,6,7,2,1};

        SecondMax(arr);
    }
}
