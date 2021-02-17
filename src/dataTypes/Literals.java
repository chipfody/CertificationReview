package dataTypes;

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
        System.out.print(char1 - char1);
    }
}


