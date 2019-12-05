package Variables;

import java.sql.SQLOutput;

public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        a += 10;
        System.out.println(a);

        int b = 100;
        b -= 7;
        System.out.println(b);

        int c = 44;
        c *= 2;
        System.out.println(c);

        int d = 125;
        d /= 5;
        System.out.println(d);

        int e = 8;
        e *= 8 * 8;
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        if (f1>f2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}
