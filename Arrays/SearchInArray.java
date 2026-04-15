import java.util.Scanner;

public class SearchInArray {
    public static void Find(int[] array , int x) {
        for (int  i =0;i<array.length;i++){
            if (array[i] == x){
                System.out.println(x+" found at "+ i+1 +" position.");
            }
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int sz = inp.nextInt();

        int[] arr = new int[sz];

        System.out.println("Enter Array elements :");
        for (int i =0;i<sz;i++){
            arr[i] = inp.nextInt();
        }

        System.out.println("Enter the element you want to find :");
        int E2f =inp.nextInt();
        Find(arr,E2f);
    }
}
