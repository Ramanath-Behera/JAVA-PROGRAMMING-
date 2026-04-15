import java.util.Scanner;

public class IOjava {
    public static void main(String[] args) {
        int[] arr = {5, -8, 2, 67, -8, 3, 12};

//        int n = arr.length;

//        for (int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }

//        int[] ary = new int[7];  // created array of size 7 and initialized all values as 0
//        for (int i=0;i<7;i++){
//            System.out.print(ary[i]+" ");
//        }


        Scanner sc= new Scanner(System.in);
        int[] num = new int[5];

        for (int i=0;i<5;i++){
            int x =sc.nextInt();
            num[i]=x;
        }

        for (int i=0;i<5;i++){
//            System.out.print(num[2*i]+" "); is wrong is you want to print the doubled values as input
            System.out.print(2*num[i]+" ");
        }

    }
}
