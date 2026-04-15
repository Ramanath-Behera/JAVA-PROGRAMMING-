public class ProductOfArray {
    public static void product(int[] arr) {
        int prod =1;
        for (int i=0;i<arr.length;i++){
            prod *= arr[i];
        }
        System.out.println("Product of the array elements is : "+prod );
    }
    public static void main(String[] args) {
        int[] arr = {1,4,6,9,3,5,2};
        product(arr);
    }
}
