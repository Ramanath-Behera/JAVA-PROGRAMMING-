import java.util.Scanner;

public class DesiredReverse {
    public static void DesRev(int[] arr,int i,int j) {

        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
        }

        for (int ele :arr){
            System.out.print(ele+" ");
        }
    }

    public static void main(String[] args) {
//        int[] arr = {3,19,56,9,83,18,24,85,14};
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int sz = inp.nextInt();

        int[] arr = new int[sz];

        System.out.println("Enter Array elements :");
        for (int i =0;i<sz;i++){
            arr[i] = inp.nextInt();
        }

        System.out.println("Enter a : ");
        int a= inp.nextInt();

        System.out.println("Enter b : ");
        int b= inp.nextInt();

        DesRev(arr,a,b);




    }
}
