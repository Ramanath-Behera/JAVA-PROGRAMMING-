import java.util.Scanner;

public class ArrayOfOtherDataTypes {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter lenghth of the array : ");
        int sz = sc.nextInt();

//        float[] arr = new float[sz];

//        char[] arr = new char[sz];

//        double[] arr = new double[sz];

        String[] arr = new String[sz];

//        for (int j=0;j<sz;j++){
//            arr[j]=sc.nextFloat();  // change the input datatype as required...
//        }
        for (int i=0;i<sz;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
