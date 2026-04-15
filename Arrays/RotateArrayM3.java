public class RotateArrayM3 {

    public static void reverse (int[] arr,int a,int b ) {

        while(a<b){
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;

            a++;
            b--;
        }
    }

    public static void main(String[] args) {
        int[] arr={6,8,1,2,4,9,0};
        int n = arr.length;
        int d =3;
        d=d%n;

        reverse(arr,0,n-1);
        reverse(arr,0,n-d-1);
        reverse(arr,n-d,n-1);

        for (int ele:arr){
            System.out.print(ele+" ");
        }

    }
}
