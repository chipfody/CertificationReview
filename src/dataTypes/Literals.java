package dataTypes;

import java.util.ArrayList;
import java.util.Iterator;

public class Literals {
}

class TwistInTaleNumberSystems {
    public static void main (String args[]) {
        int baseDecimal = 267;
        int octVal = 0413;
        int hexVal = 0x10B;
        int binVal = 0b100001011;
        System.out.println (baseDecimal + octVal);
        System.out.println (hexVal + binVal);

        char c1 = 122;
        char c2 = '\u0122';
        char c3 = (char)-122;
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println(c3);

        char char1 = 'a';
        System.out.println(char1);
        System.out.println(char1 + char1);
        System.out.println(char1 - char1);

        byte age1 = 10;
        byte age2 = 20;
        short sum = (short) (age1 + age2);

        int a = 20;
        int b = 10;
//        ++a;
//        b++;
        System.out.println(++a);
        System.out.println(b++);
        System.out.println(b);
    }
}

class TwistInTaleLLogicalOperators {
    public static void main (String args[]) {
        int a = 10;
        int b = 20;
        int c = 40;
        System.out.println("a = " + a + " b = " + b + " c = " + c);
        System.out.println(a++ > 10 || ++b < 30);
        System.out.println("a = " + a + " b = " + b + " c = " + c);
        System.out.println(a > 90 && ++b < 30);
        System.out.println("a = " + a + " b = " + b + " c = " + c);
        System.out.println(!(c>20) && a == 10 );
        System.out.println("a = " + a + " b = " + b + " c = " + c);
        System.out.println(a >= 99 || a <= 33 && b == 10);
        System.out.println("a = " + a + " b = " + b + " c = " + c);
        System.out.println(a >= 99 && a <= 33 || b == 21);
        System.out.println("a = " + a + " b = " + b + " c = " + c);

    }
}

class Unbox {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Double(12.12D));
        list.add(new Double(11.24D));
        Double total = Double.valueOf(0.0D);
        for (Iterator iterator = list.iterator(); iterator.hasNext(); ) {
            Double d = (Double) iterator.next();
            total = total.doubleValue() + d.doubleValue();
        }
        System.out.println(total);
    }
}



