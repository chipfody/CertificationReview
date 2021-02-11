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

