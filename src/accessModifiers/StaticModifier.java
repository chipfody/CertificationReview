package accessModifiers;

public class StaticModifier {
}

class Emp {
    String name;
    static int bankVault;
    static int getBankVaultValue() {
        return bankVault;
    }

    static double interest(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    static double averageOfFirst100Integers() {
        int sum = 0;
        for (int i = 1; i <= 100; ++i) {
            sum += i;
        }
        return sum / 100;
    }
}

class TestEmp {
    public static void main(String[] args) {
        Emp emp = null;
        System.out.println(emp.bankVault);
        Emp emp1 = new Emp();
        Emp emp2 = new Emp();
        emp1.bankVault = 10;
        System.out.println(emp1.bankVault);
        emp2.bankVault = 20;
        System.out.println(emp2.bankVault);
        System.out.println(Emp.bankVault);
        System.out.println(Emp.averageOfFirst100Integers());
        System.out.println(Emp.interest(10.0, 34.6, 67.8));
    }
}


class Phone {
    static boolean softKeyboard = true;
}

class TestPhone {
    public static void main(String[] args) {
        Phone.softKeyboard = false;
        Phone p1 = new Phone();
        Phone p2 = new Phone();
        System.out.println(p1.softKeyboard);
        System.out.println(p2.softKeyboard);
        p1.softKeyboard = true;
        System.out.println(p1.softKeyboard);
        System.out.println(p2.softKeyboard);
        System.out.println(Phone.softKeyboard);
        Phone p3 = null;
        System.out.println(p3.softKeyboard);
    }
}


class Phone2 {
    String phoneNumber = "123456789";
    String setNumber () {
        String phoneNumber = "987654321";;
        return phoneNumber;
    }
}
class TestPhone2 {
    public static void main(String[] args) {
        Phone2 p1 = new Phone2();
        String methodCall = p1.setNumber();

        System.out.println (p1.phoneNumber);
        System.out.println(methodCall);
    }
}
