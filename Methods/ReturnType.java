package JAVA_one.Methods;

// return type is mandatory if it is a int/float method

public class ReturnType {
    public static int Bolo() { //here Bolo is an integer having value 3
        System.out.print("Jay");
        System.out.println("Shree Ram");

        return 3;  //This is the end of function // return 3 doesnot means to print 3 rather it is the value of the method Bolo irrespective of whatever written inside the function
        // anything after it will not run and will cause error as unreachable statement

    }

    public static int demo2(int a) {
        System.out.println("shyam");
        if (a>0) return 1;
        else return 3;  // in JAVA when you are using if inside a int return type method it must have return type with else also.
    }
    public static int prod(int a, int b) {
        return a*b;
    }
    public static void main(String[] args) {

//        prod(3,1);
//        Bolo();             // it is doing 2 works:- prints the values inside sout as well as returns its value i.e 3 as its return type is int
//        System.out.println(Bolo());

        int x =demo2(7);
        System.out.println(x);
        System.out.println(2+x);


    }
}
