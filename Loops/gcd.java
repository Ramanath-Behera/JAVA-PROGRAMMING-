import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number : ");
        int first = sc.nextInt();
        System.out.println("enter second number : ");
        int second = sc.nextInt();

        int factor = GCDof(first,second);
        System.out.println("gcd is : "+factor);

    }

    public static int GCDof(int num1,int num2) {

        int gcd=1;
        int small = (num1<num2)?num1:num2;

        int i=2;
        while(i<=small){
            if (num1%i==0 && num2%i==0){
                gcd = i;
            }
            i++;
        }
       return gcd;
    }


}
