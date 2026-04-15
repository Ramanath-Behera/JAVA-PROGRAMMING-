// M1 = using another array

public class RotateArrayM1 {
    public static void main(String[] args) {
        int[] arr = {3, 19, 56, 9, 83, 18, 24, 85, 14};

        int d=5;
        int n =arr.length;

        int[] arr2 = new int[n];

        for (int i=0;i<d;i++){
            arr2[n-d+i]=arr[i];
        }
        for (int i=0;i<n-d;i++){
            arr2[i] = arr[i+d];
        }
        for (int i=0;i<n;i++){
            arr[i]=arr2[i];
        }

        for (int a:arr){
            System.out.print(a+" ");
        }
    }
}
