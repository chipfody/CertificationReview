package dataTypes;

public class WorkingWithMethods {
}

class MyClass {
    double calcAverage(double marks1, int marks2) {
        return (marks1 + marks2)/2.0;
    }
    double calcAverage(int marks1, double marks2) {
        return (marks1 + marks2)/2.0;
    }
    public static void main(String args[]) {
        MyClass myClass = new MyClass();
        myClass.calcAverage(2.1, 3);
    }
}

class Employee {
    {
        System.out.println("Employee:initializer 2");
    }
    Employee() {
        System.out.println("Employee:constructor");
    }

    {
        System.out.println("Employee:initializer");
    }
}

class TestEmp {
    public static void main(String args[]) {
        Employee e = new Employee();
    }
}
