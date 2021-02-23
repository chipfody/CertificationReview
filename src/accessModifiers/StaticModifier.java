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

class YetMoreInitializationOrder {
    static {
        add(2);
    }

    static void add(int num) {
        System.out.print(num + " ");
    }

    YetMoreInitializationOrder() {
        add(5);
    }

    static {
        add(4);
    }

    {
        add(6);
    }

    static {
        new YetMoreInitializationOrder();
    }

    {
        add(8);
    }

    public static void main(String[] args) {
    }
}
/*
    There is no superclass, so we jump right to rule 2—the statics. There are three static blocks: on lines 2, 5, and 7.
    They run in that order. The static block on line 2 calls the add() method, which prints 2.
    The static block on line 5 calls the add() method, which prints 4. The last static block,
    on line 7, calls new to instantiate the object. This means we can go on to rule 3 to look at
    the instance variables and instance initializers. There are two of those: on lines 6 and 8.
    They both call the add() method and print 6 and 8, respectively. Finally, we go on to rule 4
    and call the constructor, which calls the add() method one more time and prints 5.
*/
