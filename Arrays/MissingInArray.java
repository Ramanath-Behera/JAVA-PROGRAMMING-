public class MissingInArray {


    /// BAD LOGIC
//    public static int missingNum(int[] arr) {
//
//        int n = arr.length;
//        int i;
//        for (i = 1; i <= n+1; i++) {
//            for (int j = 0; j < n - 1; j++) {
//                if (arr[j] != i) break;
//            }
//        }
//        return i;
//    }

    public static int missingNum(int[] arr) {
        int n= arr.length+1; // total numbers including the missing one (numbers will be from 1 to n in the array

        long nSum = n*(n+1)/2;
        long arrSum = 0;
        for (int ele : arr){
            arrSum +=ele;
        }

        return (int)(nSum-arrSum); //type casted from long to int
    }

    public static void main(String[] args) {

        int[] arr = {8, 2, 4, 5, 3, 7, 1};
       System.out.println(missingNum(arr));
    }
}
