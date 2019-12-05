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

        //ha függvény if+else
        int f1 = 123;
        int f2 = 345;
        if (f1>f2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        int g1 = 350;
        int g2 = 200;
        if ((2*g2)>g1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //== ->összehasonlítás
        int h = 135798745;
        if (h%11==0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        int i1 = 10;
        int i2 = 3;
        //if (i1>i2*i2&(i1<(i2*i2*i2))) hatványozás!!!!
        if (i1 > Math.pow(i2, 2) && i1 < Math.pow(i2, 3)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        int j= 1521;
        if (j%3==0||j%5==0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
