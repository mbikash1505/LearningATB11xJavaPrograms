package ex_01_Java_Basic;

public class Lab004_Printf {
    public static void main(String[] args) {
        System.out.printf("hi");
        System.out.printf("hello");
        int a = 4;
        int b = 2;

        System.out.printf("%d", a);
        System.out.printf("Addition of both is %d + %d", a,b);

        // using printf statement we can formating the data like above
        // we cant do the same using Println
        // %d -> int, byte, long, short, - data type
        // %s -> String
        // %f -> float, double,
        // %b ->boolean


    }
}
