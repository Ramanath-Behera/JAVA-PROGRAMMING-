import java.util.Arrays;

public class ShallowAndDeepCopy {
    public static void main(String[] args) {

        ///int a =4;// 4 bytes

        //Shallow copy
        int[] arr = {7,5,8,5,8,3}; // 24 bytes
//        int[] x =arr;  // x is shallow copy of arr
//        x[0] = 3;
//        System.out.println(arr[0]);

        //Deep copy
        int[] deepCopy = Arrays.copyOf(arr,arr.length);
        System.out.println(arr[0]);

        deepCopy[0]=1;
        System.out.println(deepCopy[0]);
        System.out.println(arr[0]);

    }
}
